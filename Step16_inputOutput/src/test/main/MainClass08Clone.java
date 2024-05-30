package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass08Clone {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\memo.txt");
		try {
			
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			var fr = new FileReader(f);
			
			while(true) {
			int num=fr.read();
			
			if(num == -1) {
				break;
			}
			
			char cha = (char)num;
			System.out.print(cha);
			
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
