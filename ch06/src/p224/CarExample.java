package p224;

import p223.*;

public class CarExample {
	public static void main(String[] args) {
		
		Car myc = new Car();
		
		myc.setGas(5);
		
		boolean gasState = myc.isL();
		if(gasState) {
			System.out.println("출발합니다");
			myc.run();
		}
		
		if(myc.isL()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
