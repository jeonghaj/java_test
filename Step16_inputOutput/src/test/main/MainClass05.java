package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps=System.out;
		//PrintStream 객체의 참조값을 부모 type 변수에 담기
		//OutputStream 은 1byte 처리 스트립 // 한글처리 불가
		OutputStream os = ps;
		//2byte 처리 스트림 // 한글처리 가능
		var osw=new OutputStreamWriter(os);
		
		try {
			osw.write(44032);
			osw.write("\n");
			osw.write("야근");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
