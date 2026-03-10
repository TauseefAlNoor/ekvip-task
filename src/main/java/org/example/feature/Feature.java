package org.example.feature;

import org.example.model.History;

/**
 * Implements command that can modify the application state.
 */
public interface Feature {
    /**
     * Execute operation to get history state.
     * @param history
     */
    void execute(History history);
}
