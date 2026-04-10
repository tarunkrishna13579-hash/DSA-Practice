package Patterns;

import java.util.Scanner;

public class AscnRowPattern {

	public static void main(String[] args) {
		/* 1111
		 * 2222
		 * 3333
		 * 4444
		 * 5555
		 */
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);  //if we print j then it will print like 12345  upto how many rows we enter
			}
			System.out.println();
		}
	}

}
