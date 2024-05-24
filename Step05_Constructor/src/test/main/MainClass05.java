package test.main;

import java.util.Random;

public class MainClass05 {

	public static void main(String[] args) {
		// -10 ~ 10 사이의 랜덤한 정수 얻어내기
		Random ran=new Random();
		int ranNum=ran.nextInt(-11,11);
		// 75 ~ 100 사이의 정수를 얻어내 보세요
		int ranNum2=ran.nextInt(74,101);
		// 1 ~ 45 사이의 랜덤한 정수를 얻어내 보세요
		int ranNum3=ran.nextInt(0, 46);
		
		System.out.println(ranNum);
		System.out.println(ranNum2);
		System.out.println(ranNum3);
	}


}
