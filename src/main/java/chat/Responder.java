package main.java.chat;

public interface Responder
{
    /**
     * Reads the configuration file from the system.
     *
     */
    void readConfigFile(String relativePath);
    void respond( String inputSentence );
    
}
