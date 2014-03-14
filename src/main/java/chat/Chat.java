package main.java.chat;
/**
 * 
 * Cloned from A2
 *
 */
public interface Chat
{
	void initialize(Responder responder);

    /**
     * Get the sentence from the user
     * @return the String of the sentence
     */
    String getSentence();
    void chat();
	String getBotName();
	String getResponse(String text);
	String getBotVersion();

}
