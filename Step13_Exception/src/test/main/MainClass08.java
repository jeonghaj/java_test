package test.main;

import java.util.Random;

import test.pac.WowException;

public class MainClass08 {
	public static void main(String[] args) {
		//try 블록 안의 지역변수는 블록 바깥에서 사용 불가능
		//int typ 을 담을 지역변수를 블록 바깥에 미리 만들어 놓는다
		int ranNum=0;
		try{
			Random ran = new Random();
//			랜던한 숫자를 미리 만들어둔 지역변수에 담는다
		ranNum = ran.nextInt(10); // int 선언 없앰 [ 중복선언 ]
		
		if(ranNum==7) {
			throw new WowException("행운의 7번 입니다");
		}
		}catch(WowException we) {
			we.printStackTrace();
		}
		System.out.println(ranNum+"숫자가 나왔습니다.");
	}
}
