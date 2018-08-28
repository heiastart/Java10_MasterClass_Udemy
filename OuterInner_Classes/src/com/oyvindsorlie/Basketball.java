package com.oyvindsorlie;

public class Basketball extends Ball{


    @Override // Method here MUST have same name as the one in the parent-class Ball...if not, it can't override it ;)
    public void bounce(){
        System.out.println("Basketball bouncing!!");
    }
}
