package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * C:/Users/user/playground/myFolder/new.txt 파일에 저장된 문자열을 읽어와서
 * 콘솔창에 출력
 */
public class MainClass08 {
	public static void main(String[] args) {
		//new.txt 파일을 access 할 수 있는 File 객체 생성
		File f=new File("C:/Users/user/playground/myFolder/new.txt");
		try {
			//파일로부터 문자열을 읽어들일 수 있는 FileReader 객체 생성 
			var fr=new FileReader(f);
			//read()가 한글자씩 읽기때문에 무한루프 이용
			while(true) {
			int code = fr.read();	
			// 만약 다 읽었다면  = 끝에 다다르면
			if(code ==-1) {
				break; //반복문 탈출
			}
			//코드를 char type 으로 변환
			char ch=(char)code;
			//출력
			System.out.print(ch);
			}
			
			//해당파일이 존재하지 않을경우 Exception -> try...catch
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
