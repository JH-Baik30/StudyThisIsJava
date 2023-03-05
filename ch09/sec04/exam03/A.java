package ch09.sec04.exam03;

public class A {
	public void method1(int arg) { // class B 안에서 arg,var가 final 속성을 가짐
		int var = 1;
		
		class B{
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
				//arg = 2;
				//var = 2;
			}
		}
		
		//arg = 2;
		//var = 2;
		
		System.out.println("arg: " + arg);
		System.out.println("var: " + var);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.method1(3);
	}
}
