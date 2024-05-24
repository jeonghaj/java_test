package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;


public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();
		Monkey m1=z1.getMonkey();
		m1.say();
		// Zoo 객체를 생성해서 참조값을 z2 라는 변수에 담으세요
		Zoo z2 = new Zoo();
		// z2 안에 들어있는 참조값을 이용해서 getTiger()메소드를 호출 후
		// 리턴되는 값을 t1 이라는 변수에 담으세요
		Zoo.Tiger t1 = z2.getTiger();
		// 리턴된 Tiger 객체의 say() 메소드를 호출하세요
		t1.say();
	}
}
