package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10Clone {
	public static void main(String[] args) {
		//번호를 입력 받아서
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 번호를 입력하세요:");
		int num=scan.nextInt();
		//번호에 해당하는 회원 한명의 정보를 MemberDao 객체를 이용해서 얻어온 다음
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getData(num);
		//회원 정보를 출력한다 (존재하지 않는 회원 번호이면 정보가 없다고 출력)
		//만일 회원정보가 존재한다면
		if(dto!=null) {
			String info = String.format("번호:%d, 이름:%s, 즈소:%s",
					dto.getNum(), dto.getName(), dto.getAddr());
			System.out.println(info);
			
		}else {
			System.out.println(num+"번 회원은 존재하지 않습니다.");
		}
		
		
	}
}
