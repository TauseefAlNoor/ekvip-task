package org.example.featureImpl;

import org.example.model.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecrementOperationTest {

    @Test
    void shouldDecrementValue(){
        History history = new History(5);

        DecrementOperation decrementOperation = new DecrementOperation();

        decrementOperation.execute(history);

        assertEquals(4, history.getCurrentValue());
    }
}
