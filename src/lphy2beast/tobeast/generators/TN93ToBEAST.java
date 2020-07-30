package lphy2beast.tobeast.generators;

import beast.core.BEASTInterface;
import beast.core.parameter.RealParameter;
import lphy2beast.BEASTContext;
import lphy2beast.GeneratorToBEAST;
import lphy.evolution.substitutionmodel.TN93;

public class TN93ToBEAST implements GeneratorToBEAST<TN93> {
    @Override
    public BEASTInterface generatorToBEAST(TN93 tn93, BEASTInterface value, BEASTContext context) {

        beast.evolution.substitutionmodel.TN93 beastTn93 = new beast.evolution.substitutionmodel.TN93();
        beastTn93.setInputValue("kappa1", context.getBEASTObject(tn93.getKappa1()));
        beastTn93.setInputValue("kappa2", context.getBEASTObject(tn93.getKappa2()));
        beastTn93.setInputValue("frequencies", BEASTContext.createBEASTFrequencies((RealParameter) context.getBEASTObject(tn93.getFreq())));
        beastTn93.initAndValidate();
        return beastTn93;
    }

    @Override
    public Class<TN93> getGeneratorClass() {
        return TN93.class;
    }
}