package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//car 클래스 객체를 생성해서 참조값을 car1 이라는 car type 지역변수에 담기
		Car car1 = new Car();
		//car 클래스로 객체를 생성해서 참조값을 car2 이라는 car type 지역변수에 담기
		Car car2 = new Car();
		
		//필드에 String type 의 참조값 대입하기
		car1.name="소나타";
		car2.name="그랜저";
		
		//메소드 호출하기
		car1.drive();
		car2.drive();
		
		boolean result = car1 == car2 ; //false
		
		//car3 이라는 지역변수를 만들어 car2의 참조값을 복사
		Car car3=car2;
		car3.drive(); //그랜저가 달린다.
		boolean resulu2 = car3 == car2; // true
		car3.name = "아반떼";
		car2.drive();
		
		
	}	
}
