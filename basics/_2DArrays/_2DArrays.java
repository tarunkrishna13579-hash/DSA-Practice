package _2DArrays;

import java.util.Scanner;

public class _2DArrays {
	//=============================================DECLARATIONS======================
	
	public static void main(String[] args) {
//		//hardcode type declaration
//		int[] arr1= {1,2,3};
//		int[] arr2= {1,2,3};
//		
//		int[][] result = {arr1,arr2};
//		
//		for(int[] pri:result) {  //here we are fetching each Array ->arr1 & arr2
//			for(int val:pri) {   // here we are fetching each number inside the arr1 & arr2
//				System.out.print(val);
//			}
//			System.out.println();
//		}
		
		
//		// 2nd way of declaring
//		String[][] fruitsNveg = {{"apple","banana"},{"brinjal","potato"}};
//		for(String[] food:fruitsNveg) {
//			for(String result:food) {
//				System.out.println(result);
//			}
//			System.out.println();
//		}
		
		
		//USER INPUT 
		int rows,columns;
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		columns=sc.nextInt();
		int[][] arr = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int[] val:arr) {
			for(int res:val) {
				System.out.print(res);
			}
			System.out.println();
		}
		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<columns;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
	}
}
