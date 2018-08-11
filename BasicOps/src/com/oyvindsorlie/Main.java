package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {
        //evenOdd();
        myName("Øyvind");
        //System.out.println("Arealet er " + getArea(24,43) + " m2.");
        System.out.println("My truth: " + isTrue(true,true));

    }

    // METHODS/FUNCTIONS
    // Void - returns nothing
    public static void myName(String name){

        System.out.println(name);
    }

    private static void evenOdd(int a){
        for (int i = 0; i < a; i++){
            //Printing out even/odd numbers
            if (i % 2 == 0){
                System.out.println(i + " is even");
            }
            else if (i % 2 != 0){
                System.out.println(i + " is odd");
            }
        }

    }

    // Returns area-value of type int
    public static int getArea(int width, int height){
        int area = width * height;
        return area;
    }

    // Returns boolean - true or false
    public static boolean isTrue(boolean a, boolean b){
        if (a != b){
            return a;
        }
        else {
            return b;
        }
    }
}
