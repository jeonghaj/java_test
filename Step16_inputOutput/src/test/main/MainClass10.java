package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * C:/Users/user/playground/myFolder/new.txt 파일에 저장된 문자열을 읽어와서
 * 콘솔창에 출력
 */
public class MainClass10 {
	public static void main(String[] args) {
		//문자열을 누적시킨다음 한번에 문자열을 얻어낼 수 있는객체 생성
		var sb=new StringBuilder();
		File f=new File("C:/Users/user/playground/myFolder/new.txt");
		try {
			var fr=new FileReader(f);
			var br=new BufferedReader(fr);
			
			while(true) {
			String line=br.readLine();
			if(line == null) break;
			
			//읽어낸 문자열을 StringBuilder 객체에 누적시키기
			sb.append(line);
			sb.append("\r\n"); // 개행기호도 같이 누적
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//StringBuilder 객체에 누적된 문자열을 한번에 얻어내기
		String result=sb.toString();
		System.out.print(result);

	}
}
