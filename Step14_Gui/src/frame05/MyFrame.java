package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다
public class MyFrame extends JFrame implements ActionListener{
	//필드
	JButton saveBtn, updateBtn, deleteBtn;

	//생성자
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBound(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//레이아웃 매니저 객체 생성 / LayoutManager 인터페이스를 구현
		// LEFT . RIGHT . CENTER
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	
		//프레임의 레이아웃 매니저 설정 / LayoutManager type 받음
		setLayout(layout);
		
		//JButton 객체 생성
		this.saveBtn=new JButton("저장");
		this.updateBtn=new JButton("수정");
		this.deleteBtn=new JButton("삭제");
		
		add(saveBtn);
		add(updateBtn);
		add(deleteBtn);
		
		//액션 리스너 등록
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		//화면상에 실제 보이도록 한다.
		this.setVisible(true);
	}
	
	//main 메소드
	public static void main(String[] args) {
		new MyFrame();
	}
	//implements ActionListener 했기 떄문에 강제로 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번 버튼을 누르셨습니다.");
		//눌러진 버튼의 참조값 얻어내기
		Object which = e.getSource();
		
		if (which == this.saveBtn) {
			System.out.println("추가합니다");
		}else if(which == updateBtn) {
			System.out.println("수정합니다");
		}else if(which == deleteBtn) {
			System.out.println("삭제합니다");
		}
	}

}
