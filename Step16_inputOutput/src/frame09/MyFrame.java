package frame09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	
	//필요한 필드 선언
	File openedFile; // 현재 열린 파일의 참조값을 저장할 필드
	JTextArea ta;
	
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
		saveItem.setEnabled(false);
		JMenuItem saveAsItem=new JMenuItem("save as");
		saveAsItem.setEnabled(false);
		//메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		//메뉴를 메뉴바에 추가
		mb.add(menu);
		//프레임 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		//JTextArea 객체의 참조값을 필드에 저장
		ta=new JTextArea();
		//JTextArea 를 Scroll 패널 안에 위치 시키기
		JScrollPane scp=new JScrollPane(ta);
		
		//프레임의 가운데에 JScrollPane 을 배치하기
		add(scp, BorderLayout.CENTER);
		ta.setVisible(false);
		//JTextArea의 글자크기 조절하기
		Font font=new Font("Serif", Font.PLAIN,20);
		ta.setFont(font);
		
		//new 를 눌렀을때 실행할 리스너 등록
		newItem.addActionListener((e)->{
			ta.setVisible(true);
		this.setTitle("제목없음");
		saveAsItem.setEnabled(true);
		saveItem.setEnabled(true);
		});
		
		//save as 를 눌렀을때 실행할 리스너 등록
		saveAsItem.addActionListener((e)->{
			//파일 선택을 도와주는 객체 생성
			var fc=new JFileChooser("C:/Users/user/playground/myFolder");
			int result = fc.showSaveDialog(this);
			
			//만일 제대로 파일을 만들 준비를 했다면
			if(result == JFileChooser.APPROVE_OPTION) {
				//선택된 file 객체의 참조값을 필드에 저장
				openedFile=fc.getSelectedFile();
				setTitle(openedFile.getName());
				
				//새로운 파일 실제로 만들기
				try {
					openedFile.createNewFile();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				this.saveToFile();
			}
		});
		
		openItem.addActionListener((e)->{
			JFileChooser fc=new JFileChooser("C:/Users/user/playground/myFolder");
			int result = fc.showOpenDialog(this);
			
			if (result == JFileChooser.APPROVE_OPTION) {
				//선택한 파일을 제어할 수 있는 File 객체의 참조값 얻어내서 필드에 저장하기
				openedFile=fc.getSelectedFile();
				//선택한 파일의 이름을 title 에 출력하기
				String fileName=openedFile.getName();
				//프레임의 setTitle() 메소드를 이용해서 제목 수정하기
				setTitle(fileName);
				ta.setVisible(true);
				//문자열 로딩
				loadFromFile();
				//saveItme, saveAsItem을 활성화한다
				saveAsItem.setEnabled(true);
				saveItem.setEnabled(true);
				
			}
		});
		
		saveItem.addActionListener((e)->{
			
			saveToFile();
		});

	}//생성자
	
	
	// 선택된 파일로 부터 문자열을 읽어와서 JTextArea 에 출력하는 메소드
	public void loadFromFile() {
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			//필드에 저장되어 있는 File 객체를 이용해서 FileReader 객체를 생성한다.
			fr=new FileReader(openedFile);
			// 좀 더 편하게 문자열을 읽어들이기 위해 FileReader 객체에 BufferedReader 로 포장한다.
			br=new BufferedReader(fr);
			while(true) {
			String result = br.readLine();
			if(result==null) break;
			//JTextArae 에 1줄씩 추가
			ta.append(result+"\n\r"); // 개행기호 추가
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//현재까지 JTextArea 에 입력된 문자열을 읽어와서 File 에 저장하는 메소드
	public void saveToFile() {
				String content=ta.getText();
				FileWriter fw = null;
				try {
					//선택한 File 객체의 참조값을 생성자에게 넘겨주면서 FileWriter 객체 생성하기
					fw = new FileWriter(openedFile);
					fw.write(content);
					fw.flush();
					JOptionPane.showMessageDialog(this, "저장했습니다");
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	}
	
	public static void main(String[] args) {
		MyFrame f=new MyFrame("타이틀");
//		f.setTitle("나의 프레임");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
