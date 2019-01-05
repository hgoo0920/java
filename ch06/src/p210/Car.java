package p210;

public class Car {

	public String company ="현대자동차";
	public String model;
	public String color;
	public int maxspeed;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
