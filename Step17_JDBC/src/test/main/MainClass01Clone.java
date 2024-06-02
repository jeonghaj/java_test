package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass01Clone {
	public static void main(String[] args) {
		Connection conn = new DBConnector().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select empno, ename, sal"
					+ " from emp"
					+ " order by sal desc";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("empno")+"|"+rs.getString("ename")+"|"+rs.getInt("sal"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
