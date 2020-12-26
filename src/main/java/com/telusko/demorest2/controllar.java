 package com.telusko.demorest2;

import java.util.ArrayList;
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

@Path("template")
public class controllar {
MemoryNotificationTemplateAccess repo=new MemoryNotificationTemplateAccess();

@GET
@Produces(MediaType.APPLICATION_XML)
public List<NotificationTemplate> getTemplates(){
	System.out.println("nvhgxytukh");
	return repo.getTemplates();
}
@GET
@Path("templateR/id")
@Produces(MediaType.APPLICATION_XML)
public NotificationTemplate tempread(@PathParam("id")int id){
	return repo.Read(id);
	
}
@GET
@Path("templatd/{id}")
@Produces(MediaType.APPLICATION_XML)
public NotificationTemplate getnoti(@PathParam("id")int id) {
	return repo.Read(id);
}

@POST
@Path("templateC")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public NotificationTemplate tempcreate(NotificationTemplate a) {
	System.out.println(a);
	repo.Create(a);
return a;
}
@PUT
@Path("templateU/{id}")
@Produces(MediaType.APPLICATION_XML)
public NotificationTemplate tempupdate(NotificationTemplate a,@PathParam("id")int id) {
	System.out.println(a);
	repo.Update(id, a);
	return a;
	
}
@DELETE
@Path("templateD/{id}")
public NotificationTemplate tempdelete(@PathParam("id")int id) {
	
	repo.Delete(id);;
	return null;
	
}
}
