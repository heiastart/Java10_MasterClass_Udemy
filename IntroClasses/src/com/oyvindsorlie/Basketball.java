package com.oyvindsorlie;

public class Basketball extends Ball {

    // Properties
    public boolean isNBA;
    private int capacity;

    // Behaviors
    public boolean isNBA(){
        if (isNBA == true){
            return true;
        }
        else {
            return false;
        }
    }

    // Override methods
    public void bounce(){
        System.out.println("Basketball bouncing...");
    }

}
