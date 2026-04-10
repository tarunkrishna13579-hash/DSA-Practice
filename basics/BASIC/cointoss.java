package BASIC;
import java.util.Random;
public class cointoss {

	public static void main(String[] args) {
		
		
		Random random=new Random();
//		boolean headortails;		
//		headortails=random.nextBoolean();
//		if(headortails==true) {
//			System.out.println("heads");
//		}
//		else {
//			System.out.println("tails");
//		}
		
//		int num;
//		num=random.nextInt(1,7);
//		System.out.println(num);
		

		String[] name={"tarun","kohli","virat"};
		String tarun=name[random.nextInt(3)];
		System.out.println(tarun);
		
	}
}
