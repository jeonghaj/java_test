package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass10Clone {
	public static void main(String[] args) {
		var sb = new StringBuilder();
		File f = new File("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\memo.txt");
		try {
			var fr=new FileReader(f);
			var br=new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line==null)break;
				
				sb.append(line);
				sb.append("\n"); // 개행기호 누적
				
			}
				
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(sb.toString());
				
	}
}
