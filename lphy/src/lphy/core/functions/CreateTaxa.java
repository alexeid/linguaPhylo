package lphy.core.functions;

import lphy.evolution.Taxa;
import lphy.graphicalModel.DeterministicFunction;
import lphy.graphicalModel.GeneratorInfo;
import lphy.graphicalModel.ParameterInfo;
import lphy.graphicalModel.Value;

public class CreateTaxa extends DeterministicFunction<Taxa> {

    final String taxaParamName;
    final String speciesParamName;
    final String agesParamName;

    public CreateTaxa(@ParameterInfo(name = "names", description = "the taxa names") Value<String[]> taxa,
                      @ParameterInfo(name = "species", description = "the species of the taxa", optional=true) Value<String[]> species,
                      @ParameterInfo(name = "ages", description = "the ages of the taxa") Value<Double[]> ages) {
        taxaParamName = getParamName(0);
        speciesParamName = getParamName(1);
        agesParamName = getParamName(2);
        setParam(taxaParamName, taxa);
        if (species != null) setParam(speciesParamName, species);
        setParam(agesParamName, ages);
    }

    @GeneratorInfo(name="taxa",description = "A set of taxa with species and ages defined in parallel arrays.")
    public Value<Taxa> apply() {
        Value<String[]> names = (Value<String[]>)getParams().get(taxaParamName);
        Value<String[]> speciesValue = (Value<String[]>)getParams().get(speciesParamName);
        Value<Double[]> ages = (Value<Double[]>)getParams().get(agesParamName);

        final String[] species;
        if (speciesValue == null) {
            species = names.value();
        } else {
            species = speciesValue.value();
        }

        Taxa taxa = new Taxa() {
            @Override
            public int getDimension() {
                return ntaxa();
            }

            @Override
            public Double[] getAges() {
                return ages.value();
            }

            @Override
            public int ntaxa() {
                return names.value().length;
            }

            public String[] getTaxaNames() {
                return names.value();
            }

            public String[] getSpecies() {
                return species;
            }

            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("{");
                for (int i = 0; i < names.value().length; i++) {
                    if (i != 0) builder.append(", ");
                    builder.append(names.value()[i]);
                    builder.append("=");
                    builder.append(ages.value()[i]);
                }
                builder.append("};");
                return builder.toString();
            }
        };

        return new Value<>(null, taxa, this);
    }
}