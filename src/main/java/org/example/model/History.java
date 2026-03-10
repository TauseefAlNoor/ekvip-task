package org.example.model;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  A History class to maintain the history of called feature operation
 */
public class History {

    private final Deque<Integer>  values = new ArrayDeque<>();

    public History( int value){
        values.push(value);
    }

    /**
     * Return the current operational value
     * @return an integer top from the queue
     */
    public int getCurrentValue(){
        return values.peek();
    }

    /**
     * Remove the last value from the queue
     * @param historyValue hastory queue
     */
    public void removeLastValue(History historyValue){

        if (historyValue.values.size() > 1){
            historyValue.values.pop();
        } else {
            System.out.println("Nothing to undo.");
        }

        historyValue.getCurrentValue();
    }

    /**
     * Add a new value to the queue
     * @param value a queue
     */
    public void addHistory(int value){
        values.push(value);
    }

    /**
     * Print the list queue history
     */
    public void printHistory(){
        System.out.println("History : "+values);
    }

    /**
     * Print the current result
     */
    public void printResult(){
        System.out.println("Result: "+getCurrentValue());
    }
}
