package lphy.core.functions;

import lphy.graphicalModel.*;
import lphy.graphicalModel.types.StringValue;

public class Split extends DeterministicFunction<String> {

    public static final String stringParamName = "str";
    public static final String regexParamName = "regex";
    public static final String indexParamName = "i";

    public Split(@ParameterInfo(name = stringParamName, description = "the string value to extract a substring matching the given pattern.", type=String.class) Value<String> str,
                 @ParameterInfo(name = regexParamName, description = "a regular expression", type=String.class) Value<String> regex,
                 @ParameterInfo(name = indexParamName, description = "the index of the substring to return", type=Integer.class) Value<Integer> i) {

        setParam(stringParamName, str);
        setParam(regexParamName, regex);
        setParam(indexParamName, i);
    }

    @Override
    @GeneratorInfo(name = "split", description = "A function to split a given string at the regular expressions and return the i'th substring of the resulting list.")
    public Value<String> apply() {

        String str = getString().value();
        String regex = getRegex().value();
        int i = getI().value();

        String[] parts = str.split(regex);
        if (parts.length > i) {
            return new StringValue(null, parts[i], this);
        } else {
            return new StringValue(null, "", this);
        }
    }

    public Value<String> getString() {
        return (Value<String>) paramMap.get(stringParamName);
    }

    public Value<String> getRegex() {
        return (Value<String>) paramMap.get(regexParamName);
    }

    public Value<Integer> getI() {
        return (Value<Integer>) paramMap.get(indexParamName);
    }
}
