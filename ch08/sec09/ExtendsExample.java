package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA iA = impl;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
	}
}
