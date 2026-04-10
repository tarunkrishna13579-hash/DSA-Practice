package OOPS;

public class Constructors {

	public static void main(String[] args) {
		Student student=new Student(24,"tarun");
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.cgpa);
		student.study();
		
Student student1=new Student(34,"virat");
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.cgpa);
		
		

	}

}
