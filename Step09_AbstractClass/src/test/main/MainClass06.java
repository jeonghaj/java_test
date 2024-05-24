package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		//Weapon type 의 참조값 얻어내기
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("아무나 공격합니다.");
			}
		};
		
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("이제 뭘 공격하지");
			}
		});
	}
	
	//MainClass06 의 멤버 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
