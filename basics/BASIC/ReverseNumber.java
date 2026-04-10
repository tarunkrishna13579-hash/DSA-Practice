package BASIC;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int reversed=0;
		while(n!=0) {
		int units=n%10;
		reversed=reversed*10+units;
		n/=10;
		}
		System.out.println(reversed);
		int size=String.valueOf(reversed).length();
		
		System.out.println("size of the number is : "+size);
	}
	

}
