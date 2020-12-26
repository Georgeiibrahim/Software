import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotificationMessage {
	Channel C;
	String placeHolders;
	QueueType q;
	String content;
	
	public NotificationMessage() {
		// TODO Auto-generated constructor stub
	}
	public  void  create (NotificationTemplate t,Channel C,String placeHolders)
	{
		this.C=C;
		if(MemoryNotificationTemplateAccess.getTemplates().indexOf(t)==-1)
		{
			System.out.println("This template does not exist");
		}
		else {
		this.placeHolders=placeHolders;	
		parseBody(t);
		
		if(C==Channel.SMS)
			q=new SMSQueue();
		else
			q=new EmailQueue();
		q.Store(content);
	}
	}
	public String getContent() {
		return content;
	}
	
	private void parseBody(NotificationTemplate t)
	{
		String[] holders=placeHolders.split(",");
		content=t.getBody();
		if((content.contains("{")|| content.contains("}")))
		{
			int j=0;
			Pattern pattern=Pattern.compile("\\{(.*?)\\}");
			Matcher m=pattern.matcher(content);
			while(m.find() && j<holders.length)
			{
				String test=m.group(1);
				content=content.replaceAll(test,holders[j]);
				j++;
			}
			content=content.replace('{',' ').replace('}', ' ');
		}
		else 
		{
			return;
		}
		content=t.getSubject()+"\n"+content;
	}
	
}
