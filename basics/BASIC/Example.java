package BASIC;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val=val;
		this.next=null;
	}
}

class LinkedList{
	ListNode head;
	
	public void InsertAtHead(int val) {
		ListNode newNode=new ListNode(val);
		newNode.next=head;
		head=newNode;
	}
	
	public void InsertAtTail(int val) {
		ListNode newNode=new ListNode(val);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
	}
	
	public void InsertAtIndex(int index,int val) {
		if(index==0) {
			InsertAtHead(val);
			return;
		}
		ListNode curr=head;
		for(int i=0;i<index-1;i++) {
			if(curr==null) {
				System.out.println("index out of bound can't insert at this index");
				return;
			}		
			curr=curr.next;
		}		
		ListNode newNode=new ListNode(val);
		newNode.next=curr.next;
		curr.next=newNode;		
	}
	
	public void Print() {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
		System.out.println("null");
	}
}

public class Example {
    public static void main(String[] args) {
    	LinkedList ll=new LinkedList();
    	ll.InsertAtHead(24);
    	ll.InsertAtHead(33);
    	ll.Print();
    	ll.InsertAtTail(40);
    	ll.InsertAtHead(50);
    	ll.InsertAtTail(66);
    	ll.Print();
    	
    	ll.InsertAtIndex(2, 28);
    	ll.Print();
    }
}