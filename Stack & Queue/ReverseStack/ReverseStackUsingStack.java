package ReverseStack;

import java.util.Stack;

public class ReverseStackUsingStack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(35);
		st.push(45);
		st.push(55);
		st.push(65);
		System.out.print(st);
				System.out.println();
		
		Stack<Integer> reversedstack=new Stack<>();
		while(!st.isEmpty()) {
			reversedstack.push(st.pop());
		}
		System.out.println(reversedstack);
	}

}

// WE CAN USE SAMETHING FOR reversing stack into LIST/ARRAY also. 
