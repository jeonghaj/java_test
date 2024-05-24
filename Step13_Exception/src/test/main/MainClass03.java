package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌 수 입력: ");
		String inputNum1=scan.nextLine();
		try {
		System.out.println("나누어지는 수 입력: ");
		String inputNum2=scan.nextLine();
		//문자열 형태의 숫자를 실제 정수로 변경하기
		int num1=Integer.parseInt(inputNum1);
		int num2=Integer.parseInt(inputNum2);
		//계산하기
		int result1=num2/num1; // 몫
		int result2=num2%num1; // 나머지
		System.out.println(num2+"를"+num1+"으로 나눈 몫 :"+result1);
		System.out.println(num2+"를"+num1+"으로 나눈 나머지 :"+result2);
		//Exception type은 모든 예외의 부모 type 이기 때문에 모든 예외가 여기서 처리된다.
		}catch (Exception e) {
			e.getMessage();
		}finally {
			// 예외가 발생을 하건 안하건 반드시 실행이 보장되는 블럭
			//중요한 마무리 작업을 여기서 주로 수행한다.
			System.out.println("중요한 마무리 작업");
		}
	}
}
