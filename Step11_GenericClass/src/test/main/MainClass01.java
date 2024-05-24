package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스를 Apple 로 지정해서 객체 사용하기
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		box.pack(new Apple());
		Apple a1 = box.unpack();
		//Generic 클래스를 Melon 으로 지정해서 객체 사용하기
		FruitBox<Melon> box2=new FruitBox<>();
	
		box2.pack(new Melon());
		Melon m1 = box2.unpack();
		
		//Generic 클래스를 Orange 로 지정해서 객체 사용하기
		FruitBox<Orange> box3=new FruitBox<>();
		box3.pack(new Orange());
		Orange o1 = box3.unpack();
		
	}
}
