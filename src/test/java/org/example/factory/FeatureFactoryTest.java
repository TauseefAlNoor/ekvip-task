package org.example.factory;

import org.example.feature.Feature;
import org.example.featureImpl.DecrementOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class FeatureFactoryTest {

    @Test
    void shouldTestDecrementFeature(){
        Feature feature = FeatureFactory.getFeature("Decrement");

        assertInstanceOf(DecrementOperation.class, feature);
    }
}
