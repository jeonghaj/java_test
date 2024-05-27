package frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBound(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//레이아웃 매니저 객체 생성 / LayoutManager 인터페이스를 구현
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		//프레임의 레이아웃 매니저 설정 / LayoutManager type 받음
		setLayout(layout);
		
		JTextField inputMsg = new JTextField(10);
		add(inputMsg);
		//버튼에 액션 리스너 등록하기
		JButton sendBtn=new JButton("전송");
		add(sendBtn);
		
		sendBtn.addActionListener((e)->{
			//입력한 문자열을 읽어와서 콘솔창에 출력하기
			String msg = inputMsg.getText();
			System.out.println(msg);
		});


		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
