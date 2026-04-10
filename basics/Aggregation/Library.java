package Aggregation;

public class Library {
	String name;
	int year;
	Book[] book; //this is declared but not instantiated
	
	Library(String name,int year,Book[] book){
		this.name=name;
		this.year=year;
		this.book=book;
	}
	
	void DisplayInfo() {
		System.out.println(this.name+" "+this.year);
		System.out.println("Books Available");
		for(Book books:book) {
			System.out.println(books.Display());
		}
	}
}

