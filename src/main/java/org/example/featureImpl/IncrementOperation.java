package org.example.featureImpl;

import org.example.feature.BaseFeature;
import org.example.feature.FeatureType;
import org.example.model.History;

/**
 * Implementation of the increment feature operation
 */
public class IncrementOperation extends BaseFeature {

    public IncrementOperation() {
        super(FeatureType.INCREMENT);
    }

    @Override
    public void execute(History history){
        printFeature();

        int current = history.getCurrentValue();
        int newValue = current + 1;

        history.addHistory(newValue);
        history.printResult();
        history.printHistory();
    }
}
