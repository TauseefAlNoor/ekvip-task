package org.example.featureImpl;

import org.example.model.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoOperationTest {

    @Test
    void shouldUndoTest(){
        History history = new History(5);
        new IncrementOperation().execute(history);
        new DecrementOperation().execute(history);

        new UndoOperation().execute(history);

        assertEquals(6, history.getCurrentValue());
    }
}
