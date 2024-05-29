package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07Clone {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		try {
			var fw = new FileWriter(f,true);
			fw.write("안녕하세요");
			fw.write("\n");
			fw.flush();
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
