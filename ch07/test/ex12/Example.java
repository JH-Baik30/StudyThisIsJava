package ch07.test.ex12;

public class Example {
	public static void action(A a) {
		if(a instanceof C c) {		//방법 1
		/*if(a instanceof C ) {		//방법 2
			C c = (C) a;		*/
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
