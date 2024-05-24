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
		int num2=0;
		int num1=0;
		
		while(true) {

			try {
				Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num1++;	
			System.out.println(num2+"분"+num1+"초");
			if(num1==1&&num2==2) {
				break;
			}
			if(num1==59) {
				num2++;
				num1=-1;
			}
			
			}
				
			
			
			
		}
	}
