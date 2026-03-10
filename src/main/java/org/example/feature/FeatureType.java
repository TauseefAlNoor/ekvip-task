package org.example.feature;

import org.example.exception.InvalidFeatureException;

/**
 * Enum class represent all the feature type
 */

public enum FeatureType {
    INCREMENT("increment"),
    DECREMENT("decrement"),
    DOUBLE("double"),
    RANDOM("random"),
    UNDO("undo");

    private final String featureName;

    FeatureType(String featureName){
        this.featureName = featureName;
    }

    public String getFeatureName(){
        return featureName;
    }

    /**
     * Convert the input to Feature type
     * @param input an input representing feature
     * @return a FeatureType
     */
    public static FeatureType fromString(String input){
        for (FeatureType type: values()){
            if (type.featureName.equalsIgnoreCase(input)){
                return type;
            }
        }
        throw new InvalidFeatureException(input);
    }
}
