package org.example.featureImpl;

import org.example.feature.BaseFeature;
import org.example.feature.FeatureType;
import org.example.model.History;

import java.util.Random;

/**
 * Implementation of adding random feature operation
 */
public class RandomNumberOperation extends BaseFeature {

    public RandomNumberOperation() {
        super(FeatureType.RANDOM);
    }

    @Override
    public void execute(History history){
        printFeature();

        Random random = new Random();
        int newValue = random.nextInt(1000);

        history.addHistory(newValue);
        history.printResult();
        history.printHistory();
    }
}
