package Generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here we are initialize different datatypes this is becz of Generics as we placed <T>in box file
		Box<Integer> box1 =new Box<>(9); 
		Box<String> box2 =new Box<>("tarun");
		Box<Double> box3 =new Box<>(2.14);
		
		System.out.println(box1.getSum());
		System.out.println(box2.getSum());
		System.out.println(box3.getSum());
	}

}
