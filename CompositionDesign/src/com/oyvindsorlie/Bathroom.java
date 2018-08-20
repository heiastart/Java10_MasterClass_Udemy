package com.oyvindsorlie;

public class Bathroom {
    private int size;
    private Tub bathtub;

    public Bathroom(int size) {
        this.size = size;
        bathtub = new Tub();
        bathtub.setSize(26);
    }

    public int getTubSize(){
        return bathtub.getSize();
    }

    public String getBubbleColor(){
        return bathtub.getBubbleColor();
    }

    public int getBubbleRadius(){
        return bathtub.getBubbleRadius();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
