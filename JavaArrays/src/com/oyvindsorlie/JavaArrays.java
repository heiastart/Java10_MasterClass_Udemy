package com.oyvindsorlie;

import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {

        // Arrays
        // All elements MUST be of SAME type!!!
        int[] arrInts = {2, 4, 5, 8};

        // Alternative way to create an array, which is empty at first (MUST specify size!!);
        int[] newArray = new int[5];
        String[] newStringArray = new String[5];
        newStringArray = new String[]{"Ole", "Per", "Frans", "Hans", "Knut", "Petter"};

        // Add stuff to the empty array;
        newArray[0] = 3;
        newArray[1] = 32;
        newArray[2] = 24;
        newArray[3] = 7;
        newArray[4] = 1;

        for (int i=0; i<newStringArray.length; i++){
            System.out.println(newStringArray[i]);
        }

        // How to sort the content of an array
        Arrays.sort(newStringArray);
        //System.out.println(arrInts.length);
        System.out.println("---------------------------");
        System.out.println("Så sortert;");

        for (String navn : newStringArray){
            System.out.println(navn);
        }
        System.out.println();
        System.out.println("Og for tall;");

        for (int i=0; i<newArray.length; i++){
            System.out.println("Tallet er: " + newArray[i]);
        }
        System.out.println("---------------------------");
        Arrays.sort(newArray);
        // or like this;
        for (int tall : newArray){
            System.out.println("Tallet er: " + tall);
        }
    }
}
