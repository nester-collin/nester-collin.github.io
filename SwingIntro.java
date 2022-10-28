import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


public class SwingIntro implements ActionListener{

    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;

    public SwingIntro() {

        JFrame jFrame = new JFrame("Enter Text");
        
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(400, 400);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTextField = new JTextField(10);

        jTextField.setActionCommand("textField");

        reverseButton = new JButton("Reverse");

        jTextField.addActionListener(this);
        reverseButton.addActionListener(this);

        promptLabel = new JLabel("Enter text: ");
        contentLabel = new JLabel("");

        
        jFrame.add(promptLabel);
        jFrame.add(jTextField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);

        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")){
            String original = jTextField.getText();
            String temp = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                temp += original.charAt(i);
            }
            contentLabel.setText(temp);
        }
        else {
            contentLabel.setText("You pressed Enter. Current text is " + jTextField.getText());
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SwingIntro();
            }
        });
    }
}
