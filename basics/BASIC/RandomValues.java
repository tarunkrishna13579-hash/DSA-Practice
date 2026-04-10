package BASIC;
import java.util.Random;

public class RandomValues {
	 public static void main(String[] args) {
//		 //RANDOM_NUMBER
//	        Random random = new Random();
//	        int num = random.nextInt();
//	        num=Math.abs(num);
//	        System.out.println(num);
	 
//		 //HEADS OR TAILS		 

//		 boolean isheads;
//		 Random random=new Random();
//		 isheads=random.nextBoolean();
//		 if(isheads==true) {
//			 System.out.println("Heads");
//		 }
//		 else {
//			 System.out.println("Tails");
//		 }
		 
		 //RANDOM FRM N TO N
		 int dice;
		 Random random=new Random();
		 dice=random.nextInt(1,7);  //here 1 is inclusive and 7 is exclusive
		 System.out.println(dice);
	 }		 
}
