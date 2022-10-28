import java.util.ArrayList;
import javax.swing.*;

import javafx.scene.text.Font;

public class FlashcardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<Flashcard> cardlist;
    private JFrame frame;

    public FlashcardBuilder() {

        frame = new JFrame("Flash Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        JPanel mainPanel = new JPanel();

        Font newFont = new Font("Courier New", Font.REGULAR, 21);
        
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(newFont);

        JScrollPane questionPane = new JScrollPane(answer);
        questionPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        questionPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(newFont);

        JScrollPane answerPane = new JScrollPane(answer);
        answerPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        answerPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");

        JLabel questionLabel = new JLabel("Question");
        JLabel answerLabel = new JLabel("Answer");

        mainPanel.add(questionLabel);
        mainPanel.add(questionPane);
        mainPanel.add(answerLabel);
        mainPanel.add(answerPane);
        mainPanel.add(nextButton);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashcardBuilder();
            }
        })

    }
}