package Interfaces;

public class Fish implements Hunting,Escape{

	@Override
	public void run() {
		System.out.println("Fish is Swimming away");
	}
	@Override
	public void hunt() {
		System.out.println("Fish is hunting");
	}
}
