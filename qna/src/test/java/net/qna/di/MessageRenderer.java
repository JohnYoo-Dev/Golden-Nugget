package net.qna.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRenderer {
	private MessageProvider messageProvider;
	
	public void setMessageProvider (MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
		
	
	public void render() {
		System.out.println(messageProvider.getMessage());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");
		MessageRenderer render = (MessageRenderer)ac.getBean("messageRenderer");
		render.render();
	}

}
