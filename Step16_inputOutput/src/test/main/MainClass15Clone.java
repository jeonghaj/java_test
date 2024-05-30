package test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import test.dto.MemberDtoClone;

public class MainClass15Clone {
	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\object.obj");
			ois=new ObjectInputStream(fis);
			
			MemberDtoClone dto=(MemberDtoClone) ois.readObject();
			String line = String.format("번호:%d 이름:%s 주소:%s",
					dto.getNum(),dto.getName(),dto.getAddr());
			System.out.println(line);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
