package ch07.sec09;

public class Student extends Person{
	//field
	public int studentNo;
	
	//constructor
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	//method
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
