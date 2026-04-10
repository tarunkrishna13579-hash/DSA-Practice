package BASIC;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of m : ");
		m=sc.nextInt();
		System.out.print("enter value of n : ");
		n=sc.nextInt();
		System.out.print("Even number : ");
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers : ");
		for(int i=m;i<=n;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	
}
