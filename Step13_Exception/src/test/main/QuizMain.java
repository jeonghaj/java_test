package test.main;
/*
 * run 했을때 콘솔창에 경과 시간이 출력되는 프로그래밍을 해 보세요.
 * 
 * 0 분 1초
 * 0 분 2초
 * 0 분 3초
 * 
 * 
 * 
 * 0 분 59초
 * 1 분 0초
 * 1 분 1초
 * .
 * .
 * 2분 0초
 * 2분 1초
 */
public class QuizMain {
	public static void main(String[] args) {
		int min=0;
		int sec=0;
		
		while(true) {

			try {
				Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sec++;
			if(sec==60) {
				min++;
				sec=0;
				}	
			System.out.println(min+"분"+sec+"초");
			}		
	}
}
