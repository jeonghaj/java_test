package frame09;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MyFrameClone extends JFrame{
	JTextArea ta;
	File opendedFile;
	MyFrameClone(String title){
		super(title);
		setLayout(new BorderLayout());
		
	JMenuBar bar = new JMenuBar();
		
	JMenu menu = new JMenu("file");
	
	JMenuItem newItem = new JMenuItem("New");
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem saveItem = new JMenuItem("Save");
	saveItem.setEnabled(false);
	JMenuItem saveAsItem = new JMenuItem("Save As");	
	saveAsItem.setEnabled(false);
	
	menu.add(newItem);
	menu.add(openItem);
	menu.add(saveItem);
	menu.add(saveAsItem);
	
	bar.add(menu);
	
	setJMenuBar(bar);
	
	ta=new JTextArea();
	this.add(ta);
	ta.setVisible(false);
	
	newItem.addActionListener((e)->{
		ta.setVisible(true);
		this.setTitle("Non Title");
		saveItem.setEnabled(true);
		saveAsItem.setEnabled(true);
	});	
	
	saveAsItem.addActionListener((e)->{
		var fc = new JFileChooser("C:/Users/JANG/eclipse-workspace/myFolder");
		int result = fc.showOpenDialog(this);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			opendedFile = fc.getSelectedFile();
			
			setTitle(opendedFile.getName());
			
			try {
				opendedFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			FileWriter fw = null;
			try {
				String content = ta.getText();
				fw=new FileWriter(opendedFile);
				fw.write(content);
				fw.flush();
				JOptionPane.showMessageDialog(this, "저장했습니다");
							
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}
		
	});
	
	openItem.addActionListener((e)->{
		FileReader fr = null;
		BufferedReader br = null;

		var fc = new JFileChooser("C:\\Users\\JANG\\eclipse-workspace\\myFolder");
		int result = fc.showOpenDialog(this);
			
		if(result==JFileChooser.APPROVE_OPTION) {
			opendedFile=fc.getSelectedFile();
			setTitle(opendedFile.getName());
			ta.setVisible(true);
		}
		
		try {
			fr= new FileReader(opendedFile);
			br= new BufferedReader(fr);
			ta.setText(br.readLine());
			
		} catch (IOException e1) {
			e1.printStackTrace();
			
		}
		
	});
	
	
	} // 생성자
	
	
	
	
	public static void main(String[] args) {
		MyFrameClone f = new MyFrameClone("기본 프레임");
		f.setBounds(200,200,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
