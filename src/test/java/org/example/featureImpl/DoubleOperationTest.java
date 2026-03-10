package org.example.featureImpl;

import org.example.model.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleOperationTest {

    @Test
    void ShouldDoubleTest(){
        History history = new History(5);

        DoubleOperation doubleOperation = new DoubleOperation();
        doubleOperation.execute(history);

        assertEquals(10, history.getCurrentValue());
    }
}
