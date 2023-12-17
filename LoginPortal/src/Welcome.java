import java.util.HashMap;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Welcome {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Jello");

    // This is done when welcome page is called with userID argument
    // 1.Welcome(String userID){
    Welcome() {

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(welcomeLabel);
        // When called with argument
        // 1.welcomeLabel.setText("Hwllo"+ userID);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        IDandPassword idandPasswords = new IDandPassword();
        LoginPortal loginPortal = new LoginPortal(idandPasswords.getLoginInfo);

    }

}