package org.example.exception;

public class InvalidFeatureException extends IllegalArgumentException{

    private final String feature;

    public InvalidFeatureException(String feature){
        super("Invalid Feature: " + feature);
        this.feature = feature;
    }


    public String getFeature() {
        return feature;
    }
}
