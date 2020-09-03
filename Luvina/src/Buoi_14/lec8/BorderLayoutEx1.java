/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author DELL E7450
 */
public class BorderLayoutEx1 { 
	
	BorderLayoutEx1(){
		JFrame frame = new JFrame("Border Layout");
		JButton button,button1, button2, button3,button4;
		button = new JButton("left");
		button1 = new JButton("right");
		button2 = new JButton("top"); 
               
		button3 = new JButton("bottom");
		button4 = new JButton("center");
                BorderLayout layout = new BorderLayout();      
                layout.setHgap(10); // Đặc khoảng trống giữa các cùng
                layout.setVgap(20);
                frame.setLayout(layout);    
                frame.add(button1, BorderLayout.EAST);
		frame.add(button,BorderLayout.WEST);
		frame.add(button3, BorderLayout.SOUTH);
		frame.add(button2, BorderLayout.NORTH);	
                
		 frame.add(button4, BorderLayout.CENTER);
		
		frame.setSize(300,300);  
		frame.setVisible(true);  
	}
	public  static void main(String[] args){
		new BorderLayoutEx1();
	}
    }
