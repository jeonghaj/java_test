package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		//문자열 안에서 \ 역슬래시는 특별한 기호이다.
		//main 메소드가 "시작"되었습니다.
		System.out.println("main 메소드가 \"시작\"되었습니다");
	
		//File 객체의 메소드를 활용해서
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		//존재하면 memo.txt 파일을 삭제하도록 프로그래밍해 보세요.
		
		// C:\Users\ user\playground\myFolder 파일에 관련된 작업을 할 수 있는  File 객체 생성
		File f=new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		//파일 구분자를 / 로 작성해도 File 객체 내부에서 알아서 처리해준다.
		File f2=new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
//			f.createNewFile(); //파일 생성
//			f.delete(); //파일 삭제
			boolean isExist = f.exists(); // 해당파일의 존재여부를 boolean type 으로 반환
			if(isExist) {
				f.delete();
			}else {
				f.createNewFile();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//문자열 안에서 역슬래시를 인식 시키고 싶으면 두개를 작성한다.
		System.out.println("main 메소드가 \\시작\\되었습니다.");
	}
}
