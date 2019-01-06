package p232;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator my = new Calculator();
		
		double result1 = my.area(10);
		
		double result2 = my.area(10, 20);
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}

}
