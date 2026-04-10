package Array;

import java.util.Scanner;

public class RemoveDuplicatesSorted {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int second=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[second]=arr[i];
				second++;
			}
		}
		for(int i=0;i<second;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
