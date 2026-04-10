package OOPS.Polymorphism.Runtime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	    /* we need to run this based on user input. -> this is run time polymorphism
		
		->we can initialize an abstarct method but cannot instanitaze the class.
		
		*/
		
		Scanner sc=new Scanner(System.in);
		
		Animal animal;
		while(true) {
		System.out.println("please select 1. for dog & 2. for cat");
		int choose =sc.nextInt();
		if(choose==1) {
			animal= new Dog();
			animal.speak();
			
		}
		else if(choose==2) {
			animal =new Cat();
			animal.speak();
			
		}
		}	
		
		
	}
}
