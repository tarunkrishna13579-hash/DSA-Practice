package GettersAndSetters;

public class Main {

	public static void main(String[] args) {
		Car car=new Car("yellow", "BMW", 500000);
		
		car.setBrand("Audi");//USED SETTER'S FOR THIS
		
		System.out.println(car.getColor()+" "+car.getBrand()+" "+car.getPrice()); //used gettes for this
	}

}
