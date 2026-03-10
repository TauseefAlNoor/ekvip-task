package org.example.featureImpl;

import org.example.feature.BaseFeature;
import org.example.feature.FeatureType;
import org.example.model.History;

/**
 * Implementation of the decrement feature operation
 */
public class DecrementOperation extends BaseFeature {

    public DecrementOperation() {
        super(FeatureType.DECREMENT);
    }

    @Override
    public void execute(History history){
        printFeature();

        int current = history.getCurrentValue();
        int newValue = current - 1;

        history.addHistory(newValue);
        history.printResult();
        history.printHistory();
    }
}
