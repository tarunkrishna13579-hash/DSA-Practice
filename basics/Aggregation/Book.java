package Aggregation;

public class Book {
	String name;
	double pages;
	
	Book(String name,double pages) {
		this.name=name;
		this.pages=pages;
	}
	String Display() {
		return this.name+" "+this.pages;
	}
}
