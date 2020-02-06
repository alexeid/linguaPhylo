package james.graphicalModel;

import javax.swing.*;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public abstract class Func implements Parameterized, Viewable {

    public String getName() {
        FunctionInfo fInfo = getFunctionInfo();
        if (fInfo != null) return fInfo.name();
        return getClass().getSimpleName();
    }

    public String getDescription() {
        FunctionInfo fInfo = getFunctionInfo();
        if (fInfo != null) return fInfo.description();
        return "";
    }

    TreeMap<String, Value> paramMap = new TreeMap<>();

    public Map<String, Value> getParams() {
        return paramMap;
    }

    public void setParam(String paramName, Value value) {
        paramMap.put(paramName, value);
    }


    public FunctionInfo getFunctionInfo() {

        Class classElement = getClass();

        Method[] methods = classElement.getMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation instanceof FunctionInfo) {
                    return (FunctionInfo) annotation;
                }
            }
        }

        return null;

    }

    public String getRichDescription() {

        String html = "<html><h3>" + getName() + " function</h3> <ul>";
        html += "<li>" + getDescription();
        html += "</ul></html>";
        return html;
    }

    public JComponent getViewer() {
        return new JLabel(getRichDescription());
    }

    public String codeString() {
        Map<String, Value> map = getParams();

        Iterator<Map.Entry<String, Value>> iterator = map.entrySet().iterator();

        Map.Entry<String, Value> entry = iterator.next();

        StringBuilder builder = new StringBuilder();

        builder.append(getName() + "(" + entry.getValue().id);
        while (iterator.hasNext()) {
            entry = iterator.next();
            builder.append(", " + entry.getValue().id);
        }
        builder.append(");");
        return builder.toString();
    }

    public void print(PrintWriter p) {
        p.print(codeString());
    }

}