package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static class SeaWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("바다에 있는 적 공격");
		}
		
	}
	
	public static void main(String[] args) {
		//추상클래스 type 의 참조값을 Inner Class 를 이용해서 얻어낸다.
		Weapon w1=new SeaWeapon();
		w1.attack();
		w1.prepare();
		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("우주에 있는 적을 공격");
			}
		}
		//추상클래스 type 의 참조값을 Local Inner Class 를 이용해서 얻어낸다
		Weapon w2 = new SpaceWeapon();
		w2.attack();
		w2.prepare();
	}
}
