package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainTest {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\user\\playground\\myFolder\\new.txt");
		String str="안녕하세요"	;
		try {
			var wr=new FileWriter(f);
			wr.write(str);
			wr.write("반갑습니다");
			wr.flush();;
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
