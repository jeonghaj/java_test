package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		try {
			//File 로 부터 byte 알갱이를 읽어들일 객체
			var fis=new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			//byte 알갱이를 File 에 출력할 객체 생성
			var fos=new FileOutputStream("C:/Users/user/playground/myFolder/copy.jpg");
			
			//byte 일겡이를 읽어낼 배열을 미리 준비
			byte[] buffer = new byte[1024];
			while(true) {
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어들인다.
				int readedCount = fis.read(buffer); // 읽어들인 객수가 리턴된다
				System.out.println(readedCount+"byte 를 읽었습니다.");
				if(readedCount == -1) break; // 더이상 읽을 데이터 없으면 탈출
				//byte[] 배열에 저장된 byte 알갱이를 0번 인덱스부터 읽은 갯수만큼 출력
				fos.write(buffer,0 , readedCount);
			}
			System.out.println("파일을 copy 했습니다.");
			fos.close();
			fis.hashCode();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
