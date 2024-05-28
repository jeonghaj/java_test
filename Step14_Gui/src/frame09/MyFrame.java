package frame09;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {

	//생성자
	public MyFrame(String title) {
		//부모생성자 호출
		super(title);
		//프레임의 레이아웃을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴
		JMenu menu=new JMenu("file");
		//메뉴 아이템
		JMenuItem newItem=new JMenuItem("new");
		JMenuItem openItem=new JMenuItem("open");
		JMenuItem saveItem=new JMenuItem("save");
		//메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		//메뉴를 메뉴바에 추가
		mb.add(menu);
		//프레임 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		
		JTextArea ta=new JTextArea();
		//프레임의 가운데에 JTextArea 배치하기
		add(ta, BorderLayout.CENTER);
		ta.setVisible(false);
		//메뉴 아이템에 액션 리스너 등록
		newItem.addActionListener((e)->{
			ta.setVisible(true);
		});
		
		
		JButton btn = new JButton("누르시오");
		add(btn, BorderLayout.SOUTH);
		// 버튼에 리스너 등록하기
		btn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 수행중");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		});
	}

}
