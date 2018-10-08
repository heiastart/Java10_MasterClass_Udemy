package com.oyvindsorlie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame implements ActionListener {

    JLabel jLabel;      // Declaring an instance variable (outside the const.), which gives us ACCESS to it regardless of where in the code we are :)
    JTextField jTextField;

    // Constructor with title
    public ButtonFrame(String title) throws HeadlessException {
        super(title);   // Invokes the JFrame constructor
        setLayout(new FlowLayout());
        setSize(640,480);

        // JLabel -> For test...
        jLabel = new JLabel("Press button");

        // Create buttons
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        // Create textfield
        jTextField = new JTextField(10);
        jTextField.setActionCommand("textField");    // Lecture 93...

        add(upButton);
        add(downButton);
        add(jLabel);
        add(jTextField);

        // Add EventListeners
        upButton.addActionListener(this);
        downButton.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // We now can put/consolidate all button-click related code here :)
        if (e.getActionCommand().equals("Up")){
            //System.out.println("Up button clicked!!");
            jLabel.setText("You pressed the up button");
        }
        // else if -> for several buttons...
        else {
            //System.out.println("Down button clicked!!");
            jLabel.setText("You pressed the down button");
        }
    }
}
