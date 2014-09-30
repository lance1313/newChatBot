package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotModel;
import chatbot.view.ChatBotView;
/**
 * this is the mediator between View and the Model.
 * 
 * Get my MAC projects to gitHub.
 * @author jlin3312
 *
 */
public class ChatBotController
{
	
	private ChatBotView appView;
	private ChatBotModel myAwesomeChatBot;
	
	public ChatBotController()
	{
		appView = new ChatBotView(this);
		myAwesomeChatBot = new  ChatBotModel("derf");
	}
	
	public void start()
	{
		
		String result = appView.showChatBot(" Jacob");
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
		JOptionPane.showMessageDialog(null,"good bye cruel world");
		System.exit(0);
	}
	

}
