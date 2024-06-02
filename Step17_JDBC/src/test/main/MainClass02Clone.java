package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass02Clone {
	public static void main(String[] args) {
		int num = 3;
		String name = "원숭이";
		String addr = "동물원";
		
		Connection conn = new DBConnector().getConn();
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into member"
					+ " (num, name, addr)"
					+ " values(?,?,?)"
					;
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			
			pstmt.executeUpdate();
			System.out.println("정보를 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
