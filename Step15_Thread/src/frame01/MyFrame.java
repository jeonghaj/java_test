package frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// String type을 매개변수로 받는 생성자
	public MyFrame(String title) {
		super(title); // 부모 생성자 호출
	// 레이아웃 설정
	setLayout(new FlowLayout(FlowLayout.CENTER));
	// var
	// type 추론이 가능하다면 지역변수의 type 선언 대신에 var 로 선언할 수 있다.
	// java10 에서 추가된 문법, 아직도 실무에서는 1.8 버전을 쓰는곳이 많기때문에 주의
	// 지역변수에만 사용 가능, 필드는 안됨
	// 인터페이스 type 추론 불가
	// null 로 초기화 불가
	var startBtn  = new JButton("작업시작");
	add(startBtn);
	startBtn.addActionListener((e)->{
		System.out.println("10초 걸리는 작업을 진행합니다");
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료 되었습니다.");
	});
	
	var startBtn2 = new JButton("작업시작2");
	add(startBtn2);
	startBtn2.addActionListener((e)->{
		//스레드 객체를 생성해서
		WorkThread t = new WorkThread();
		//새로운 스레드를 시작 시킨다.
		t.start();
	});
	
	
	}

	
	
	
	//run 했을 때 실행의 흐름이 시작되는 ( Main THread 가 시작되는 ) main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자에 전달
		f.setBounds(100,100,300,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
