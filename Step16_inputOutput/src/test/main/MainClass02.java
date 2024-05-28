package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream kbd = System.in;
		//2byte 처리 스트림 (65535 가지를 표현할 수 있다)
		//한글처리가능
		InputStreamReader isr=new InputStreamReader(kbd);
		System.out.println("입력");
		
		try {
			//입력한 키의 code 값 읽어오기
			int code = isr.read();
			System.out.println("code:"+code);
			//code 값에 대응되는 문자 얻어내기 / casting
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
