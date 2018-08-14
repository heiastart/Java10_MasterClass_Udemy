package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {

        int number[] = {2, 4, 8, 16, 32, 64, 128, 256};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++){
            try {
                System.out.println(number[i] + " / " + denom[i] + " is " + number[i] / denom[i]);
            }
            catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No corresponding element found......");
            }
            // Can have as many catch-blocks as we need...but;
            finally {
                // Will ALWAYS run!!
                // For code that need to run in the end, e.g closing a connection to a database after fetching the data...
                System.out.println("Running!!!");
            }
        }











        /*
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
            catch (Exception e){

            }
        }

        System.out.println("Sum is: " + sum);
        */
    }
}
