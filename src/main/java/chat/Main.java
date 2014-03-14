package main.java.chat;

import java.io.FileNotFoundException;

//import main.java.chat.component.POS;

//import main.java.chat.component.GUIDemo;

/**
 * 
 * Cloned from A2
 *
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
//    	GUIDemo GD = new GUIDemo();
//    	GUIDemo.createAndShowGUI();
    	
//    	POS.init();

    	
    	Chat chat = new ActuallyChat();
        chat.initialize(new ActuallyResponder());
        chat.chat();
    }
    
}
