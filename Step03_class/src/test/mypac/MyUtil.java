package test.mypac;
// static
// static 예약어를 붙여서 필드나 메소드를 정의하면 클래스와 함께 static 영역에 만들어진다.
// static 필드나 메소드를 사용할때는 클래스명에 . 찍어서 사용하면 된다.

//MyUtil.version // static 필드 참조
//MyUtil.send() // static 메소드 호출

public class MyUtil {
	//data type 앞에 static 예약어를 붙여서 static 필드를 만들 수 있다.
	//필드는 선언시에 초기값을 넣어줄수도 있다.
	public static String version="1.0";
	
	//method 의 return type 앞에 static 예약어를 붙여서 static 메소드를 만들 수 있따.
	public static void send() {
		System.out.println("전송합니다");
	}
}
