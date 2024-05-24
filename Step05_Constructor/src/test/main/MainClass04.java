package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		
		Random ran=new Random();
		//정수 범위 내에서 랜덤한 정수 하나 얻어내기
		int ranNum=ran.nextInt();
		System.out.println(ranNum);
		
		int ranNum2 = ran.nextInt(10);
		System.out.println(ranNum2);
		
	}
}
