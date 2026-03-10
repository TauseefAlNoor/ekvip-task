package org.example.featureImpl;

import org.example.model.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementOperationTest {

    @Test
    void shouldIncrementValue(){
        History history = new History(5);
        IncrementOperation incrementOperation = new IncrementOperation();
        incrementOperation.execute(history);

        assertEquals(6, history.getCurrentValue());
    }
}
