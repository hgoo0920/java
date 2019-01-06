package p229;

public class CarExample {
	public static void main(String[] args) {
		Car my = new Car();
		my.keyT();
		
		my.run();
		int speed = my.getspeed();
		System.out.println("현재 속도:" + speed + "km/h");
		}

}
