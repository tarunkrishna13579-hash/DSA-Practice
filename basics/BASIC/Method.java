package BASIC;
import java.util.Scanner;
public class Method {

	
				//NORMAL METHOD how it works
				
			//	public static void main(String[] args) {
			//		// TODO Auto-generated method stub
			//		Happy();
			//		Happy();
			//	}
				
			//	static void Happy() {
			//		System.out.println("hey are u happy dear");
			//		System.out.println("Hello !! ");
			//	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		person(name, age); //--> passing Arguments
		person(name, age);
		person(name, age);
		
	}
	static void person(String name, int age) {  //passing parameters
		System.out.println("hello "+name);
		System.out.println("your age is "+age);
	}
}
