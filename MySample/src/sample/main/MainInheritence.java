package sample.main;

import sample.pac.Car;
import sample.pac.SecondCar;

public class MainInheritence {
	public static void main(String[] args) {
		Car t1 = new Car("hello", 123);
		SecondCar t2 = new SecondCar("world", 456);
		
		t1.drive();
		t2.drive();
		
		Car t3 = new Car("hi",120);
		int result = t3.drive2(100);
		System.out.println(result);
		
		Car t4 = new Car();
		int result2 = t4.drive2(200);
		System.out.println(result2);
	}
}