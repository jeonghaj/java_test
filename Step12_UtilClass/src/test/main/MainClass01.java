package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {
	public static void main(String[] args) {
		//java 에서 배열은 용도가 한정되어 있다.
		// item 을 담을 수 있는 공간을 늘리거나 줄일수 없다.
		
		//문자열(String) type 을 담을 수 있는 방 5개짜리 배열 객체 생성
		String[] names = new String[5];
		names[0]="a";
		names[1]="b";
		names[2]="c";
		names[3]="d";
		names[4]="e";
		//String type 을 순서대로 저장할 수 있는 ArrayList 객체 생성하고 참조값을 friends 에 담기
		ArrayList<String> friends = new ArrayList<String>();
		List<String> friend = new ArrayList<String>();
		friends.add("A");
		friends.add("B");
		friends.add("C");
		friends.add("D");
		friends.add("E");
		//0 번방이 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item = friends.get(0);
		//1 번방을 삭제
		friends.remove(1);
		//0 번방에 "에이콘"을 넣기(끼워넣기)
		friends.add(0, "Acorn");
		//저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담기
		int size = friends.size();
		System.out.println(size);
		//저장된 모든 아이템 삭제
		friends.clear();
		
	}
}
