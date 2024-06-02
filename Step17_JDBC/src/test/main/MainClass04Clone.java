package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass04Clone {
	public static void main(String[] args) {
		Connection conn = new DBConnector().getConn();
		PreparedStatement pstmt = null;
		
		int num  = 3;
		
		try {
			String sql = " delete from member"
					+ " where num = ?"
			;
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("삭제를 완료했습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
