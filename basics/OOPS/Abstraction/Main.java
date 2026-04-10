package OOPS.Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Circle circle=new Circle(5);
		Triangle triangle=new Triangle(5 , 6);
		
		circle.display();
		System.out.println(circle.area());
		System.out.println(triangle.area());

	}

}
