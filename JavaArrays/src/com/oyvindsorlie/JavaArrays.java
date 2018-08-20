package com.oyvindsorlie;

public class JavaArrays {

    public static void main(String[] args) {

        // Arrays
        // All elements MUST be of SAME type!!!
        int[] arrInts = {2, 4, 5, 8};

        // Alternative way to create an array, which is empty at first (MUST specify size!!);
        int[] newArray = new int[5];
        String[] newStringArray = new String[5];

        // Add stuff to the empty array;
        newArray[0] = 3;
        newArray[1] = 32;
        newArray[2] = 24;
        newArray[3] = 7;
        newArray[4] = 1;

        //System.out.println(arrInts.length);

        for (int i=0; i<arrInts.length; i++){
            System.out.println("Item #" + (i + 1) + " = " + arrInts[i]);
        }

        // or like this;
        for (int tall : arrInts){
            System.out.println("Tallet er: " + tall);
        }
    }
}
