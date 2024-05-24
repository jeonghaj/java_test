package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		//MyUtil 클래스의 static 메소드 호출
		MyUtil.send();
		//MyUtil 클래스의 static 필드 참조
		String a=MyUtil.version;
	}
}
