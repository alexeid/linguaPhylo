package lphy.graphicalModel;

import java.util.List;

public interface GraphicalModelNode<T> {

    /**
     * inputs are the arguments of a function or distribution or the function/distribution that produced this model node value/variable.
     * @return
     */
    List<GraphicalModelNode> getInputs();

    /**
     * @return a unique string representing this graphical model node. For named variables it should be the name.
     */
    String getUniqueId();

    /**
     * @return current value of the Constant, DeterministicFunction (or GenerativeDistribution?)
     */
    T value();
}
