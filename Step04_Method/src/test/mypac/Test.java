package test.mypac;
/*
 * 메소드를 만들때 고려 해야 하는것
 * 
 * 1. 접근 지정자(모르면 public)
 * 2. static or non static (모르면 non static)
 * 3. 리턴 type (모르면 void)
 * 4. 메소드 명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */

public class Test {
	
	public void walk() {
		System.out.println("걸어요");
	}
	public int getNumber() {
		int num = 10;
		return num;
	}
	//인사말을 리턴하는 메소드를 완성해 보세요.
	public String getGreeting() {
		String greet = "안녕하세요";
		return greet;
	}
	//동일한 패키지 안에 있는 AirPlane type 을 리턴해 주는 메소드
	public AirPlane getPlane() {
		AirPlane air = new AirPlane();
		return air;
//		return new AirPlane();
	}
		//int type 을 메소드의 인자로 전달 받는 메소드
		public void setNum(int num) {
			
		}
		//String type 을 메소드의 인자로 전달 받는 메소드
		public void setName(String name) {
			
		}
		// AirPlane type 을 메소드의 인자로 전달받는 메소드
		public void setPlane(AirPlane plane) {
			
		}
		//int type, String type, AirPlane type  세개를 전달받는 메소드
		public void doSomthing(int num, String name, AirPlane plane) {
			
		}
		//동일한 메소드명으로 여러개의 메소드가 정의되어 있음
		//메소드가 다중정의 되어 있다
		//메소드가 오버로딩 overloading 되어있다.
		public void send() {
			System.out.println("무언가를 전송해요");
		}
		public void send(int num) {
			System.out.println(num+"를 전송해요");
		}
		public void send(String name) {
			System.out.println(name+"를 전송해요");
		}
		public void send(AirPlane plane) {
			System.out.println("비행기를 전송해요");
		}
}
