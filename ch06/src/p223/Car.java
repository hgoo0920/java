package p223;

public class Car {
	
	int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isL() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ�: " + gas + ")");
				gas -=1;
			} else {
				System.out.println("����ϴ�.(gas �ܷ�: " + gas + ")");
				return;
			}
			
		}
	}

}
