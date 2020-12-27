import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SMSQueue implements QueueType{

	public static Queue<String> SMSQ=new LinkedList<String>();
	
	@Override
	public void Store(String content) {
		SMSQ.add(content);
	}
	public static Queue<String> getSMSQ() {
		return SMSQ;
	}
	
}
