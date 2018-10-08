package com.oyvindsorlie;
import javax.swing.*;

public class Runner {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonFrame("Button Demo");
            }
        });
    }
}
