package Stack;

class stackclass{
	int arr[];
	int top;
	int capacity;
	
	stackclass(int size){
		capacity=size;
		arr=new int[capacity];
		top=-1;	
	}
	
	public void push(int val) {
		 	if(top==capacity-1) {
		 		System.out.println("stack overflown");
		 		return;
		 	}
		 	top++;
		 	arr[top]=val;
	}
	
	public int pop() {
	    if(top == -1) {
	        System.out.println("Stack is already empty");
	        return -1;
	    }

	    int val = arr[top];  // get top value
	    top--;               // then decrease top
	    return val;
	}
	public void printstack() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class StackUsingArray {

	public static void main(String[] args) {
		stackclass st=new stackclass(5);
		st.push(25);
		st.push(30);
		st.push(35);
		st.push(40);
		st.printstack();
		st.pop();
		st.printstack();  
	}

}
