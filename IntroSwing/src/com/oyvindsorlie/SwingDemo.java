package com.oyvindsorlie;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {

    // Constructor for this class - will be called in main
    public SwingDemo(){

        // Create a new JFrame container
        JFrame jFrame = new JFrame("MyFirstGUI");

        // Give the GUI a size (default is 0,0)
        jFrame.setSize(1280, 800);

        // Specify FlowLayout for the layout manager - we objectify the FlowLayout class directly in the setLayout method
        jFrame.setLayout(new FlowLayout());

        // Show it!!
        jFrame.setVisible(true);

        // Create a JLabel + adding it to our jFrame canvas
        JLabel jLabel = new JLabel("Heilt fantastisk!!!");
        jFrame.add(jLabel);

        // Terminate application by closing the window
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // SwingDemo firstGUI = new SwingDemo(); -> not recommended way!!
        // Create the frame/GUI on the event dispatching thread - safer way to instanciate the class and the constructor -> ensures that everything runs smoothly without having critical interrupts etc

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SwingDemo();

            }
        });

    }
}
