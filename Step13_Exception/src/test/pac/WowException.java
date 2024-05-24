package test.pac;
//RuntimeException 클래스를 상속받아서 만든다
public class WowException extends RuntimeException{
	//생성자의 매개변수로 예외 메세지를 전달 받아서
	public WowException(String msg) {
		super(msg); // 부모 생성자에 전달해준다.
	}
}
