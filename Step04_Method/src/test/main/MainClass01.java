package test.main;

import test.mypac.AirPlane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t=new Test();
		//return type 이 void 인 메소드 호출
		t.walk();
		//return type 이 int 인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에 담기
		int a = t.getNumber();
		//return type 이 String 인 메소드 호출하고 리턴되는 값을 b 라는 String type 지역변수에 담기
		String b = t.getGreeting();
		//return type 이 AirPlane 인 메소드를 호출하고 리턴되는 값을 c 라는 AriPlane type 지역변수에 담기
		AirPlane c = t.getPlane();
		//c 에 담긴값을 이용해서 fly() 메소드를 호출하세요.
		c.fly();
		
		//위에서 생성한 객체의 setNum() 메소드를 호출해 보세요.
		t.setNum(10);
		t.setNum(a);
		// setName()
		t.setName("hello");
		t.setName(b);
		// setPlane()
		t.setPlane(new AirPlane());
		t.setPlane(c);
		
		t.doSomthing(a, b, c);
		t.doSomthing(20, "hello", new AirPlane());
	
		t.send();
		t.send(c);
		t.send(a);
		t.send(b);
	}
}
