package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {

        //Tub tub = new Tub(26);
        //System.out.println(tub.getSize() + " is size of the tub");
        //System.out.println(tub.getBubbleColor() + " is the color of the bubble and " + tub.getBubbleRadius() + " is the size");

        Bathroom bathroom = new Bathroom(30);
        bathroom.setSize(50);
        System.out.println(bathroom.getSize() + " is size of bathroom");
        System.out.println(bathroom.getTubSize() + " is size of bathtub");

        // print out radius & color of bubble??
        //System.out.println(bathroom.getBubbleColor() + " is color of bubbles");
        //System.out.println(bathroom.getBubbleRadius() + " is radius of bubbles");
    }
}
