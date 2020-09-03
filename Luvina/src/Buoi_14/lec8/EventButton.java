/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL E7450
 */
public class EventButton extends JFrame {
      private JButton plainJButton; // button with just text
      private JButton fancyJButton; //  
    
      public EventButton()
      {
         super( "Testing Buttons" );
         setLayout( new FlowLayout() ); // set frame layout 
         plainJButton = new JButton(  " Button 1 " ); // button with text
         add( plainJButton ); // add plainJButton to JFrame 
         fancyJButton = new JButton( " Button 2" );    
         add( fancyJButton ); // add fancyJButton to JFrame
         // create new ButtonHandler for button event handling
         ButtonHandler handler = new ButtonHandler();         
         fancyJButton.addActionListener( handler );           
         plainJButton.addActionListener( handler );           
      } // end ButtonFrame constructor
 
      // inner class for button event handling
      private class ButtonHandler implements ActionListener  {
         // handle button event
         public void actionPerformed( ActionEvent event )
         {
            JOptionPane.showMessageDialog( EventButton.this, String.format(
               "You pressed: %s", event.getActionCommand() ) );
         } // end method actionPerformed
      } // end private inner class ButtonHandler
  
public static void main( String args[] )
       {
          EventButton buttonFrame = new EventButton(); // create ButtonFrame
         buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
         buttonFrame.setSize( 275, 110 ); // set frame size
         buttonFrame.setVisible( true ); // display frame
      } // end main
}
