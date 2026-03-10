package org.example;

import org.example.exception.InvalidFeatureException;
import org.example.factory.FeatureFactory;
import org.example.feature.Feature;
import org.example.model.History;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number : ");

        int input;
        while (true){
            if (scan.hasNextInt()){
                input = scan.nextInt();
                break;
            }else {
                System.out.println("Invalid input. Insert an valid number : ");
                scan.next();
            }
        }
        History history = new History(input);
        while (true){
            System.out.println("Command : increment| decrement| double| undo| random| exit");
            String command = scan.next();

            if (command.equalsIgnoreCase("exit")){
                System.out.println("Exiting ......");
                history.printHistory();
                scan.close();
                return;
            }
            try {
                Feature feature = FeatureFactory.getFeature(command);
                feature.execute(history);
            } catch (InvalidFeatureException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(("Unexpected Error : " + e.getMessage()));
            }
        }
    }
}