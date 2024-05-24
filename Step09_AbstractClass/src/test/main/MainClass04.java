package test.main;

public class MainClass04 {
	//static 메소드 안에서 사용하려면 static 예약어가 필요하다
	public static class Gura{
		public void say() {
			System.out.println("안녕 나는 구라야");
		}
	}
	
	public static void main(String[] args) {
		Gura g=new Gura();
		g.say();
		
		//메소드 안에도 클래스를 정의할 수 있다.
		//여기 정의한 클래스는 메소드 안쪽 영역에서만 사용할 수 있다.
		//메소드 안에 정의한 클래스는 Local Inner Class 라고 한다.
		class cat{
			public void say() {
				System.out.println("야옹");
			}
		}
		
		//local Inner Class 를 이용해서 객체생성하고 사용해보기
		cat c=new cat();
		c.say();
	}
}
