package BASIC;
import java.util.Scanner;
public class PrimeNumbers {
//	public static void main(String args[]) {
//		int n;
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
//		int count=0;
//		for(int i=2;i<n;i++) {
//			if(n%i ==0) {
//				count++;
//			}
//		}
//			if(count>0) {
//				System.out.println(n+" not prime number");
//			}		
//			else {
//				System.out.println(n+"a prime");
//			}	
		
//}
		
	// PRIME NUMBERS FROM N T0 N
		public static boolean isPrime(int n) {
			if(n==0 ||n==1) return false;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<b;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
	}
}

