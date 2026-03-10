package org.example.featureImpl;

import org.example.feature.BaseFeature;
import org.example.feature.FeatureType;
import org.example.model.History;

/**
 * Implementation of the double feature operation
 */
public class DoubleOperation extends BaseFeature {
    public DoubleOperation() {
        super(FeatureType.DOUBLE);
    }

    @Override
    public void execute(History history){
        printFeature();

        int current = history.getCurrentValue();
        int newValue = current *2;

        history.addHistory(newValue);
        history.printHistory();
        history.printResult();
    }
}
