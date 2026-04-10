package P1;


class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val=val;
		this.next=null;
	}
}
class MyLinkedList{
	ListNode head;
	public void InsertAtHead(int val){
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
	
	public void insertAtIndex(int index,int val) {
		if(index==0) {
			InsertAtHead(val);
			return;
		}
		
		ListNode curr=head;
		
		for(int i=0;i<index-1;i++) {
			if(curr==null) {
				System.out.println("index out of bound");
				return;
			}
			curr=curr.next;
		}
		ListNode newNode=new ListNode(val);
		newNode.next=curr.next;
		curr.next=newNode;
	}
	
	//DELETE
	public void DeleteNodeAtHead() {
		if(head==null) {
			return;
		}
		head=head.next;
	}
	public void DeleteAtTail() {
		ListNode curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
	}
	
	public void DeleteAtIndex(int index,int val) {
		ListNode curr=head;
		for(int i=0;i<index-1;i++) {
			if(curr==null || curr.next==null) {
				System.out.println("out of bound exception");
			}
			curr=curr.next;
		}
		curr.next=curr.next.next;
	}
	
	public int Search(int val) {
		ListNode curr=head;
		int index=0;
		while(curr!=null) {
			if(curr.val==val) {
				
				return index;
			}
			curr=curr.next;
			index++;
		}
		return -1;
	}
	
	//REVERSE
	public void reverse() {
	    ListNode prev = null;
	    ListNode curr = head;
	    ListNode temp = null;

	    while (curr != null) {
	        temp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = temp;
	    }

	    head = prev;
	}

	
	public void PrintLL() {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
		System.out.println("null");
	}
}

public class LinkedList {
	public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		
		ll.InsertAtHead(25);
		ll.InsertAtHead(34);
		ll.PrintLL();
		
		
		
		ll.InsertAtTail(45);
		ll.InsertAtTail(56);
		ll.PrintLL();
		
		
		ll.insertAtIndex(2, 30);
		ll.PrintLL();
		ll.insertAtIndex(5, 30);
		ll.PrintLL();
		
		ll.DeleteNodeAtHead();
		ll.PrintLL();
		ll.DeleteNodeAtHead();
		ll.PrintLL();
		
		
		ll.DeleteAtTail();
		ll.PrintLL();
		
		ll.DeleteAtIndex(1, 45);
		ll.PrintLL();
		
		ll.InsertAtTail(65);
		ll.InsertAtTail(76);
		ll.PrintLL();
		
		System.out.println(ll.Search(76));  //index of the search element
		
		ll.reverse();
		ll.PrintLL();
		
	}

}
