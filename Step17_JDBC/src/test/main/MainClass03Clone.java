package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass03Clone {
	public static void main(String[] args) {
		
		Connection conn = new DBConnector().getConn();
		PreparedStatement pstmt = null;
		
		int num = 1;
		String name = "에이콘";
		String addr = "강남";
		
		try {
			String sql = " update member"
					+ " set name = ?, addr = ?"
					+ " where num = ?"
					;
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			
			pstmt.executeUpdate();
			
			System.out.println("수정을 완료했습니다");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
