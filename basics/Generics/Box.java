package Generics;
 
public class Box<T> {		//<T> this is generic initialization where with help of this we can call any data type while initializing object
	
	T sum;
	
	Box(T sum){
		this.sum=sum;
	}
	
	T getSum() {
		return this.sum;
	}

	public void setSum(T sum) {
		this.sum = sum;
	}
	

}
