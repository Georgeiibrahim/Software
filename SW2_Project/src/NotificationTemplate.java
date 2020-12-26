import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotificationTemplate {
	int id;
	static int counter=0;
	private String subject;
	private String body;
	int language;	
	public NotificationTemplate() {
		// TODO Auto-generated constructor stub
	}
	public NotificationTemplate(String subject,String body,int L)
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

	public void setLanguage(int language) {
		this.language = language;
	}
	public int getLanguage() {
		return language;
	}
	
	
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	
	
}
