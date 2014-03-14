package main.java.chat.component;
 
/**
 * 
 * @author madisoncunning
 * 
 */
 
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class GUIDemo extends JPanel implements ActionListener, Intface 
{
	private static final long serialVersionUID = 1L;
	private JButton b;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane; 
 
    public GUIDemo() 
    {
        super(new GridBagLayout());
 
        textField = new JTextField(50);
        textField.addActionListener(this);
        
        textArea = new JTextArea("", 40, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
      
        b = new JButton();
        b.addActionListener(this);
        b.setText("Send");
        
        GridBagConstraints constr = new GridBagConstraints();
        constr.gridwidth = GridBagConstraints.REMAINDER;
        constr.fill = GridBagConstraints.BOTH;
       
        GridBagConstraints constr2 = new GridBagConstraints();
        constr2.fill = GridBagConstraints.BOTH;
        
        add(scrollPane, constr);
        add(textField, constr2);
        add(b, constr);    
    }

	public GUIDemo(ActionListener listener)
	{
		super(new GridBagLayout());

		textField = new JTextField(80);
		textField.addActionListener(listener);

		b = new JButton();
		b.addActionListener(listener);

		textArea = new JTextArea("",20,80);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		GridBagConstraints constr = new GridBagConstraints();
		constr.gridwidth = GridBagConstraints.REMAINDER;
		constr.fill = GridBagConstraints.BOTH;
		
		GridBagConstraints constr2 = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;


		add(scrollPane, constr);
		add(textField, constr2);
		add(b,constr);

	}

	@Override
	public void writeTotextArea(String str){
        textArea.append(str + "\n");
        textArea.selectAll();
	}

	@Override
	public String writeUserInputTotextArea(){
		String str = textField.getText();
        textArea.append(textField.getText() + "\n");
        return str;

	}

	@Override
	public void cleartextArea(){
		textArea.setText("");
	}

	@Override
	public String getUserInput(){
		return textField.getText();
	}

	@Override
	public void replaceActionListener(ActionListener listener){
		for(ActionListener listener2 : textField.getActionListeners())
			textField.removeActionListener(listener2);
		for(ActionListener listener2 : b.getActionListeners())
			b.removeActionListener(listener2);

		b.addActionListener(listener);
		textField.addActionListener(listener);
	}

	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		
		
    	String text = textField.getText(); //get input
    	
        textField.selectAll();
        textArea.append(text + "\n");
        textArea.selectAll();
        textField.setText("");
        textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	
	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
	public static void createAndShowGUI() 
	{
        //Create and set up the window.
        JFrame frame = new JFrame("TextDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add contents to the window.
        frame.add(new GUIDemo());
 
        //textArea of the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	public static void main (String args[])
	{
		createAndShowGUI();
	}
}