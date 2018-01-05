package org.asset.telematics.Messagnger.service;

import java.util.ArrayList;
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
		/*Message m1=new Message(1l,"Hello World","Pavan");
		Message m2=new Message(2l,"Hello Hyderabad !","Kumar");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);		
		return list;*/
		return new ArrayList<Message>(messages.values());
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
