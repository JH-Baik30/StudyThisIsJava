package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {

		Calculator myCalcu = new Calculator();

		double resul1 = myCalcu.areaRectangle(10);

		double resul2 = myCalcu.areaRectangle(10, 20);

		System.out.println(resul1);
		System.out.println(resul2);
	}

}
