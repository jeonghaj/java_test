package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1.MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아라
		List<MemberDto> members = new ArrayList<MemberDto>();
		//2.3명의 회원정보를 MemberDto 객체에 각각 담아보시오
		MemberDto dto=new MemberDto(); // (디폴트 생성자 이용)
		dto.setNum(1);
		dto.setName("김");
		dto.setAddr("안양");
		MemberDto dto2=new MemberDto(2,"박","의왕");//(매개변수를 가진 생성자 이용)
		//3. 위에서 생선된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(dto);
		members.add(dto2);
		members.add(new MemberDto(3,"이","과천"));//(ArrayList 객체에 MemberDto 객체를 담으며 매개변수를 가진 생성자 이용
		//4. 반복문을 이용해서 members 에 들어있는 회원정보를 출력해보세요.
		for(MemberDto mem:members) {
		System.out.println("번호:"+mem.getNum()+", 이름:"+mem.getName()+", 주소:"+mem.getAddr());
		}
		//4. String 클래스의 format() 이란ㄴ static 메소드를 이용하면
		//원하는 문자열 형식을 좀 더 간편하게 얻어낼 수 있다.
		for(MemberDto tmp:members) {
			String info=String.format("번호:%d 이름:%s 주소:%s",
					tmp.getNum(),tmp.getName(),tmp.getAddr());
			System.out.println(info);
		}
		


	}
}
