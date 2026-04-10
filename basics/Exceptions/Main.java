package Exceptions;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		/*
		 * if we get any exception then we will use try{}. catch{}  blocks to get rid of exceptions
		 * 
		 * finally{}  is used to close the resources. this will run program even after exception
		 */
		
//		try {
//		int n=1/0;
//		System.out.println(n);  //-> here we will get error becz 0 can't devide then catuch will get executed.
//		}
//		
//		catch(ArithmeticException ae){
//			System.out.println("we can't devide");
//		}
		
		
		try {
			int st;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number :");
			st=sc.nextInt();
			System.out.println(st);
		}
		catch(Exception e){
			System.out.println("We Got the Exception");
		}
		
	}

}
