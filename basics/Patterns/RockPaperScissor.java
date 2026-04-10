package Patterns;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		String[] set= {"rock","paper","scissor"};
		String playerChoice;
		String computerChoice;
		String choice;
		String play="yes";
		
		while(play!="no") {
		System.out.println("------------------ pick one : ROCK , PAPER , SCISSOR -------");
		
		Scanner sc=new Scanner(System.in);
		playerChoice=sc.nextLine().toLowerCase();
		if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("Scissor")) {
			System.out.println("invalid");
		}
		Random random =new Random();
		computerChoice=set[random.nextInt(3)];
		System.out.println("system pick is : "+computerChoice);
		
		if(playerChoice.equals(computerChoice)) {
			System.out.println("it's a tie");
		}
		else {
			System.out.println("you won");
		}
		}
	}

}
