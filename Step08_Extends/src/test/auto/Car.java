package test.auto;
/*
 * 접근지정자 접근 범위
 * 
 * public 어디에서나 접근 가능
 * protected  동일한 package 혹은 상속관계에서 자식이 접근 가능
 * default(작성안함) 동인한 package 안에서만 접근 가능
 * private 동일한 클래스 혹은동일한 객체 안에서만 접근가능
 * 
 * 접근 지정자를 붙이는 위치
 * 
 * 클래스를 선언 할때 // import 가능 여부를 결정한다
 * 생성자 // 객체 생성 가능 여부를 결정한다
 * 필드 // 필드 참조 가능 여부를 결정한다.
 * 메소드 // 메소드 호출 가능 여부를 결정한다.
 * 
 * 클래스는 default 와 public 두가지의 접근지정만 지정 가능하다
 * 접근지정자를 생략한것이 default 접근 지정자이다
 */
public class Car {
	//필드 ( protected 는 패키지가 달라도 상속관계 자식이면 참조가능 )
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자 (이 생성자를 정의하면 default 생성자는 사라진다)
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없다");
			return ; //메소드를 여기서 리턴시키기(종료 시키기)
		}
	System.out.println("달려요");
	}
}
