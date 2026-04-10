package Queue;

class queue{
	int front;
	int rear;
	int capacity;
	int arr[];
	
	queue(int size){
		capacity=size;
		arr=new int[capacity];
		front=0;
		rear=-1;
	}
	
	
	public boolean isEmpty() {
        return front > rear;
    }
	
    public boolean isFull() {
        return rear == capacity - 1;
    }
    
    
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		rear++;
		arr[rear]=val;
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is already empty");
			return -1;
		}
		int removed=arr[front];
		front++;
		return removed;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("nothing to print");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}

public class QueueUsingArray {

	public static void main(String[] args) {
		
		queue q=new queue(5);
		
		q.enqueue(25);
		q.enqueue(35);
		q.enqueue(45);
		
		q.display();
		
		System.out.println(q.dequeue());
		
	}

}
