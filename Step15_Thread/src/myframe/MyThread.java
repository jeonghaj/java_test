package myframe;

public class MyThread extends Thread {
	@Override	
	public void run() {
		System.out.println("5초 걸리는 작업을 진행합니다");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("작업을 마쳤습니다.");
	}
}
