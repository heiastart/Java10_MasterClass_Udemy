package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {
        float sum = 0;

        for (String argument : args){
            try {
                sum = sum + Float.parseFloat(argument);
            }
            catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println("Error message: " + e.getMessage());
                System.out.println(argument + " is not a number!");
            }
        }

        System.out.println("Sum is: " + sum);
    }
}
