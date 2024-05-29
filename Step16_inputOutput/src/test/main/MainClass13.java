package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수를 미리 만들어놓고
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//참조값은 try 블록 안에서 
			fis=new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			fos=new FileOutputStream("C:/Users/user/playground/myFolder/copy.jpg");
			
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
	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//예외가 발생하던 안하던 실행이 반드시 보장되는 블럭 / 마무리작업
			System.out.println("파일을 copy 했습니다.");
			try {
				// null 체크를 한 후에 마무리 메소드를 호출한다.
				if(fos!=null)fos.close();
				if(fos!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
