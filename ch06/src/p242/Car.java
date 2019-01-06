package p242;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myc = new Car();
		myc.speed = 60;
		myc.run();
	}

}
