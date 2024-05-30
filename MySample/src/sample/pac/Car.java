package sample.pac;

public class Car {
	String name;
	int num;
	public Car() {}
	public Car (String name, int num) {
		this.name = name;
		this.num = num;
		System.out.println("let the test begin");
	}
	public void drive() {
		System.out.println("this.name"+this.num);
	}
	public int drive2(int num2) {
		return num2+100;
	}
}
