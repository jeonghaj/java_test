package myframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	MyFrame(){
		this.setTitle("테스트용 프레임");
		this.setBounds(500,500,500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton Btn=new JButton("Btn");
		add(Btn);
		Btn.addActionListener((e)->{
			new MyThread2().start();
		});
		
		
		
		this.setVisible(true);
	}
	
	public class MyThread2 extends Thread {
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
	
	public static void main(String[] args) {
		new MyFrame();
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
