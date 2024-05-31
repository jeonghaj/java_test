package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc11.jar 파일을
 *  사용할수 있도록 설정해야 한다.
 *  
 *  프로젝트에 마우스 우클릭 => Build Path => Configure Build Path => Libraries 텝 선택
 *  => classpath 선택 => 우측 Add External jar 버튼을 누른후 => ojdbc6.jar 파일을 찾은다음 => Apply 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결객체를 담을 지역 변수 만들기
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
			e.printStackTrace();
		}
		
		//SELECT 작업을 하기위해서 필요한 객체의 찹조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//실행할 sql 문을 미리 준비
			String sql="SELECT empno, ename, job, sal"
					+ " FROM emp" // FROM 절 앞에 띄어쓰기 
					+ " ORDER BY empno ASC"; // ORDER BY 절 앞에 띄어쓰기
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//SELECT 문 실행하고 결과값을 ResultSet 으로 얻어내기
			rs=pstmt.executeQuery();
			//반복문 돌면서
			while(rs.next()) { // cursor 를 한칸씩 내리면서 // 내릴곳이 없으면 false 리턴
				// 현재 cursor 가 위치한 곳의 숫자나 문자를 추출한다.
				// .getInt .getString .getDoulbe  +(칼럼명);
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				System.out.println(empno+"|"+ename+"|"+job+"|"+sal);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
