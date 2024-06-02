package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//만일 4번 회원을 삭제 하려면?
		int num = 4;
		
		MemberDao dao = new MemberDao();
		dao.delete(num);
		
		//이름 : batman, 주소 : hollywood 회원 정보를 DB 에 저장해보세요.
		MemberDto dto1 = new MemberDto();
		dto1.setName("batman");
		dto1.setAddr("hollywood");
		dao.insert(dto1);

		// 1번 회원의 이름을 acorn 주소를  강남으로 수정해보세요
		MemberDto dto2 = new MemberDto(1,"acorn","강남");
		dao.update(dto2);
	}
}
