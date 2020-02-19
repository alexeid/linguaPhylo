package james.parser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import james.graphicalModel.DeterministicFunction;
import james.graphicalModel.GraphicalModelNode;
import james.graphicalModel.Parameterized;
import james.graphicalModel.Value;

abstract public class ExpressionNode<T> extends DeterministicFunction<T> implements Parameterized {

	String expression;
	Map<String, Value> params;
	GraphicalModelNode[] inputValues;

	ExpressionNode() {
		
	}
	
	@Override
	public String getName() {
		// Anonymous expression
		return null;
	}

	@Override
	public Map<String, Value> getParams() {
		return new LinkedHashMap<>(params);
	}

	@Override
	public void setParam(String paramName, Value value) {
		((Value) params.get(paramName)).setValue(value);
	}

	@Override
	public String codeString() {
		return expression;
	}

	@Override
	public List<GraphicalModelNode> getInputs() {
		return new ArrayList<>(params.values());
	}
	
}