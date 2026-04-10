package BASIC;
import java.util.*;
import java.util.Scanner;

public class PrintNumbers1toN {
	public static void main(String args[]) {
		//print from 1 to 10
		/*int n=10;
		for(int i=1;i<n;i++) {
			System.out.print(i + " ");
		}*/
		
		//take input from user from m to n
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of m : ");
		m=sc.nextInt();
		System.out.print("enter value of n : ");
		n=sc.nextInt();
		for (int i=m;i<=n;i++) {
			System.out.print(i+" ");
		}
	}	
}
