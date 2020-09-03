/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8;
import javax.swing.*;

/**
 *
 * @author DELL E7450
 */
public class SwingFirstExample {
    public static void main(String[] args) {    
        JFrame frame = new JFrame("My First Swing Example"); 
        frame.setSize(350, 200);// width and height of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        JPanel panel = new JPanel(); //Inside panels we can add text fields, buttons,..
        // adding panel to frame
        frame.add(panel); 
        placeComponents(panel);
        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);// Người lập trình tự xác định ví trị, kích thước của các control
 
        JLabel userLabel = new JLabel("User");
        /*   setBounds(x, y, width, height),  here (x,y) are cordinates from the top left 
         * corner and remaining two arguments are the width  and height of the component.
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel); 
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
 
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }
}
