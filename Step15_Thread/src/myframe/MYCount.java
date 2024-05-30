package myframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Frame03.MyFrame;

public class MYCount extends JFrame implements ActionListener {
	// String type을 매개변수로 받는 생성자
	public MYCount(String title) {
		// 모 생성자 호출
		super(title);
	// 레이아웃 설정
	setLayout(new FlowLayout(FlowLayout.CENTER));
	
	var startBtn  = new JButton("카운트다운");
	add(startBtn);
	startBtn.addActionListener(this);
	}
	
	//run 했을 때 실행의 흐름이 시작되는 ( Main THread 가 시작되는 ) main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자에 전달
		f.setBounds(100,100,300,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CountRunnable t = new CountRunnable();
		new Thread(t).start();
		new Thread(new CountRunnable()).start();
		new Thread(new CountRunnable() {
			@Override
			public void run() {
				
			}
		});
	}
}
