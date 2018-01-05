package org.asset.telematics.Messagnger.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.asset.telematics.Messagnger.database.DatabaseClass;
import org.asset.telematics.Messagnger.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages=DatabaseClass.getAllMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "koushik"));
		messages.put(2L, new Message(2, "Hello Jersey", "koushik"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	public List<Message> getAllMessagesforanYear(int year)
	{
		List<Message> messagesforyear=new ArrayList<>();
		Calendar cl=Calendar.getInstance();
		for(Message message:messages.values())
		{
			if(cl.get(Calendar.YEAR)==year)
			{
				messagesforyear.add(message);
			}
		}
		return messagesforyear;
	}
	public Message getMessage(long id) {
		
		return messages.get(id);
	}
	//Add Message
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	//UpDate Message
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	//Remove Message
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	

}
