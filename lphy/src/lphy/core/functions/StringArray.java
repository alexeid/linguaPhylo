package lphy.core.functions;

import lphy.graphicalModel.DeterministicFunction;
import lphy.graphicalModel.GeneratorInfo;
import lphy.graphicalModel.Value;
import lphy.graphicalModel.types.StringArrayValue;

public class StringArray extends DeterministicFunction<String[]> {

    Value<String>[] x;

    public StringArray(Value<String>... x) {

        int length = x.length;
        this.x = x;

        for (int i = 0; i < length; i++) {
            setInput(i + "", x[i]);
        }
    }

    @GeneratorInfo(name = "stringArray", description = "The constructor function for an array of strings.")
    public Value<String[]> apply() {

        String[] values = new String[x.length];

        for (int i = 0; i < x.length; i++) {
            values[i] = x[i].value();
        }

        return new StringArrayValue(null, values, this);
    }

    public void setParam(String param, Value value) {
        super.setParam(param, value);
        int i = Integer.parseInt(param);
        x[i] = value;
    }

    public String codeString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(ref(x[0]));
        for (int i = 1; i < x.length; i++) {
            builder.append(", ");
            builder.append(ref(x[i]));
        }
        builder.append("]");
        return builder.toString();
    }

    private String ref(Value<?> val) {
        if (val.isAnonymous()) return val.codeString();
        return val.getId();
    }
}
