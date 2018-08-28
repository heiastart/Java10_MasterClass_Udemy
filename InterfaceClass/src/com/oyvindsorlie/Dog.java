package com.oyvindsorlie;

public class Dog extends Canine implements Pet {

    /** Overrides are examples of annotations - code that are read directly by the compiler. Annotations are denoted by the @-symbol.
     *  The most used annotations are;
     *      Override
     *      Deprecated -> something that should not be used any longer
     *      Suppress warnings
      */

    @Override
    public void isFriendly() {
        System.out.println("Friendly dog");
    }

    @Override
    public void play() {
        System.out.println("Playful dog");
    }
}
