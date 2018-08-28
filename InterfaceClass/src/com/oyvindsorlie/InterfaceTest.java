package com.oyvindsorlie;

public class InterfaceTest {

    public static void main(String[] args) {
	// write your code here
        Dog myDog = new Dog();

        myDog.setName("Billie");
        System.out.println(myDog.getName());
        myDog.isFriendly();
    }

    // The structure of this project;
    /**
     * Animal - top class, aka superclass
     *   ||
     * Canine -> extends (i.e inherits from) animal
     *   ||
     *  Dog -> extends animal implicitly, via canine
     */
}
