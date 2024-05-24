package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫는다");
			}
		});
		
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫는다");
		});
		
	} // 동작(메소드) 하나를 매개변수로 전달하는 느낌
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	  // 동작을 2번 호출
	}
}
