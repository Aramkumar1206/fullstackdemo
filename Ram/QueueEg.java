package Ram;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class QueueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue <Integer>  q = new LinkedList<> ();
    q.add(4);
    q.add(8);
    q.add(3);
    q.add(2);
    q.add(1);
    System.out.println("Queue is: " + q);
    System.out.println("Head of the Queue is:" + q.peek());
    System.out.println("Removed Queue no. is:" +q.remove());
    System.out.println("Queue is:"+ q);
    System.out.println("Now Head of the Queue is:"+q.peek());
    System.out.println("Removed Queue no. is:" + q.poll());
    System.out.println("Queue is:" +q);
    
	}

}
