package org.example.factory;

import org.example.feature.Feature;
import org.example.feature.FeatureType;
import org.example.featureImpl.*;

/**
 * A Factory class for feature implementation
 */
public class FeatureFactory {

    public static Feature getFeature(String input) {

        FeatureType featureType = FeatureType.fromString(input);

        return switch (featureType) {
            case INCREMENT -> new IncrementOperation();
            case DECREMENT -> new DecrementOperation();
            case DOUBLE -> new DoubleOperation();
            case RANDOM -> new RandomNumberOperation();
            case UNDO -> new UndoOperation();
        };
    }
}
