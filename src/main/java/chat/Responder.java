package main.java.chat;
/**
 * 
 * Cloned from A2
 *
 */
public interface Responder
{
    /**
     * Reads the configuration file from the system.
     *
     */
    void readConfigFile(String relativePath);
    void respond( String inputSentence );
    
}
