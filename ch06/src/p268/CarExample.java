package p268;

import p267.*;

public class CarExample {
	public static void main(String[] args) {
		Car my = new Car();
		
		my.setSpeed(-50);
		
		System.out.println("현재 속도:" + my.getSpeed());
		
		my.setSpeed(60);
		
		if(!my.isStop()) {
		my.setStop(true);
		}
		System.out.println("현재 속도: "+ my.getSpeed());
	}

}
