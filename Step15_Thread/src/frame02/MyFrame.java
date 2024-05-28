package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	// String type을 매개변수로 받는 생성자
	public MyFrame(String title) {
		super(title); // 부모 생성자 호출
	// 레이아웃 설정
	setLayout(new FlowLayout(FlowLayout.CENTER));
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
		new WorkThread().start();
	});
	
	
	}
	//MyFram 클래스의 메소드
	public void test() {
		MyFrame a = this;
	}
	
	//스레드 클래스를 내부 클래스로 만들어보기
	public class WorkThread extends Thread{
		@Override
		public void run() {
		WorkThread a = this;
		//내부 클래스에서 바깥에 있는 클래스로 생성된 객체의 참조값이 필요할때가 있다
		MyFrame b = MyFrame.this;
		System.out.println("10초 걸리는 작업을 진행합니다");
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(MyFrame.this, "작업이 종료 되었습니다.");
	}
		
	
	
	
	//run 했을 때 실행의 흐름이 시작되는 ( Main THread 가 시작되는 ) main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자에 전달
		f.setBounds(100,100,300,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	}
}
