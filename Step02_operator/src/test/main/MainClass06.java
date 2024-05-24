package test.main;

public class MainClass06 {
	//3항 연산자
	public static void main(String[] args) {
		boolean isWait=true;
		//isWait 이 true 면 "기다려요"/ false 면 "기다리지 않아요" 가 대입
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
		System.out.println(result);
		
		//위의 3함 연산자는 아래와 같이 if ~ else 문과 같은 로직이다.
		String result2 = null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
