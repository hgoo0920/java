package p224;

import p223.*;

public class CarExample {
	public static void main(String[] args) {
		
		Car myc = new Car();
		
		myc.setGas(5);
		
		boolean gasState = myc.isL();
		if(gasState) {
			System.out.println("����մϴ�");
			myc.run();
		}
		
		if(myc.isL()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���");
		}
	}

}
