package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotModel;
import chatbot.view.ChatBotView;
/**
 * Runs ChotBot project. Owns the model and associated views.
 * DON'T CALL POP UP WINDOWS ON CONTROLLERS
 * Get my MAC projects to gitHub.
 * @author Jacob Lindquist
 * @version 1.2 10/2/14 - Cleaned the quit method.
 */
public class ChatBotController
{
	
	private ChatBotView appView;
	private ChatBotModel myAwesomeChatBot;
	private String startMessage;
	private String quitMessage;
	
	public ChatBotController()
	{
		appView = new ChatBotView(this);
		myAwesomeChatBot = new  ChatBotModel("derf");
		startMessage = "Welcome" + myAwesomeChatBot.getName() + " chatbot. What is your name?";
		quitMessage = "good bye cruel world.";
	}
	/**
	 * this is a constructor.
	 */
	public ChatBotModel getMyAwesomeChatBot()
	{
		return  myAwesomeChatBot;
	}
	
	public void start()
	{
		
		String result = appView.showChatBot(startMessage);
		//this is the quit checker in model
		while(!myAwesomeChatBot.quitChecker(result))
		{//this is a new result from the result in view.
			result = appView.showChatBot(result);
		}
			quit();
		
	}

	/**
	 * 
	 * @param currentString The current string is  what is being inputed to the console
	 * now.
	 * @return
	 */
	private boolean memeChecker(String currentString)
	{
	
		
		return false;
		
	}
	
	
	
	
	
		//start
	//say hello
	//dialog
	//responed
	//reply
	//quit
	

	private void quit()
	{
		appView.ShowChatBotMessage(quitMessage);
		System.exit(0);
	}
	

}
