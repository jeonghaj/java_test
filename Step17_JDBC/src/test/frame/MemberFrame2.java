package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame2 extends JFrame implements ActionListener{
	//필요한 필드 정의하기
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	List<MemberDto> list=new ArrayList<>();
	JTable table;
	
	//생성자 
	public MemberFrame2(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton addBtn=new JButton("추가");
		//버튼에 ActionCommand 설정을 할수가 있다. 
		addBtn.setActionCommand("add");
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//테이블
		table=new JTable();
		//테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames= {"번호", "이름", "주소"};
		//테이블에 연결할 모델
		model=new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결
		table.setModel(model);
		//스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
	    JScrollPane scroll=new JScrollPane(table);
	    //JScrollPane  을 프레임의 가운데에 배치하기 
	    add(scroll, BorderLayout.CENTER);
	    
	    //버튼에 액션 리스너 등록
	    addBtn.addActionListener(this);
	    deleteBtn.addActionListener(this);
	    
	    refreshTable();
	}
	
	//필드에 있는 List<MemberDto> 를 이용해서 JTable 에 목록을 출력하는 메소드
	public void refreshTable() {
		list = new MemberDao().getList();
		//기존에 출력된 내용은 한번 지워준다.
		model.setRowCount(0);
		//반복문 돌면서 
		for(MemberDto tmp:list) {
			//MemberDto 객체를 순서대로 참조하면서 Object[] 객체를 만들어 준다. 
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//만든 Object[] 객체를 DefaultTableModel 객체에 추가하면 테이블 row 가 출력된다. 
			model.addRow(row);
		}
	}

	public static void main(String[] args) {
		MemberFrame2 f=new MemberFrame2("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생한 UI 에 설정된 ActionCommand 문자열 읽어오기
		String command = e.getActionCommand();
		/*
		 *  - 중요!!
		 *  java 에서 문자열은 내용이 같아도 참조값이 다른 경우가 있다.
		 *  따라서 문자열의 내용이 같은지 비교 할때는 동등 비교 연산자 == 를 사용하면 안된다.
		 *  문자열의 내용을 비교할때는 .equals() 메소드를 활용해야 한다.
		 */
		if(command.equals("add")) {
			//이름
			String name = inputName.getText();
			//주소
			String addr = inputAddr.getText();
			// list 회원 한명의 정보를 담기
			MemberDto dto=new MemberDto(0, name, addr);
			
			new MemberDao().insert(dto);
			
		}else if(command.equals("delete")) {
			//선택된 JTable Row 가 있다면 몇번째 row 가 선택되었는지를 읽어와서
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하세요");
				return; //메소드를 여기서 리턴시켜라(끝내라) 
			}
			int num = (int)model.getValueAt(selectedRow, 0);
			int num2 = list.get(selectedRow).getNum();
			new MemberDao().delete(num2);
		}
		
		//새로고침
		refreshTable();
		//파일에 저장하기
	}
	
}

