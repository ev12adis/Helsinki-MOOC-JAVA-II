/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */

import java.util.ArrayList;

public class Calculator {
    private Reader reader;
    private int numOperations;
    
    public Calculator() {
        this.reader = new Reader();
        this.numOperations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    

    private void sum(){
        int[] values = input();
        int sum = values[0] + values[1];
        System.out.println("sum of the values " + sum);
    }
    
    private void difference(){
        int[] values = input();
        int difference = values[0] - values[1];
        System.out.println("difference of the values " + difference);
    }
    
    private void product(){
        int[] values = input();
        int product = values[0] * values[1];
        System.out.println("product of the values " + product);
    }
    
        private void statistics(){
        System.out.println("Calculations done " + numOperations);
    }
    
    private int[] input(){
        numOperations++;
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    }
}
