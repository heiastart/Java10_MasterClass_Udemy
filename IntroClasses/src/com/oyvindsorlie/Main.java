package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {

        // Creating a ball-OBJECT (an instance) from the Ball-class (aka the blueprint)
        //Ball ball = new Ball("blue","soccer",10,25);
        Basketball basketball = new Basketball();
        Baseball baseball = new Baseball();

        basketball.setColor("orange");
        basketball.setTypeName("Basketball");
        basketball.isNBA = true;
        System.out.println(basketball.isNBA());

        basketball.bounce();

    }
}
