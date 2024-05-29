package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass00 {
	public static void main(String[] args) {
		File f = new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			
			while(true) {
			
			
			String line = br.readLine();
			
			if(line == null) break;
			
			System.out.println(line);
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
