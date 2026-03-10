package org.example.feature;

import org.example.model.History;

/**
 * Abstract base class feature for implementing all the feature
 */

public abstract class BaseFeature implements Feature {

    protected FeatureType featureType;

    public BaseFeature(FeatureType featureType) {
        this.featureType = featureType;
    }

    /**
     * Print the current executing feature.
     */
    public void printFeature(){
        System.out.println("Executing Feature is : " + featureType.getFeatureName());
    }

    @Override
    public abstract void execute(History history);
}
