package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotController;

/**
 * This dyspalys what appers to the user and were the input goes.
 * 
 * @author jlin3312
 *
 */
public class ChatBotView
{

	// private String chat;

	private ChatBotController baseController;

	// this is the chat checker.

	/**
	 * this sets the imported baseController from the other class to the on
	 * baseController in this class
	 * 
	 * @param baseController
	 */
	public ChatBotView(ChatBotController baseController)
	{
		this.baseController = baseController;// shove the 2 baseControllers
												// together.
	}

	/**
	 * This shows the words that apperes on the screen and returns the result to
	 * determine weather you want it to exit or continue based on input.
	 * 
	 * @param currentInput
	 * @return
	 */
	public String showChatBot(String currentInput)
	{
		String result = "";
		if (currentInput != null)
		{
			int wordLength = currentInput.length();

			JOptionPane.showMessageDialog(null, "Hello ," + currentInput);
			JOptionPane.showMessageDialog(null, "Your name is " + wordLength + " letters long.");
		}
		result = JOptionPane.showInputDialog(null, "are you done");

		return result;

	}

	// + ChatBotController.getMyChatBot().getName(

}
