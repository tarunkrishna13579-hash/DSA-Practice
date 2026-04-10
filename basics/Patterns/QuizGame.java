package Patterns;
import java.util.Scanner;
public class QuizGame {

	public static void main(String[] args) {
		String[] Questions = {"where do u study your 10th standard",
								"who is knowns as father of india",
								"currency of india"};
		
		String[][] options= {{"1. Primary","2. Secondary","3. B.tech"},
								{"1. jawaharlal","2. bose","3. gandhi"},
								{"1. dollar","2. rupees","3. pounds"}};
		Scanner sc=new Scanner(System.in);
		int[] answers= {2,3,2};
		int guess;
		int score=0;
		System.out.println("===========WELCOME TO THE GAME===============");
		for(int i=0;i<Questions.length;i++) {
			System.out.println(Questions[i]);
			for(String option:options[i]) {
				System.out.println(option);
			}
			System.out.println("Enter your Guess");
			guess=sc.nextInt();
			
			if(guess==answers[i]) {
				System.out.println("CORRECT ANSWER");
				score++;
			}
			else {
				System.out.println("WRONG ANSWER");
			}			
		}
		System.out.println("your score is : "+score+" out of 3");

	}

}
