package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 1. 콘솔 창에 "main 메소드가 시작 되었습니다." 를 출력해 보세요
		System.out.println("main 메소드가 시작 되었습니다.");
		// 2. 국어 점수 95를 kor 이라는 변수에 담아보세요.
		byte kor=95;
		// 3. 국어점수 100을 eng 라는 변수에 담아보세요.
		byte eng=100;
		// 4. 국어 점수와 영어 점수의 평균을 구해서(연산자 활용) avg 라는 변수에 담아 보세요.
//		int avg = (kor+eng)/2;
		double avg = (kor+eng)/2d;
		//5. 콘솔찰에 avg 변수안에 담긴 내용을 출력해 보세요.
				System.out.println(avg);
	}

}
