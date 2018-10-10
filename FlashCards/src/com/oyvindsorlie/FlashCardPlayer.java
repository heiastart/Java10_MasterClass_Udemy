package com.oyvindsorlie;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class FlashCardPlayer {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private Iterator cardIterator;
    private FlashCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private boolean isShowAnswer;
    private JButton answerButton;

    // Initial constructor
    public FlashCardPlayer() {

        // Build the GUI
        JPanel mainPanel = new JPanel();
        Font font = new Font("Times New Roman", Font.PLAIN, 18);
        frame = new JFrame("FlashCard Player");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        answerButton = new JButton("Show answer");
        display = new JTextArea(10,20);
        display.setFont(font);
        JScrollPane displayJScrollPane = new JScrollPane(display);
        displayJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        displayJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // Add menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load Card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        mainPanel.add(displayJScrollPane);
        mainPanel.add(answerButton);
        answerButton.addActionListener(new NextCardListener());


        // Add to frame (aka the window)
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setVisible(true);
    }

    // Some necessary classes
    class NextCardListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (isShowAnswer){
                display.setText(currentCard.getAnswer());
                answerButton.setText("Next card");
                isShowAnswer = false;
            }
            else {
                // Show next question
                if (cardIterator.hasNext()){
                    answerButton.setText("Next card");
                    showNextCard();
                }
                else {
                    // No more cards -> ArrayList is empty...
                    display.setText("That was the last card\nThanks for playing");
                    answerButton.setEnabled(false);     // Disabling the button since no more cards to show :)
                }
            }
        }
    }

    class OpenMenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }

    // And method(s)...
    private void loadFile(File selectedFile) {
        cardList = new ArrayList<FlashCard>();

        try {
            BufferedReader readCardSet = new BufferedReader(new FileReader(selectedFile));
            String line = null;

            while ((line = readCardSet.readLine()) != null){
                makeCard(line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // Show the first card
        cardIterator = cardList.iterator();
        showNextCard();
    }

    private void showNextCard() {
        currentCard = (FlashCard)cardIterator.next();
        display.setText(currentCard.getQuestion());
        answerButton.setText("Show answer");
        isShowAnswer = true;

    }

    private void makeCard(String lineToParse) {
        // Two ways to convert/parse the lines in the saved files, that has a - in them, to pure string...
        // Method 1 is by using the tokenizer-class
        // Method 2, old-fashioned way;
        String[] result = lineToParse.split("/"); // We split up the question and the answer, separated by a / ; [question,answer]
        FlashCard card = new FlashCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("Made a card....yeah!!");
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FlashCardPlayer();
            }
        });
    }
}
