import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EmailQueue implements QueueType {
	
	
public static Queue<String> EmailQ=new LinkedList<String>();
	
	@Override
	public void Store(String content) {
		
		EmailQ.add(content);
	}
	public static Queue<String> getEmailQ() {
		return EmailQ;
	}


	

}
