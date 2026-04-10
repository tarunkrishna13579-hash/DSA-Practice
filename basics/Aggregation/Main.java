package Aggregation;

public class Main {
	/*
	 * Agreegation  represents a “has-a” relationship between two classes
	 * 
	 *   		->Aggregation means one class contains another class, but the contained object can exist independently.
	 * 
	 */
	public static void main(String[] args) {
		
		Book book1 =new Book("peter parker returns",253);
		Book book2 =new Book("The Ages of dragon",520);
		Book book3 =new Book("King kong era",223);
		
		Book[] book= {book1,book2,book3};
//		System.out.println(book1.Display());
//		System.out.println(book2.Display());
//		System.out.println(book3.Display());
		
		
		Library library=new Library("IT library",2002,book);
		library.DisplayInfo();
	}

}
