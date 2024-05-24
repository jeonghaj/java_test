package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * [추상 클래스 Abstract Class]
 * 
 * - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할 수 있다.
 * - 형태만 정의된 메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의한다.
 * - 생성자는 존재하지만 단독으로 객체 생성은 불가하다.
 * - 추상클래스 type 의 참조값이 필요하다면 추상클래스를 상속받은 자식클래스를 정의해서 객체 생성한다.
 * - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오버라이드(재정의) 해야한다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		//추상(abstract) 클래스로 객체를 생성할 수 있을까?
//		Weapon w1 = new Weapon(); // 추상클래스 단독으로는 객체 생성 불가
		
		//단지 data type 의 역할은 할 수 있을까?
		Weapon w1 = null;
//		w1.prepare(); // NullPointerException 발생(w1 안에 참조값이 없으므로)
		
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();

	}

}
