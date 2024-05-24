package test.mypac;

public class MyWeapon extends Weapon {

	//부모클래스의 추상메소드를 반드시(강제로) 오버라이드 해야한다.
	@Override
	public void attack() {
		//어디를 공격할지는 프로젝트 상황에 맞게 마응대로 공격하면 된다.
		System.out.println("지상을 공격합니다.");
	}

}
