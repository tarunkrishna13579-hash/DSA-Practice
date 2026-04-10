package Patterns;
import java.util.Scanner;
public class aescColPattern {
	public static void main(String[] args) {
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
