package com.oyvindsorlie;

public class Ball {
    // This class is mapping the object ball, hence we need properties describing the ball (aka this class). We dont't have the object ball yet,
    // i.e with only this file/class, this file is like a cookie cutter.

    /*
        Different access modes:
        Public - anyone (any class) have access
        Private - only access within the class :)
     */

    // Children classes
    // Properties or instance variables - should be private
    private String color;
    private String typeName;
    private int bounceRate;
    //private int capacity;


    // CONSTRUCTORS
    // Default constructor to fix Basketball error...
    public Ball(){

    }

    // Constructor for the ball class
    public Ball(String color, String typeName, int bounceRate) {
        this.color = color;
        this.typeName = typeName;
        this.bounceRate = bounceRate;
        //this.capacity = capacity;
    }

    // "Overloaded" constructor
    public Ball(String color, String typeName){
        this.color = color;
        this.typeName = typeName;
        //this.capacity = capacity;
    }


    // GETTERS & SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }


    // BEHAVIORS
    public void bounce(){
        System.out.println("Bouncing");
    }

    public void deflate(){
        System.out.println("Deflating...");
    }

    public void inflate(){
        System.out.println("Inflating...");
    }
}
