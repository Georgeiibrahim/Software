package com.telusko.demorest2;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;


public class MemoryNotificationTemplateAccess implements INotificationTemplateDataAccessLayer {
 	List<NotificationTemplate> templates;
	
	public MemoryNotificationTemplateAccess()
	{
		templates=new ArrayList <>();
		/*NotificationTemplate t=new NotificationTemplate("ForgottenPassword","Dear {x},Your password is reset",Language.English);
	
		NotificationTemplate t1=new NotificationTemplate("SuccessfulShipping","Dear {x},The product {y} is confirmed",Language.Arabic);
	
		NotificationTemplate t2=new NotificationTemplate("ConfirmationMail","Your mail is confirmed and here is your email: {x}",Language.Arabic);
		templates.add(t);
		templates.add(t1);
		templates.add(t2);*/
		NotificationTemplate t=new NotificationTemplate();
		t.setId(22);
		t.setBody("ya rb ysht8l");
		t.setSubject("forgot");
		NotificationTemplate t1=new NotificationTemplate();
		t1.setId(222);
		t1.setBody("ya rb ysht8l2");
		t1.setSubject("forgsadasfot");
		
		templates.add(t);
		templates.add(t1);
	
	}
	public  List<NotificationTemplate> getTemplates() {
		return templates;
	}
	/*public NotificationTemplate gettemp(int d) {
		for(NotificationTemplate a:templates) {
			if(a.getId()==d)
				return a;
		}
		return new NotificationTemplate();
	}*/
	
	public NotificationTemplate Search(int id)
	{
		for(int i=0;i<templates.size();i++)
		{	
			if(templates.get(i).getId()==id)
				return templates.get(i);
		}
		return null;
	}
	@Override
	public void Create(NotificationTemplate t) {
		templates.add(t);
		
	}
	@Override
	public void Update(int id, NotificationTemplate t) {
		NotificationTemplate check=Search(id-1);
		if(check==null)
			System.out.println("This template does not exist");
		else
		{
			templates.set(id-1, t);
		}
		
	}
	@Override
	public  NotificationTemplate Read(int id) {
		/*NotificationTemplate check=Search(id);
		if(check==null){
			System.out.println("This template does not exist");
			return null;
		}
		else
		{
			return check;
		}*/
		for(NotificationTemplate a:templates) {
			if(a.getId()==id)
				return a;
		}
		return new NotificationTemplate();
		
	}
	
	@Override
	public void Delete(int templateID) {
		NotificationTemplate T=Read(templateID);
		if(T!=null) {
			System.out.println("The template is deleted successfully");
			templates.remove(T);
		}
		else
			System.out.println("This template does not exist");
	}
	
	
}
