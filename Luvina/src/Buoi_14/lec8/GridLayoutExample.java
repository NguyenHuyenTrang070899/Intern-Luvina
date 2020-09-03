/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DELL E7450
 */
public class GridLayoutExample {
    GridLayoutExample(){
			JFrame frame = new JFrame("Grid Layout");
			JButton button,button1, button2, button3,button4;
			button = new JButton("button 1");
			button1 = new JButton("button 2");
			button2 = new JButton("button 3");
			button3 = new JButton("button 4");
			button4 = new JButton("button 5");
			frame.add(button);
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.add(button4);
			frame.setLayout(new GridLayout(4,2));
			frame.setSize(300,300);  
			frame.setVisible(true);  
		
		}
		public static void main(String[] args) {
			new GridLayoutExample();
		}
}
