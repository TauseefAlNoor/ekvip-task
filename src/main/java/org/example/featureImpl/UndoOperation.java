package org.example.featureImpl;

import org.example.feature.BaseFeature;
import org.example.feature.FeatureType;
import org.example.model.History;

/**
 * Implementation of the undo feature operation
 */
public class UndoOperation extends BaseFeature {
    public UndoOperation() {
        super(FeatureType.UNDO);
    }

    @Override
    public void execute(History history){
        printFeature();

        history.removeLastValue(history);
        history.printResult();
        history.printHistory();
    }
}
