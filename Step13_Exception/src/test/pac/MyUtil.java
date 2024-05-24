package test.pac;

public class MyUtil {
	//5초가 걸리는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("그림 완성");
	}
	//5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		System.out.println("5초동안 전송을 해요");
		
		Thread.sleep(5000);
	}
}
