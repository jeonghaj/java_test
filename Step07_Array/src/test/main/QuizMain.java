package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		//String type 이 저장되어 있는 배열
		String[] data = {"cherry","apple","banana","melon","7"};
		// 배열에 저장된 문자열중에 1개가 랜덤하게 콘솔창에 출력되도록 프로그래밍 해 보세요.
		Random ran = new Random();
		int ranNum=ran.nextInt(5);
		System.out.println(data[ranNum]);

	}

}
