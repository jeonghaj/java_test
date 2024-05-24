package test.main;

import java.util.Scanner;
import test.mypac.Phone;

//java 에서 사용하는 모든 data 는 Object type 변수나 필드에 담을 수 있다.

public class MainClass07 {
	public static void main(String[] args) {
		//기본 data type 은 Wrapper Class type 으로 간주되어서 담긴다.
		Object a = 10;
		Object b = true;
		Object c = 'a';
		//모든 참조 data type 은 당연히 Object type 도 된다.
		Object d = "abdc";
		Object e = new Phone();
		Object f = new Scanner(System.in);
		
		//Object 배열은 어떤 type 이던지 다 담을 수 있따.
		Object[] objs = new Object[5];
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		
		//지역변수 e 에 저장된 참조값을 이용해서 전화를 걸어 보세요
		Phone e1 = (Phone)e;
		e1.call();
		//objs 배열의 3번방에 있는 참조값을 이용해서 전화를 걸어보세요.
		Phone g = (Phone)objs[3];
		g.call();
						
	}
}
