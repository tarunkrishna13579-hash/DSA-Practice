package OOPS;

public class ArrayObjects {
	
	String car;
	int model;
	
	ArrayObjects(String car,int model){
		this.car=car;
		this.model=model;
	}
	
	void drive() {
		System.out.println("ur driving "+" "+ this.car+" "+"and model is"+" "+ model);
	}

}
