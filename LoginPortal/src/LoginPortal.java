import java.awt.Font;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class LoginPortal implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDJLabel = new JLabel("userID");
    JLabel userPassJLabel = new JLabel("password");
    JLabel messLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPortal(HashMap<String, String> logininfoOriginal) {

        logininfo = logininfoOriginal;
        userIDJLabel.setBounds(50, 100, 75, 25);
        userPassJLabel.setBounds(50, 100, 75, 25);

        messLabel.setBounds(125, 250, 250, 35);
        messLabel.setFont(new Font(null, Font.ITALIC, 25));

        userField.setBounds(125, 100, 200, 25);

        userPasswordField.setBounds(125, 150, 200, 25);
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(125, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDJLabel);
        frame.add(userPassJLabel);
        frame.add(messLabel);
        frame.add(userField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            userField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String userID = userField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messLabel.setForeground(Color.green);
                    messLabel.setText("Login Successful");
                    frame.dispose();
                    // here you can call userId or just a page
                    // 1. Welcome welcome = new Welcome(userID);
                    //
                    Welcome welcome = new Welcome();

                } else {
                    messLabel.setForeground(Color.red);
                    messLabel.setText("Either username or password is incorrect");

                }
            } else {

                messLabel.setForeground(Color.red);
                messLabel.setText("No user is available");
            }
        }

    }

}