package james.graphicalModel;

/**
 * Created by adru001 on 24/01/20.
 */
public interface GraphicalModelNodeVisitor {
    void visitValue(Value value);

    void visitGenDist(GenerativeDistribution genDist);

    void visitFunction(Function f);
}