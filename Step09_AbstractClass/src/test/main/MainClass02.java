package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	//run 했을때 실행의 흐름이 시작되는 아주 특별한 static 메인 메소드
	public static void main(String[] args) {
		//동일한 클래스 안에 있는 static 메소드 호출하기
		MainClass02.test();
		test(); // 클래스명. 은 생략가능
		MainClass02.useString("bonjour");
		useString("hello");
		useWeapon(new MyWeapon());
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	//static 메소드 추가
	public static void test() {
		System.out.println("static test() 메소드가 호출됨");
	}
	
	public static void useString(String msg) {
		System.out.println("전달받은 문자열:"+msg);
	}
}
