package OOPS;

public class Objects {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.color="red";
		
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.year);
		System.out.println(car.isStart );
		
		car.start();
		System.out.println(car.isStart);
		car.stop();
		System.out.println(car.isStart);
		
	}
}
