package GettersAndSetters;

public class Car {
	
	private String Color;
	private String Brand;
	private int Price;
	
	Car(String color,String brand,int price){
		this.Color=color;
		this.Brand=brand;
		this.Price=price;
	}
	
	//GETTERS
	String getColor() {
		return this.Color;
	}
	String getBrand() {
		return this.Brand;
	}
	int getPrice() {
		return this.Price;
	}

	//SETTERS
	public void setColor(String color) {
		Color = color;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	
}
