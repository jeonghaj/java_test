package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12Clone {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\images.jpg");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\copy2.jpg");
			
			byte[] readByte = new byte[1024];
			
			while(true) {
				int e = fis.read(readByte);
				if(e==-1)break;
				
				fos.write(readByte,0,e);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
