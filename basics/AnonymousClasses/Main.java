package AnonymousClasses;

/*
 * anonymous classes are used to call the methods inside the main class itself if it is not reusable. instead of createing 
 * new classes for single method
 */



public class Main {
	public static void main(String args[]) {
		Dog dog1=new Dog();
		
		dog1.Speak();
		
		Dog dog2=new Dog() {		//Anonymous class to override the another dog speak method
			@Override
			void Speak() {
				System.out.println("Scooby doo goes *woof woof*");
			}
		};   //end with semi-colon after the Anonymous class is ended
		dog2.Speak();
		
		
	}
}
