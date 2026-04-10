package ToString;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	@Override		// we can print direct object in the print statement.
	public String toString() {
		return this.name+" "+this.age+" "+this.salary;
	}

}
