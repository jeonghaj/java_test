package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09Clone {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\memo.txt");
		try {
			var fr=new FileReader(f);
			var br=new BufferedReader(fr);
			
		while(true) {
						
			String line=br.readLine();
			
			if(line==null)break;
			
			System.out.println(line);
		}
		 
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
