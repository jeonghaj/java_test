package test.mypac;
// 가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone extends Object{//extends 예약어가 없으면 자동으로 extends object 된다.
	//생성자
	public Phone() {
		System.out.println("phone 생성자 호출됨");
	}
	//전화를 거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
