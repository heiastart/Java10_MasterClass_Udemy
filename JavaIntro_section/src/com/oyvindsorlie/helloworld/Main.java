package com.oyvindsorlie.helloworld;

public class Main {

    public static void main(String[] args){

        //String - collection of characters, words or sentences.
        String myName = "Øyvind";
        String mySister = "Anne";

        //Char - a character, i.e a SINGLE sign like a letter, symbol etc. NB; MUST use single quotes!!!
        char myChar = 'd';

        //Int - most used (32 bit or 4 bytes)
        int myNumber = 12;
        int anotherNumber = 123;
        int sum = myNumber + anotherNumber;

        //Byte - smallest type (8 bit or 1 byte), must be less than 2^7 = 128 (siden signed -> minus og pluss verdier)
        byte myByte = 127;

        //Short - double size of byte (16 bit or 2 bytes), must be less than 2^15 = 32.768
        short myShort = 32767;

        //Float - desimal/fraction numbers. NB; remember the f after the value, if not it's a double!!!!
        float piNum = 3.14f;

        //Double - also a desimal number, but bigger than float....use f.ex for currency and mathematics
        double myDouble = 23.89;

        //Boolean -> true (1) or false (0) value.
        boolean myBool = true;

        if (myBool){
            System.out.println("true");
        }


        System.out.println(myName + " " + mySister);
    }
}
