package main.java.chat;
/*
 * Checked
 */
public class Main
{
    public static void main(String[] args)
    {
        Chat chat = new ActuallyChat();
        chat.initialize(new ActuallyResponder());
        chat.chat();
    }
    
    
}
