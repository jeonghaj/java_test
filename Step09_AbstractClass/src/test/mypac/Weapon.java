package test.mypac;
//미완성된 추상메소드를 멤버로 가지고 있는 클래스는 abstract 예약어를 붙여 정의 해야 한다.
public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	public abstract void attack();
	
}
