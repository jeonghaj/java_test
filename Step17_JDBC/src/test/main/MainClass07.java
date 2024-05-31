package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.nextval)
		String name="덩어리";
		String addr="상도동";
		//추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//insert() 메소드를 호출하면서 MemberDto 객체의 참조값을 전달한다.
		MainClass07.insert(dto);
		
	}
	
	//회원정보를 DB에 저장해주는 static 메소드
	public static void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		//dto 에 추가할 회워원이 이름과 주소가 들어 있다는 가정하에서 메소드를 완성해 보세요.
		try {
			conn = new DBConnector().getConn();
			
				String sql = "insert into member" 
							+ " ( num, name, addr)" 
							+ " values( member_seq.nextval, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());

			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	
}
