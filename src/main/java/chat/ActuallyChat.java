package main.java.chat;
/**
 * Checked but Come back to
 */
import java.util.Scanner;

public class ActuallyChat implements Chat
{
    boolean chat;
    Responder responder;
    Scanner scan;

    public ActuallyChat()
    {
        chat = true;
        scan = new Scanner( System.in );
        // TODO
    }//Constructor

    @Override
    public void initialize( Responder responderIn )
    {
        responder = responderIn;
        responder.readConfigFile( "../../../resources/config.chat" );

        
    }//initialize

    @Override
    public String getSentence()
    {
        return scan.nextLine();
    }

    private void print( String string )
    {
    	System.out.println( string );
    }
    
    @Override 
    public void chat()
    {
    	print( "Hello!" );
    	
        while(chat)
        {
            String sentence = getSentence();
            responder.respond(sentence);
        }
    }

	@Override
	public String getBotName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResponse(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBotVersion() {
		// TODO Auto-generated method stub
		return null;
	}

}
