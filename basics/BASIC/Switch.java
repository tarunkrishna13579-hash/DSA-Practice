package BASIC;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		String day;
		Scanner sc=new Scanner(System.in);
		day=sc.nextLine();
		day=day.toUpperCase();
		switch(day) {
		case "MONDAY","TUESDAY" -> System.out.println("weekday");
		case "FRIDAY" -> System.out.println("about to end");
		case "SATURDAY"->System.out.println("weekend");
		}
	}

}
