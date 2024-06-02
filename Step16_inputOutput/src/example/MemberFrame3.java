package example;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;
//1. 입력된 데이터를 추가 버튼을 누르면 읽어서 배열에 저장하기 (내부로 읽기)
	//2. 읽어들인 배열 데이터를 외부 파일에 저장하기 (외부로 쓰기)
	//3. 외부 파일에 저장된 배열 데이터를 불러오기(외부에서 읽기)
	//4. 배열데이터에 저장된 데이터를 테이블에 저장하기 (내부로 쓰기
public class MemberFrame3 extends JFrame {
	//필요한 필드 정의
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	List<MemberDto> list = new ArrayList<>();
	
	//생성자
	public MemberFrame3(String title) {
		super(title);
		//JLabel 3개
		JLabel label1 = new JLabel("번호");
		JLabel label2 = new JLabel("이름");
		JLabel label3 = new JLabel("주소");
		
		//JTextField 3개
		inputNum = new JTextField(10);
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		//JButton
		JButton addBtn = new JButton("추가");
		JButton deleteBtn = new JButton("삭제");
		//패널에 UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		this.add(panel, BorderLayout.NORTH);
		//테이블 생성
		table = new JTable();
		String[] column = {"번호","이름","주소"	};
		model = new DefaultTableModel(column, 0);
		table.setModel(model);
		JScrollPane scroll = new JScrollPane(table);
		this.add(scroll,BorderLayout.CENTER);
		
		//추가 버튼 리스너
		addBtn.addActionListener((e)->{
			//1. 추가 버튼을 누르면 내부 데이터를 배열객체에 저장
			int num = Integer.parseInt(inputNum.getText());
			String name = inputName.getText();
			String addr = inputAddr.getText();
			
			MemberDto member = new MemberDto(num, name, addr);
			list.add(member);
			
			setTable(); // 배열객체에 저장한내용을 현재 테이블에 띄움
			saveToFile(); // 배열객체에 저장한내용을 외부파일에 저장
			
		});
		
		//삭제 버튼 리스너
		deleteBtn.addActionListener((e)->{
			
	
		int selectedRow = table.getSelectedRow();
		if(selectedRow == -1) {
			JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하세요");
		}

		list.remove(selectedRow);
		setTable(); // 배열객체에 저장한내용을 현재 테이블에 띄움
		saveToFile(); // 배열객체에 저장한내용을 외부파일에 저장
			});
		
		loadFromFile(); // run 할때 외부파일에 저장된 배열데이터를 불러와 배열객체에 저장
		setTable(); // 배열객체에 저장한 내용을 테이블에 띄움
		
			
	}//생성자
	
	//4. 배열데이터에 저장된 데이터를 테이블에 저장하기 (내부로 쓰기
	public void setTable() {
		model.setRowCount(0); // 저장하기전에 테이블 정리하기
		for(MemberDto tmp:list) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
	
	//3. 외부 파일에 저장된 배열 데이터를 불러오기(외부에서 읽기)
	public void loadFromFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			File f = new File("C:/Users/JANG/eclipse-workspace/myFolder/member.data");
			if(!f.exists()) {
				f.createNewFile();
			}
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			List<MemberDto> list = (List<MemberDto>)ois.readObject();
			this.list = list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//2. 저장한 데이터를 외부 파일에 저장 // okay
	public void saveToFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos =new FileOutputStream("C:/Users/JANG/eclipse-workspace/myFolder/member.data");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			
		} catch (IOException e1) {

			e1.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(oos!=null)oos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		MemberFrame3 f = new MemberFrame3("테이블 프레임");
		f.setBounds(100,100,800,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
