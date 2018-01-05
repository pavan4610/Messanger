package org.asset.telematics.Messagnger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.asset.telematics.Messagnger.model.Message;
import org.asset.telematics.Messagnger.service.MessageService;

@Path("/messages")
public class MessageResources {
	MessageService service=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return service.getAllMessages();
	}
}
