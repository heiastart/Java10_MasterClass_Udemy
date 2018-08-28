package com.oyvindsorlie;

// Outer class
public class Ball {

    private String ballName;
    private int ballSize;

    public String getBallName() {
        return ballName;
    }

    public void setBallName(String ballName) {
        this.ballName = ballName;
    }

    public int getBallSize() {
        return ballSize;
    }

    public void setBallSize(int ballSize) {
        this.ballSize = ballSize;
    }

    // Constructors
    public Ball(){}

    public Ball(String name, int size){
        ballName = name;
        ballSize = size;
    }

    // Methods
    @Deprecated
    public void bounce(){
        // This method belongs to the Annotations-video
        System.out.println("Ball bouncing!");
    }

    public void setupBall(){
        new OrangeBall().setupOrangeBall();
    }

    // Inner class
    class OrangeBall{
        public void setupOrangeBall(){
            ballName = "Inside inner class ball";
            ballSize = 23;

            System.out.println(ballName + ", " + ballSize);
        }
    }
}
