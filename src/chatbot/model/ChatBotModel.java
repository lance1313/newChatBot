package chatbot.model;
import java.util.*;

import javax.swing.*;
/**
 * This is where all of the methods are and sends them to the controller
 *  to send to the View.
 * @author jlin3312
 *
 */
public class ChatBotModel
{

	private String name;
	private int chatCount;
	private ArrayList<String> memeList = new ArrayList<String>(
	Arrays.asList("hi","bye","yes","no"));
	
	private ArrayList<String> stringChecker;
	
	
	
	/**
	 * creates an chatbot object with suppleid name and
	 *  initializes the current number of chats to zero
	 * @param name
	 */
	 
	  public ChatBotModel(String name)
	 
	 
	{
		this.name = name;
		chatCount = 0;
		
	}
	  /**
	   * 
	   * @param currentInput This is were you pass the checkers
	   * to the controller to give to the view.
	   * @return the Result.
	   */
	  public String processText(String currentInput)
	  {
		  String result = "";
		  
		  return result;
	  }
	  
	  
	/**
	 * this returns the name value.
	 * @return
	 */
	public String getName()//getter
	{
		return name;
	}
	/**
	 * This gets the amount of chat that is used.
	 * 
	 * @return
	 */
	public int getchatCount()
	{
		return chatCount;
	}
	/**
	 * This sets the name  to the string name in chatBotController.
	 * @param name The new name for the chatBot.
	 */
	public void setName(String name)//setter
	{
		this.name = name;
	}
	
	
	private void updateChatCount()
	{
		chatCount++;
	}
	/**
	 * This checks the input from the view to see if you should quit.
	 * @param input
	 * @return
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if (input != null && input.equals("yes"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
		
	}
	
	private void stringChecker()
	{
	//int wordLength = currentInput;

	
		
	}
	
	private String memeChecker(String reply)
	{
		memeList = new ArrayList<String>(
				Arrays.asList("hi","bye","yes","no"));
		
		
		
		
		//reply = memeWord;
		
		return reply;
		
	}
	
	private void contentChecker()
	{
		
		
	}
	
	
}
