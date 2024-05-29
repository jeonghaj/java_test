package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * C:/Users/user/playground/myFolder/new.txt 파일에 저장된 문자열을 읽어와서
 * 콘솔창에 출력
 */
public class MainClass09 {
	public static void main(String[] args) {
		File f=new File("C:/Users/user/playground/myFolder/new.txt");
		try {
			var fr=new FileReader(f);
			var br=new BufferedReader(fr);
			
			while(true) {
			//한줄씩 읽어낸다
			String line=br.readLine();
			//더이상 읽어올 문자열이 없으면 반복문 탈출
			if(line == null) break;

			System.out.println(line);
			}
			
			//해당파일이 존재하지 않을경우 Exception -> try...catch
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
