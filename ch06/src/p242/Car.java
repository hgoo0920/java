package p242;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myc = new Car();
		myc.speed = 60;
		myc.run();
	}

}
