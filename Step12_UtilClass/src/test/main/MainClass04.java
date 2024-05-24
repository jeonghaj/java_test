package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
	//1. Car type 을 저장할수 있는 ArrayList 객체를 생성해서
	//참조값을 List 인터페이스 type 지역변수 cars 에 담아보세요
	List<Car> cars = new ArrayList<>();
	//2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
	cars.add(new Car("type1"));
	cars.add(new Car("type2"));
	cars.add(new Car("type3"));
	//3. 일반 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
	for(int i=0; i<3; i++) {
		Car temp = cars.get(i);
		temp.drive();
	}
	//4. 확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
	for(Car temp:cars) {
		temp.drive();
	}
	//5. Consumer 인터페이스를 황용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를순서대로 호출
	Consumer<String> con = new Consumer<>() {
		@Override
		public void accept(String t) {
			
		}	
	};
	cars.forEach((tmp)->{
		tmp.drive();
		});
	}
}

