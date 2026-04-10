package Patterns;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int space=n-i;space>0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--) {
			for(int space=0;space<n-i;space++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
