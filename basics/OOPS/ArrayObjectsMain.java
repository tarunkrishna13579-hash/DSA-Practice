package OOPS;

public class ArrayObjectsMain {

	public static void main(String[] args) {
		ArrayObjects arr= new ArrayObjects("Ford", 2024);
		ArrayObjects arr1= new ArrayObjects("BMW", 2025);
		ArrayObjects arr2= new ArrayObjects("AUDI", 2018);
		
	/*	ArrayObjects[] var=new ArrayObjects[3];
		var[0]=arr;
		var[1]=arr1;  `						//TYPE 1 OF INITIALIZING
		var[2]=arr2; */
		
		ArrayObjects[] var= {arr,arr1,arr2}; //TYPE 2 OF INITIALIZING
		
		for(ArrayObjects car:var) {
			car.drive();
		}
	}

}
