package main.java.chat.component;

import java.awt.event.ActionListener;

public interface Intface 
{
	void writeTotextArea(String str);
	String writeUserInputTotextArea();
	void cleartextArea();
	String getUserInput();
	void replaceActionListener(ActionListener listener);
}
