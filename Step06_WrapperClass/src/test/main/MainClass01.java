package test.main;

public class MainClass01 {
	public static void main(String[] args) {
/*
 * 기본 deta type 의 참조 data type
 * byte   : Byte
 * short  : Short
 * int    : Integer
 * long   : Long
 * 
 * float  : Float
 * double : Double
 * 
 * char   : Character
 * boolean: Boolean
 * 
 * - 때로는 기본 데이터타입의 참조데이터 타입이 필요할 때가 있다
 * - 기본데이터타입을 객체에 포장(boxing) 하는 형태이다
 * - obxing 과  unboxing 은 자동으로 되기 때문에 프로그래머가 신경을 쓸 필요는 없다.
 */
		
		int num1=10;
//		integer num2=new Integer(10);
		Integer num2=10;
		
		//참조 데이터 타입 이지만 기본 데이터 타입 처럼 사용할 수 있다
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		//정수 10 을 문자열 "10" ㅇ로 변환해서 리턴해주는 메소드도 사용 가능
		String result=num2.toString();
		//Integer 클래스의 static 메소드를 이용해서 문자열을 실제 숫자로 변환
		int result4 = Integer.parseInt("999");
		
	}
}
