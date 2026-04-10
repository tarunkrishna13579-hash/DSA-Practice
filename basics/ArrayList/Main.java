package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<>();
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		
		System.out.println(number);
		
		number.remove(3);
		System.out.println(number);
		
		number.set(1,9);
		System.out.println(number);
	}

}
