package Arrays;

public class varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(add(1,2,3,4));  
	}
	static int add(int... number) { //here number will act as array
		int sum=0;
		for(int num:number) { 
			sum+=num;
		}
		return sum;
	}
}



//THESE ARE CALLED VARARGS (VARIABLE ARGUMENTS) -> USES TO AVOID METHOD OVERLOADING.

// we can pass any number of arguments but in parameter we have to use ELIPSIS (int...) /(String...)/(double...)

//parameter will act as array here. 
