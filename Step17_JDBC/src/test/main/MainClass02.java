package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  create table member(num number primary key, name varchar2(16), addr varchar(20));
		 */
		//member 테이블에 추가할 회원의 정보
		int num=3;
		String name="원숭이";
		String addr="동물원";
		
		
		Connection conn=null;
		try {
			//오라클 드라이버 로딩 // ojdbc11.jar 안에서
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비빌번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e){
			e.printStackTrace();	}
		
		PreparedStatement pstmt = null;
		// sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
		try {
			//실행할 미완성의 sql 문
			String sql="insert into member"
					+" (num, name, addr)"
					+" values(?, ?, ?)";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완선인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setInt(1, num); // 1번째 ? 에 숫자 바인딩
			pstmt.setString(2, name); // 2번째  ? 에 문자열 바인딩
			pstmt.setString(3, addr); // 3번째 ? 에 문자열 바인딩
			// sql 문 실행하기
			pstmt.executeUpdate(); // 변경된 row 의 갯수 리턴
			System.out.println("정보를 저장하였습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
