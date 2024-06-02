package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// 추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.nextval)
		String name = "주뎅이";
		String addr = "봉천동";

		// sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = new DBConnector().getConn();

		try {

			String sql = "insert into member" + " ( num, name, addr)" + " values( member_seq.nextval, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);

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