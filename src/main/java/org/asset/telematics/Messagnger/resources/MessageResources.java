package org.asset.telematics.Messagnger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.asset.telematics.Messagnger.model.Message;
import org.asset.telematics.Messagnger.service.MessageService;

@Path("/messages")
public class MessageResources {
	MessageService service=new MessageService();	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return service.getAllMessages();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return  service.addMessage(message);
	}
	@Path("/{messageId}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id,Message message)
	{
		message.setId(id);
		return  service.updateMessage(message);
	}
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void  deleteMessage(@PathParam("messageId") long id) {
		service.removeMessage(id);

	}

	
	@Path("/{messageId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public Message Test(@PathParam("messageId") long id)
	{ 
		return service.getMessage(id);
	}
}




















