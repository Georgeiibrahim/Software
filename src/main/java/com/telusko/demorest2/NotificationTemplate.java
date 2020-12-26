package com.telusko.demorest2;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class NotificationTemplate {
	int id;
	static int counter=0;
	private String subject;
	private String body;
	Language language;	
	public NotificationTemplate() {
		// TODO Auto-generated constructor stub
	}
	public NotificationTemplate(String subject,String body,Language L)
	{
		id=++counter;
		this.subject=subject;
		this.body=body;
		language=L;
		
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBody() {
		return body;
	}

	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		
		return "id = "+id+" name = "+subject+" body = "+body;
	}
	
}
