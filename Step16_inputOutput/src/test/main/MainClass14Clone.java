package test.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDtoClone;

public class MainClass14Clone {
	public static void main(String[] args) {
		MemberDtoClone mdc = new MemberDtoClone(1,"장정하","의왕시");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("C:\\Users\\JANG\\eclipse-workspace\\myFolder\\object.obj");
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(mdc);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		
	}
}
