package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotController;

/**
 * 
 * @author jlin3312
 *v.2
 */
public class ChatbotFrame extends JFrame 
{
	
	private ChatBotController baseController;
	public ChatbotFrame(ChatBotController controller)
	{
		this.baseController = controller;
	}

}
