package Array;

import java.util.Scanner;

public class Secondmax {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] arr =new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			else if (arr[i] > secondmax && arr[i] != max) {
				secondmax = arr[i]; 
				}
		}
		System.out.println(secondmax);

	}

}
