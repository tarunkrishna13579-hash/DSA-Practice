package OOPS;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static cal=new Static("BMW");
		Static cal1=new Static("audi");
		Static cal2=new Static("ford");
		Static cal3=new Static("innova");
		
//irrespective of how many objects we create it will give us shared output. for all objects.as we mentioned static int NoOfCars
		System.out.println(cal.car);
		System.out.println(cal.NoOfCars); // here 3 obj have 3 cars name-> total cars were 3 so output is 3.
	}	

}
