package P1;

//  NODE CLASS
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

//  LINKED LIST CLASS
class MyLinkedList1 {
    ListNode1 head;

    // Insert at Head
    public void InsertAtHead(int val) {
        ListNode1 newNode = new ListNode1(val);
        newNode.next = head;
        head = newNode;
    }

    // Insert at Tail
    public void InsertAtTail(int val) {
        ListNode1 newNode = new ListNode1(val);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode1 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Insert at Index
    public void insertAtIndex(int index, int val) {
        if (index == 0) {
            InsertAtHead(val);
            return;
        }

        ListNode1 curr = head;

        for (int i = 0; i < index - 1; i++) {
            if (curr == null) {
                System.out.println("Index out of bound");
                return;
            }
            curr = curr.next;
        }

        ListNode1 newNode = new ListNode1(val);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //  MERGE TWO SORTED LINKED LISTS
    public static ListNode1 MergeLL(ListNode1 list1, ListNode1 list2) {
        ListNode1 dummy = new ListNode1(-1);
        ListNode1 temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
            	temp.next = list1;
            	temp = list1.next;
            } else {
            	temp.next = list2;
                temp = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
        	temp.next = list1;
        } else {
        	temp.next = list2;
        }

        return dummy.next;
    }

    // Print Linked List
    public void PrintLL() {
        ListNode1 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

//  MAIN CLASS
public class MergeLL {
    public static void main(String[] args) {

        MyLinkedList1 ll1 = new MyLinkedList1();
        MyLinkedList1 ll2 = new MyLinkedList1();

        // First list: 1 → 3 → 5
        ll1.InsertAtTail(1);
        ll1.InsertAtTail(3);
        ll1.InsertAtTail(5);
        System.out.print("List 1: ");
        ll1.PrintLL();

        // Second list: 2 → 4 → 6
        ll2.InsertAtTail(2);
        ll2.InsertAtTail(4);
        ll2.InsertAtTail(6);
        System.out.print("List 2: ");
        ll2.PrintLL();

        //  Merge the two lists
        ListNode1 mergedHead = MyLinkedList1.MergeLL(ll1.head, ll2.head);

        //  Print merged list
        System.out.print("Merged List: ");
        ListNode1 curr = mergedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
