package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainClass07Test {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\user\\playground\\myFolder\\new.txt");
		String str="안녕하세요"	;
		try {
			//메모파일이 존재하지 않으면
			if(!f.exists()) {
				//파일 만들기
				f.createNewFile();
				System.out.println("new.txt 파일을 만들었습니다.");
			} 
			//파일에 문자열을 출력할 객체 생성
			var fw = new FileWriter(f,true); // true => append mode (추가모드)
			fw.write(str);
			fw.write("\n");
			fw.flush(); // 출력
			fw.close(); // 마무리
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
