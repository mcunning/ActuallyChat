ACTUALLYCHAT (A3)
============

Overview
---------
ACTUALLY CHAT is a clone of the Assignment 2 chat bot that can carry a conversation with a real person while simulating a first date conversation. 
The ChatBot is a bit self-absorbed. If you try to tell the ChatBot about yourself, it will generally lead the conversation back to itself. 
If you are able to get the ChatBot to ask you about yourself, it will ask you your zodiac sign and will tell you some traits based on your specific sign. 


How to Compile and Run the Code
--------------
All files in repository must be downloaded (including OpenNLP jar files) and then ran from main.java.chat.Main.java.
The console window that opens up can then be used to interact with the chatBot.


Class Organization
------------------
main.java.chat

ActuallyChat.java
* Initializes responder that reads the configuration file.

ActuallyResponder.java
* Reads configuration file for keywords.
* Differentiates between keywords being a question/statement as well as if the entire input consists of/ends with/starts with the keyword/key phrase
* Generates a random response if user input is outside of topic.

Chat.java
* Get the sentence from the user return the String of the sentence

Main.java
* Initializes and runs chat.

Responder.java
* Reads the configuration file from the system.


main.java.chat.components
GUIDemo.java (Not fully functional)
* Setup and add components to interface.
* Create and show interface.

Intface.java (Not fully functional)
* Creates interface.

Keyword.java
* Creates specifics to differentiate between keywords.

Response.java
* Looks for response based on keywords.

POS.java (Not fully functional)
* Reads the user input, splits the sentence and analyzes each individual word, and categorizes them as their specific sentence parts (verb, noun, etc.)


main.java.chat.util

ConfigReader.java
* Reads the configuration file containing all of the keywords and responses.

Util.java
* Checks if a given string starts with specific input and chooses a random element from a string array to return if not.


main.resources

config.chat
* Holds all keywords and responses


Features Implemented
---------------------
An extra topic has been implemented.

-Improves the conversation for when the user gets tired of asking the chatBot about itself.

-If the user hints at the chatBot asking them a question, chatBot will ask the user their zodiac sign
and give the user personality characteristics depending on their specified sign. 

-Example: (Words in italics are the chatBot)

Shouldn't you ask me something about myself..?

*What's your sign?*

I'm a leo

*Oh, a Leo! That means that you are loyal and generous!*


5 different responses when user input is outside of topic.

-If the user inputs anything that is outside of the chatBot's topic or does not trip any keywords
the chatBot will output one of five different responses at random. 

-The different responses were chosen to emphasize the chatBot's self centered persona and will lead the user back to asking the chatBot questions.

-Example:

What kind of food do you like?

*I like Italian food, what do you like?* 

I like steak.

*Let's talk about me some more.*

But you asked what I like...

*That doesn't interest me.*


POS Tagging (not fully functional)

-Uses OpenNLP jar files

-Reads the user input, splits the sentence and analyzes each individual word, and categorizes them as their specific sentence parts (verb, noun, etc.)

-(Should) Check if user input was outside of topic, have a predetermined output that will put the users noun and/or verb into the sentence

ie. I like (noun).

*I love (noun)!*


GUI (not fully functional)

-(Should) Bring up a simple interface where the user can type into a text field and have the chatBot output display in the text area.


Limitations
-----------
-ChatBot does not know about a lot of specific topics and will therefore resort back to the randomized responses a lot. 

-Example:

What is your favorite color?

*I'd rather not talk about that.*

It's sunny out today

*Can we talk about something else?*

I can touch my toes

*Let's talk about me some more.*
