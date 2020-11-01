package lphy.graphicalModel;


import javax.swing.*;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Func implements Generator {

    private String name = null;
    private String description = null;

    public String getName() {
        if (name == null) {
            GeneratorInfo fInfo = Generator.getGeneratorInfo(getClass());
            if (fInfo != null) {
                name = fInfo.name();
            } else name = getClass().getSimpleName();
        }
        return name;
    }

    public String getDescription() {
        if (description == null) {
            GeneratorInfo fInfo = Generator.getGeneratorInfo(getClass());
            if (fInfo != null) {
                description = fInfo.name();
            } else description = getClass().getSimpleName();
        }
        return description;
    }

    protected TreeMap<String, Value> paramMap = new TreeMap<>();

    public Map<String, Value> getParams() {
        return paramMap;
    }

    public void setParam(String paramName, Value value) {
        paramMap.put(paramName, value);
    }

    public String codeString() {
        Map<String, Value> map = getParams();

        StringBuilder builder = new StringBuilder();
        builder.append(getName());
        builder.append("(");

        Constructor[] constructors = getClass().getConstructors();

        if (constructors.length == 1) {
            List<ParameterInfo> parameterInfoList = getParameterInfo(0);
            if (parameterInfoList.size() > 0) {
                int paramCount = 0;

                String name = parameterInfoList.get(0).name();

                if (parameterInfoList.get(0).optional() && map.get(name) == null) {
                    // DO NOTHING - this is an optional parameter with no value
                } else {
                    builder.append(Generator.getArgumentCodeString(name, map.get(name)));
                    paramCount += 1;
                }
                for (int i = 1; i < parameterInfoList.size(); i++) {
                    name = parameterInfoList.get(i).name();
                    if (parameterInfoList.get(i).optional() && map.get(name) == null) {
                        // DO NOTHING - this is an optional parameter with no value
                    } else {
                        if (paramCount > 0) builder.append(", ");
                        builder.append(Generator.getArgumentCodeString(name, map.get(name)));
                        paramCount += 1;
                    }
                }
            }
        } else {
            Iterator<Map.Entry<String, Value>> iterator = map.entrySet().iterator();
            if (iterator.hasNext()) {
                Map.Entry<String, Value> entry = iterator.next();

                builder.append(Generator.getArgumentCodeString(entry));
                while (iterator.hasNext()) {
                    entry = iterator.next();
                    builder.append(", ");
                    builder.append(Generator.getArgumentCodeString(entry));
                }
//            }
            }
        }
        builder.append(")");
        return builder.toString();
    }
}
