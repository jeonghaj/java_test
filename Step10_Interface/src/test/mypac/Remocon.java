package test.mypac;
/*
 * [interface}
 *
 * - 생성자가 없다( 단독 객체 생성 불가 )
 * - 구현된 메소드는 가질 수 없다 ( 추상 메소드만 가질 수 있다 )
 * - 필드는 static final 상수만 가질 수 있다.
 * - data type 의 역할을 할 수 있다.
 * - interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *   객체를 생성해야 한다.
 * - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다
 */

public interface Remocon {

	// 필드도 정의할 수 있지만 static final 만 가능
	// static : static 영역에 Remocon 인터페이스와 같이 만들어진다.
	// final : 값이 결정된 이후에 변경 불가능(상수화 시킨다)
	// 생략 가능
	
	// final 상수는 관례상 필드명을 모두 대문자로
	public String COMPANY="LG";
	
	//메소드는 미완성의 추상 메소드만 멤버로 가질 수 있다.
	public void up();
	public void down();
	
}
