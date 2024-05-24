package test.auto;

public class SportsCar extends Car{
	public SportsCar (Engine engine) {
//		super() 는 부모 생성자(Car 클래스의 생성자) 를 의미한다.
//		부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달해야한다.
//		super() 코드 실행전에 다른 코드가 있으면 안된다
		super(engine);
	}
	//메소드
	public void openDrive() {
		
		// 부모객체의 필드도 this. 해서 참조할 수 있다.
		if(this.engine==null) {
			System.out.println("cant drive there is no engine");
			return; // 메소드를 여기서 리턴시키기(종료시키기)
		}
		System.out.println("뚜껑을 열고 달려요");
	}
}
