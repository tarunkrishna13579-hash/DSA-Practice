package BASIC;
import java.util.Scanner;

public class SumOf_N_Numbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of the numbers upto "+n+" is :"+sum);
	}

}
