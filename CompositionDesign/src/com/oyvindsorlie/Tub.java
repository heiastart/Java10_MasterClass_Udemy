package com.oyvindsorlie;

public class Tub {
    // CLASS VARIABLES
    private int size;
    private Bubble bubble;       // Here, we follow the composition design


    // CONSTRUCTOR
    public Tub(int size) {
        this.size = size;
        bubble = new Bubble();
        bubble.setColor("blue");
        bubble.setRadius(15);
    }

    public Tub() {

    }


    // GETTERS & SETTERS
    public String getBubbleColor(){
        return bubble.getColor();
    }

    public int getBubbleRadius(){
        return bubble.getRadius();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
