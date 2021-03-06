package lphy.core.functions.datatype;

import jebl.evolution.sequences.SequenceType;
import lphy.graphicalModel.DeterministicFunction;
import lphy.graphicalModel.GeneratorInfo;
import lphy.graphicalModel.Value;

public class NucleotidesFunction extends DeterministicFunction<SequenceType> {

    public NucleotidesFunction() {}

    @GeneratorInfo(name = "nucleotides",
            verbClause = "is",
            narrativeName = "nucleotide data type",
            description = "The nucleotide data type.")
    public Value<SequenceType> apply() {
        return new Value<>(null, SequenceType.NUCLEOTIDE, this);
    }
}
