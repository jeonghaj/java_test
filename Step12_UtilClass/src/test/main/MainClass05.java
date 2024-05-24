package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아라
		ArrayList<Member>members=new ArrayList<Member>();
		//2. 3명의 회원정보를 Member 객체에 각각 담아라 ( 객체 3개 )
		Member a = new Member();
		a.num = 1;
		a.name = "김";
		a.addr = "안양";
		Member b = new Member(2,"이","의왕");
		Member c = new Member(3,"박","군포");
		
		//3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두 담아라
		members.add(a);
		members.add(b);
		members.add(c);
		members.add(new Member(4,"장","과천"));
		//4. member List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문 돌리며 출력
		// 번호: 1, 이름: 김구라, 주소: 노량진
		// 번호: 2, 이름: 해골, 주소: 행신동
		
		for(int i=0; i<members.size(); i++) {
			Member mem=members.get(i);
			String name1=mem.name;
			String addr1=mem.addr;
			int num1=mem.num;
			
			System.out.println("번호: "+num1+", 이름: "+name1+", 주소: "+addr1);
		}
		//확장 for 문 사용
		for(Member mem:members) {
			String name2=mem.name;
			String addr2=mem.addr;
			int num2=mem.num;
			System.out.println("번호: "+num2+", 이름: "+name2+", 주소: "+addr2);
		}
		//forEach
		members.forEach(mem -> {
		    System.out.println("번호: " + mem.num + ", 이름: " + mem.name + ", 주소: " + mem.addr);
		});

	}
}