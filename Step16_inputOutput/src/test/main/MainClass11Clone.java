package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass11Clone {
	public static void main(String[] args) {
		try {
			var fis=new FileInputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\images.jpg");
			var fos=new FileOutputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\copy.jpg");
			
			while(true) {
				int readByte=fis.read();
				if(readByte==-1) break;
				
				fos.write(readByte);
				fos.flush();
			}
			System.out.println("파일을 카피했습니다.");
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
