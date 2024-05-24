package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//콘솔창으로 부터 문자열을 읽어들이기 위한 객체 생성
		//system 클래스의 in 이라는 필드에 들어 있는 InputStream 객체는
		//콘솔창으로 부터 읽으ㅓ 들일수있는 객체이다.
		Scanner scan=new Scanner(System.in);
		System.out.println("여기에 문자열 입력:");
		
		//콘솔창으로 부터 문자열 읽어들이기
		String str=scan.next();
		
		System.out.println("main 메소드가 종료됩니다.");
		
	}

}
