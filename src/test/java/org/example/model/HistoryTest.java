package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoryTest {

    @Test
    void shouldAddValueToHistory(){
        History history = new History(5);

        history.addHistory(5);
        history.addHistory(10);

        assertEquals(10, history.getCurrentValue());
    }

    @Test
    void shouldRemoveValueFromHistory(){
        History history = new History(5);

        history.addHistory(7);
        history.addHistory(8);
        history.removeLastValue(history);

        assertEquals(7, history.getCurrentValue());
    }
}
