package com.oyvindsorlie;

public interface Pet {

    // Abstract methods need to/MUST be implemented when they are in a class that can be instantiated...in a non-abstract or concrete class
    abstract void isFriendly(); // NO body in the function, since it'a an abstract method
    abstract void play();
}
