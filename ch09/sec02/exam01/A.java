package ch09.sec02.exam01;

public class A {
	//Field
	int field;
	//Constructor
	A(){
		B b = new B();
		b.methodB();
	}
	//Method
	void methodA() {
		B b = new B();
		b.methodB();
	}
	//Nested Class
	class B {
		//Field
		//Constructor
		//Method
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
}
