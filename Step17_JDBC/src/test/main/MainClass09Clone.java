package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09Clone {
	public static void main(String[] args) {
		//전체회원목록 읽어오기
		MemberDao dao = new MemberDao();
		List<MemberDto> list = new ArrayList<>();
		list = dao.getList();
		//출력하기
		for(MemberDto tmp:list) {
			String info = String.format("번호:%d, 이름:%s, 주소:%s",
					tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
	}
}
