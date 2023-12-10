package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		
		Stack st = new Stack(); //스택은 마지막에 저장된 값부터 불러온다
		Queue q = new LinkedList(); //큐는 처음에 저장한 값부터 불러온다
		
		st.push("0"); 
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=stack=");
		while(!st.empty()) {
		System.out.println(st.pop());
		}
		
		System.out.println("=queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
	
}
