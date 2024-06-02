package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08Clone {
	public static void main(String[] args) {
		//회원삭제
		MemberDao dao = new MemberDao();
		dao.delete(2);
		// 정보 추가
		MemberDto dto = new MemberDto();
		dto.setName("주뎅이");
		dto.setAddr("행신동");
		dao.insert(dto);
		//1번 회원의 이름 수정
		MemberDto dto2 = new MemberDto();
		dto2.setNum(1);
		dto2.setName("김영신");
		dto2.setAddr("의왕시");
		dao.update(dto2);
		
	}
}
