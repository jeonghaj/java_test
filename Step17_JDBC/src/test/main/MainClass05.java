package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass05 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.nextval)
		String name="김";
		String addr="의왕";
		
		//DB 연결객체를 담을 지역 변수 만들기
//				Connection conn=null;
//				try {
//					//오라클 드라이버 로딩 // ojdbc11.jar 안에서
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					//접속할 DB 의 정보 @아이피주소:port번호:db이름
//					String url = "jdbc:oracle:thin:@localhost:1521:xe";
//					//계정 비빌번호를 이용해서 Connection 객체의 참조값 얻어오기
//					conn=DriverManager.getConnection(url, "scott", "tiger");
//					//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다
//					System.out.println("Oracle DB 접속 성공");
//				}catch(Exception e){
//					e.printStackTrace();	}
		Connection conn=new DBConnector().getConn();
				
		PreparedStatement pstmt = null;
		
		try {	
		String sql = "insert into member"
				+ " ( num, name, addr)"
				+ " values( member_seq.nextval, ?, ?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, addr);
		
		pstmt.executeUpdate();
		System.out.println("회원 정보를 수정했습니다.");
		
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
