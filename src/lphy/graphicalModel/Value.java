package lphy.graphicalModel;

import lphy.app.DoubleArrayLabel;
import lphy.app.HasComponentView;
import lphy.app.IntegerArrayLabel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by adru001 on 18/12/19.
 */
public class Value<T> implements GraphicalModelNode<T>, Viewable {

    private T value;
    String id;
    List<ValueListener> listeners = new ArrayList<>();
    List<GraphicalModelNode> outputs = new ArrayList<>();

    // the function that produced this value, or null if this value was initialized another way;
    DeterministicFunction<T> function = null;

    public Value(String id, T value) {
        this.id = id;
        this.value = value;
    }

    public Value(String id, T value, DeterministicFunction<T> function) {
        this(id, value);
        this.function = function;
    }

    public final Class getType() {
        return value.getClass();
    }

    /**
     * Constructs an anonymous value.
     * @param value
     * @param function
     */
    public Value(T value, DeterministicFunction<T> function) {
        this(null, value);
        this.function = function;
    }

    public final T value() {
        return value;
    }

    public String getLabel() {
        if (isAnonymous()) {
            if (getOutputs().size() > 0) {
                return "[" + ((Generator) getOutputs().get(0)).getParamName(this) + "]";
            } else return "[anonymous]";
        } else return getId();
    }

    public String codeString() {
        StringBuilder builder = new StringBuilder();
        if (function != null) {
            if (!isAnonymous()) builder.append(id + " = ");
            builder.append(function.codeString());
        } else {
            builder.append(toString());
        }
        return builder.toString();
    }

    public String toString() {
        if (isAnonymous()) return value.toString();
        return id + " = " + value;
    }

    public void setValue(T value) {
        this.value = value;
        for (ValueListener listener : listeners) {
            listener.valueSet();
        }
    }

    public JComponent getViewer() {
        if (value instanceof HasComponentView) {
            JComponent component = ((HasComponentView<T>) value).getComponent(this);
            return component;
        }

        if (value() instanceof Double[]) {
            return new DoubleArrayLabel((Value<Double[]>)this);
        }

        if (value() instanceof Integer[]) {
            return new IntegerArrayLabel((Value<Integer[]>)this);
        }

        if (value.toString().length() < 130) {
            return new JLabel(value.toString());
        } else {
            String valueString = value.toString();
            valueString = valueString.replace(", ", ",\n");

            JTextArea textArea = new JTextArea(valueString);
            textArea.setEditable(false);

            return textArea;
        }
    }

    // returns a unique id for this value for internal purposes.
    public String getUniqueId() {
        if (!isAnonymous()) return getId();
        return hashCode() + "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Generator<T> getGenerator() {
        return function;
    }

    /**
     * @return true if this value is a random variable, or the function of a random value.
     */
    public boolean isRandom() {
        return (this instanceof RandomVariable) || (function != null && function.hasRandomParameters());
    }

    public void addValueListener(ValueListener listener) {
        listeners.add(listener);
    }

    public static void traverseGraphicalModel(Value value, GraphicalModelNodeVisitor visitor, boolean post) {
        if (!post) visitor.visitValue(value);

        if (value.getGenerator() != null) {
            traverseGraphicalModel(value.getGenerator(), visitor, post);
        }
        if (post) visitor.visitValue(value);
    }

    private static void traverseGraphicalModel(Generator generator, GraphicalModelNodeVisitor visitor, boolean post) {
        if (!post) visitor.visitGenerator(generator);

        Map<String, Value> map = generator.getParams();

        for (Map.Entry<String, Value> e : map.entrySet()) {
            traverseGraphicalModel(e.getValue(), visitor, post);
        }
        if (post) visitor.visitGenerator(generator);
    }

    public void addOutput(Generator p) {
        if (!outputs.contains(p)) outputs.add(p);
    }

    public void removeOutput(Generator p) {
        outputs.remove(p);
    }

    public List<GraphicalModelNode> getOutputs() {
        return outputs;
    }

    @Override
    public List<GraphicalModelNode> getInputs() {
        if (function != null) return Collections.singletonList(function);
        return new ArrayList<>();
    }

    public boolean isAnonymous() {
        return id == null || id.equals("");
    }

    public boolean isConstant() {
        return !(this instanceof RandomVariable) && getGenerator() == null;
    }

    public void setFunction(DeterministicFunction f) {
        this.function = f;
    }
}