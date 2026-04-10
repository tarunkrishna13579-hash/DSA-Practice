package OOPS;
//==========	THIS CLASS IS USED BY OBJECTS CLASS		======================
public class Car {
	String name="BMW";
	String color="Blue";
	int year=2025;
	boolean isStart=false;
	
	void start() {
		isStart=true;
		System.out.println("ENGINE STARTED");
	}
	
	void stop() {
		isStart=false;
		System.out.println("ENGINE STOPED");
	}
	
}
