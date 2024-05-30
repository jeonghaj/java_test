package myframe;

public class CountRunnable implements Runnable {

	@Override
	public void run() {
			// 카운트 값을 저장할 지역변수 만들고 초기 값 대입
			int count=10;
			// 반복문
			while(true) {
				System.out.println("현재 count:"+count);
				if(count == 0) {
					break;	}
				//1초 마다
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 카운트를 1씩 감소
				count--;	}		

	}
	
}
