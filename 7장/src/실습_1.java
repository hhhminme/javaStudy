import java.util.Stack; 
import java.util.LinkedList;
import java.util.Queue;

public class �ǽ�_1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); 
		System.out.println("= STack =");
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		while(stack.empty()==false) {
			System.out.println(stack.pop());
		}
		
		System.out.println("= Queue =");
		Queue<String> queue = new LinkedList<String>();
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		while(queue.peek()!= null) {
			System.out.println(queue.poll());
		}
	}
}
