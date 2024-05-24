package test.main;
/*
 *  run 했을때 콘솔창에 
 *  1초
 *  2초
 *  .
 *  .
 *  경과 시간이 출력되다가
 *  .
 *  .
 *  10초 // 까지만 출력하고 종료되는 프로그래밍을 해 보세요.
 */
public class MainClass09 {
	public static void main(String[] args) {
		int num=0;
		while(true)	{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//num 값을 1 증가
			num++;
			System.out.println(num+"초");
			if(num==10) {
				break;
				}
		}
		
	}
}
