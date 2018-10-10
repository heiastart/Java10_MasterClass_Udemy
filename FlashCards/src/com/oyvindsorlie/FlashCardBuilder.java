package com.oyvindsorlie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class FlashCardBuilder {

    // Instance variables
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private JFrame frame;


    // Constructor for this class
    public FlashCardBuilder() {
        // Build the GUI
        frame = new JFrame("Flash Card");
        frame.setSize(700,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold everything
        JPanel mainPanel = new JPanel();

        // Create font (for the JPanel)
        Font greatFont = new Font("Times New Roman", Font.PLAIN, 21);

        // Create JText area (for question and answer)
        question = new JTextArea(6,30);
        question.setLineWrap(true);  // Making sure our text will fit
        question.setWrapStyleWord(true);
        question.setFont(greatFont);

        answer = new JTextArea(6,30);
        answer.setLineWrap(true);  // Making sure our text will fit
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);

        cardList = new ArrayList<FlashCard>();

        // Create ScrollPane for the text-areas
        JScrollPane questionScrollPane = new JScrollPane(question); // Adding "scroller" for the question JTextArea
        questionScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        questionScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JScrollPane answerScrollPane = new JScrollPane(answer); // Adding "scroller" for the answer JTextArea
        answerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        answerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // Create button
        JButton nextButton = new JButton("Next Card");

        // Create some labels
        JLabel questionJLabel = new JLabel("Question");
        JLabel answerJLabel = new JLabel("Answer");

        // Create menubar with file menu (must also create the menu and items itself)
        // Remember the hierarchy when putting it (the menu) together...
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        // Add eventListeners for menubar-items
        newMenuItem.addActionListener(new NewMenuItemListener());
        saveMenuItem.addActionListener(new SaveMenuItemListener());


        // Add components to mainPanel -> NB: correct order is important!!!!!
        mainPanel.add(questionJLabel);
        mainPanel.add(questionScrollPane);
        mainPanel.add(answerJLabel);
        mainPanel.add(answerScrollPane);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());


        // Add mainPanel to the JFrame (aka the window)
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        frame.setVisible(true);

    }

    private void saveFile(File selectedFile) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
            Iterator<FlashCard> cardIterator = cardList.iterator();

            while (cardIterator.hasNext()){
                FlashCard card = (FlashCard) cardIterator.next();       // Can drop the (FlashCard)-parser...put in to be 100% sure that deal with/receiving a FlashCard object here!
                writer.write(card.getQuestion() + "-");           // Calling the getter-method getQuestion() from the FlashCard class
                writer.write(card.getAnswer() + "\n");              // Calling the getter-method getAnswer() from the FlashCard class

                /*
                    Alternative code to the while-loop is a for-loop, like this;
                    for (FlashCard card : cardList){
                        writer.write(card.getQuestion() + " - ");
                        writer.write(card.getAnswer() + "\n");
                    }
                 */
            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error in write procedure");
            e.printStackTrace();
        }
    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    // Some additional classes :)
    class NextCardListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Create a flashcard
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);

            // Then, we wanna clear the TextAreas, aka the card, by calling a function
            clearCard();
        }
    }

    class NewMenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Testing!!!");
        }
    }

    class SaveMenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);

            // Create/run a file dialog with file location chooser
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());

        }
    }




    // Main method!!!!!!!!!!!!!
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new FlashCardBuilder();
            }
        });
    }
}
