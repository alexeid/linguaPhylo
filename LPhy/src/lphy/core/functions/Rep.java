package lphy.core.functions;

import lphy.graphicalModel.*;

import java.lang.reflect.Array;
import java.util.*;

public class Rep<U> extends DeterministicFunction<U[]> {

    private final String xParamName = "element";
    private final String timesParamName = "times";
    private Value<U> x;
    private Value<Integer> times;

    public Rep(@ParameterInfo(name = xParamName, description = "the element to replicate.") Value<U> x,
               @ParameterInfo(name = timesParamName, description = "the standard deviation of the distribution.") Value<Integer> times) {

        this.x = x;
        if (x == null) throw new IllegalArgumentException("The element can't be null!");
        this.times = times;
        if (times == null) throw new IllegalArgumentException("The times can't be null!");
    }

    @GeneratorInfo(name = "rep", description = "The replication function. Takes a value and an integer representing the number of times to replicate the value. Returns a vector of the value repeated the specified number of times.")
    public Value<U[]> apply(Value<U> v, Value<Integer> times) {

        Class c = v.value().getClass();
        U[] array = (U[]) Array.newInstance(c, times.value());
        Arrays.fill(array, v.value());

        return new Value<>( array, this);
    }

    public java.util.Map<String, Value> getParams() {
        SortedMap<String, Value> map = new TreeMap<>();
        map.put(xParamName, x);
        map.put(timesParamName, times);
        return map;
    }

    public void setParam(String paramName, Value value) {
        if (paramName.equals(xParamName)) x = value;
        else if (paramName.equals(timesParamName)) times = value;
        else throw new RuntimeException("Unrecognised parameter name: " + paramName);
    }

    public Value<U[]> apply() {
        return apply(x, times);
    }
}