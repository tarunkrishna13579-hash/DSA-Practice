package OOPS;

									//USED BY CONSTRUCTORS CLASS
public class Student {

	int age;
	String name;
	Double cgpa=9.2;
	boolean isStudying;
	void study() {
		System.out.println("please study"+name);
	}
	Student(int a,String b) {
		this.age=a;
		this.name=b;
		
	}
}
