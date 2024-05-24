package test.main;
/*
 * RuntimeException 을 상속받지 않은 Exception type 은
 * 반드시 try ~ catch 블럭으로 예외처리를 해야 된다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		try {
			//스레드를 일정시간 지연 시키기 ( millisecond 단위로 숫자를 전달하면 된다)
			Thread.sleep(1000*5);
		} catch (InterruptedException e) { //RuntimeException 을 상속받지 않은 Exception
			e.printStackTrace();
		}
		
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
