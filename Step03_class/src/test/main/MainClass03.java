package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
	//객체를 생성하고 참조값을 한번도 사용하지 않고 버림
	new Car();
	
	//객체를 생성하고 참조값을 한번만 사용하고 버림(1회용)
	new Car().drive();
	
	//객체를 생성하고 참조값을 변수에 담아두고
	Car c1=new Car();
	//필요시에 여러번 사용할수 있다.
	c1.drive();
	c1.drive();
	}
}
