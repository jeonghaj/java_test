package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public MainClass04() {
		//HandPhone 객체를 생성해서 나온 참조값을 Object type p3 라는 지역변수에 담기
		Object p3=new HandPhone();
		//casting 연산자를 이용해서 대입연산자의 우측을 Phone type 으로 인식되도록 한다.
		Phone p2=(Phone)p3;
		//casting 연산자를 이용해서 대입연산자의 우측을 HandPhone type 으로 인식되도록 한다.
		HandPhone p1=(HandPhone)p3;
		
	}
}
