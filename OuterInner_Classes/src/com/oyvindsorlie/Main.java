package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ball ball = new Ball();
        Ball soccer = new Ball("Soccerball", 16);

        Basketball basketball = new Basketball();
        ball.bounce();
        basketball.bounce();

        //ball.setupBall();
        //System.out.println(soccer.getBallName() + " " + soccer.getBallSize());
    }
}
