package frame09;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame {
	
	//필요한 필드 선언
	File openedFile; // 현재 열린 파일의 참조값을 저장할 필드
	JTextArea ta;
	
	//생성자
	public MyFrame2(String title) {
		//부모생성자 호출
		super(title);
		//프레임의 레이아웃을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴
		JMenu menu=new JMenu("file");
		JMenu menu2=new JMenu("folder");
		//메뉴 아이템
		JMenuItem newItem=new JMenuItem("new");
		JMenuItem openItem=new JMenuItem("open");
		JMenuItem saveItem=new JMenuItem("save");
		JMenuItem saveAsItem=new JMenuItem("save as");
		//메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		//메뉴를 메뉴바에 추가
		mb.add(menu);
		mb.add(menu2);
		//프레임 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		//JTextArea 객체의 참조값을 필드에 저장
		ta=new JTextArea();
		//프레임의 가운데에 JTextArea 배치하기
		add(ta, BorderLayout.CENTER);
		ta.setVisible(false);
		//메뉴 아이템에 액션 리스너 등록
		newItem.addActionListener((e)->{
			ta.setVisible(true);
		this.setTitle("제목없음");
		});
		
		saveAsItem.addActionListener((e)->{
			var fc=new JFileChooser("C:\\Users\\user\\playground\\myFolder");
			int result = fc.showSaveDialog(this);
			
			if(result == JFileChooser.APPROVE_OPTION) {
				openedFile = fc.getSelectedFile();
				this.setTitle(openedFile.getName());
			}
			
		});
	}//생성자
	
	
	public static void main(String[] args) {
		MyFrame2 f=new MyFrame2("타이틀");
//		f.setTitle("나의 프레임");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
