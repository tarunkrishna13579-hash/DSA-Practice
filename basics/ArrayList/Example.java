package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.print("print number of fruits :");
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		sc.nextLine();
		ArrayList<String> fruits =new ArrayList<>();
		
		for(int i=1;i<=number;i++) {
			System.out.print("Enter Fruit name #"+i+":");
			String ft=sc.nextLine();
			fruits.add(ft);
		}
		System.out.println(fruits);
		sc.close();
	}
	
}
