package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass08Clone {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		try {
			var fr = new FileReader(f);
			
			while(true) {
			int num=fr.read();
			
			if(num == -1) break;
			
			char cha = (char)num;
			System.out.print(cha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
