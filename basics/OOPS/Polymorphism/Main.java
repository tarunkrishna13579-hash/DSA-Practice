package OOPS.Polymorphism;

public class Main {

	public static void main(String[] args) {
		Car car=new Car();
		Bike bike=new Bike();
		Boat boat=new Boat();
		
		
//so, if we want to call them all to perform a race, then we need to call all three at a time.so, we create a array object 
		Vehicle[] vehicles = {car,bike,boat};
		
		for(Vehicle vehicle:vehicles) {
			vehicle.go();
		}

	}

}
