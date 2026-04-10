package Stack;


	
	class Node{
		int data;
		Node next;
		Node top;
		Node(){
			 top=null;
		}
		Node(int val){
			this.data=val;
			this.next=null;
		}
	

	
	public void push(int val) {
		Node newNode=new Node(val);
		newNode.next=top;
		top=newNode;
	}
	
	public int pop() {
		if(top==null) {
			System.out.println("stack is underflow");
			return -1;
		}
		int val=top.data;
		top=top.next;
		return val;
	}
	public void printLL() {
		if(top==null) {
			System.out.println("top is empty");
			return;
		}
		
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
	public class StackUsingLinkedList {
	public static void main(String[] args) {
		Node stackLL=new Node();
		stackLL.push(45);
		stackLL.push(55);
		stackLL.push(65);
		stackLL.push(75);
		stackLL.printLL();
		
		
		System.out.println(stackLL.pop());
		stackLL.printLL();
		
	}
}
