package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		//1. 세명의 회원정보(번호, 이름, 주소) 를 HashMap 객체를 생성하여 담아라
		//HashMap 객체 하나당 한명의 회원정보를 담으니 총 3개의 HashMap 객체가 생성되어야 한다.
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "장");
		map.put("addr", "의왕");
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 2);
		map1.put("name", "김");
		map1.put("addr", "과천");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "박");
		map2.put("addr", "군포");
		//2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해 보세요.
		List<Map<String, Object>> list = new ArrayList<>();
		//3. ArrayList 객체에 HashMap 객체 3개를 담아보세요.
		list.add(map);
		list.add(map1);
		list.add(map2);
		//4. 반복문을 통해 ArrayList 에 담긴 회원정보를 콘솔창에 출력해보세요.
		for(Map<String, Object> tmp:list) {
			String info = String.format("번호:%d , 이름:%s , 주소:%s ",
					(int)tmp.get("num"),
					(String)tmp.get("name"),
					(String)tmp.get("addr"));
			System.out.println(info);
		}
	}
}
