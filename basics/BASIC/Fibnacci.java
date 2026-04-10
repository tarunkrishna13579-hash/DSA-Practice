package BASIC;
import java.util.Scanner;
public class Fibnacci {
	
//	 static int fib(int n) {
//		if(n<=1) {
//			return n;
//		}
//		return fib(n-1)+fib(n-2);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n;
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
//		
//		for(int i=0;i<n;i++) {
//		System.out.print(fib(i)+" ");	
//			
//		}
//	}
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int f=1;int s=1;int t;
		
		System.out.print(f+" ");
		System.out.print(s);
		for(int i=3;i<n;i++) {
			t=f+s;
			System.out.print(" "+t);
			f=s;
			s=t;
		}
	}

}
