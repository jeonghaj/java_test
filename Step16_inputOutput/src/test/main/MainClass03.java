package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream kbd = System.in;
		//2byte 처리 스트림 (65535 가지를 표현할 수 있다)
		//한글처리가능
		InputStreamReader isr=new InputStreamReader(kbd);
		var br = new BufferedReader(isr);
		
		try {
			//문자열 한줄씩 읽어들이기
			String line = br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
