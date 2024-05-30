package myframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener{
	MyFrame2(){
		this.setTitle("테스트용 프레임");
		this.setBounds(500,500,500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton Btn = new JButton("button 1");
		add(Btn);
		Btn.addActionListener((e)->{
			new MyThread().start();
		});
		JButton Btn2=new JButton("button 2");
		add(Btn2);
		Btn2.addActionListener((e)->{
			System.out.println("1초 걸리는 작업을 시작합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료됩니다.");
		
		});
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
		for(int i=0; i<10; i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
