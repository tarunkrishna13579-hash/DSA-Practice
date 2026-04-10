package Patterns;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=n-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
				
			}
			System.out.println();
		}

	}
	
}
