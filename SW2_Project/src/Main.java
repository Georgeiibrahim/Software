import java.sql.SQLException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*MemoryNotificationTemplateAccess H=new MemoryNotificationTemplateAccess();
		NotificationTemplate t=new NotificationTemplate("ForgottenPassword","Dear {x},Your password is reset",Language.English);
		
		NotificationTemplate t1=new NotificationTemplate("SuccessfulShipping","Dear {x},The product {y} is confirmed",Language.Arabic);
		NotificationTemplate t2=new NotificationTemplate("ConfirmationMail","Your mail is confirmed and here is your email: {x}",Language.Arabic);
		H.Create(t);
		H.Create(t1);
		H.Create(t2);
		SMSQueue s=new SMSQueue();
		
		NotificationMessage m=new NotificationMessage();
		m.create(t,Channel.EMAIL,"George");
		m.create(t1,Channel.EMAIL, "Rawda");
		m.create(t2,Channel.EMAIL,"Malak");
		
		
		System.out.println("******************************************");
		Queue<String> qE=new PriorityQueue<String>();
		qE=EmailQueue.getEmailQ();
		System.out.println(qE);
		*/
		DatabaseAccess d=new DatabaseAccess();
		System.out.println(d.getTemplates());
		NotificationTemplate t=new NotificationTemplate("ForgottenPassword","Dear {x},Your password is reset",2);
		d.Create(t);
		
		
		
	}
	
}
