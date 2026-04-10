package Arrays;

import java.util.Scanner;

public class Print_Array {
	public static void main(String args[]) {
		int[] arr=new int[3];
		System.out.println("Array length is "+arr.length);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		//printing using FOR-EACH LOOP
//		for(int n:arr) {               //-->For every element in the array arr, store it in variable n and run the loop.
//			System.out.println(n);
//		}
	}
}
