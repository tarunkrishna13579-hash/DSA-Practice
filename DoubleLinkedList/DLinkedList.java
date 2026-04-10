
class DListNode{
	int val;
	DListNode next;
	DListNode prev;
	DListNode(int val){
		this.val=val;
		this.next=null;
		this.prev=null;
		}
}
class linkedlistD{
	DListNode head;
	public void insertAthead(int val) {
		DListNode newnode =new DListNode(val);
		if(head!=null){
			head.prev=newnode;
			newnode.next=head;
		}
		head=newnode;
	}
	
	public void insertAtTail(int val) {
		DListNode newnode =new DListNode(val);
		DListNode curr=head;
		if(head==null) {
			insertAthead(val);
		}
		while(curr.next!=null) {
			curr=curr.next;
		}		
		curr.next=newnode;
		newnode.prev=curr;
	}
	
	public void reverse() {
		DListNode curr=head;
		DListNode temp=null;
		
		if(head==null || head.next==null) {
			return ;
		}
		while(curr!=null) {
			//we are swaping links not values
			temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			curr=curr.prev;
		}
		if(temp!=null) {
		head=temp.prev;
		}
	}
	
	public void display() {
		DListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val +" ");
			curr=curr.next;
		}
		System.out.println();
	}
}

public class DLinkedList {

	public static void main(String[] args) {
		linkedlistD dll=new linkedlistD();
		
		dll.insertAthead(5);
		dll.insertAthead(4);
		dll.insertAthead(7);
		dll.insertAthead(2);
		dll.display();
		
		dll.insertAtTail(10);
		dll.display();
		
		dll.reverse();
		dll.display();
	}

}
