package OOPS;

public class Static {

	static int NoOfCars; // if we use static here then irrespective of objects it will take total how many cars were there.
	String car;
	
	Static(String car){
		this.car=car;
		NoOfCars++;
	}
}
