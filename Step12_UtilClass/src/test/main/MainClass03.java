package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		//인삿말을 담을 ArrayList 객체를 생성해서 참조값을 List 인터페이스 greets 지역변수에 대입하기
		List<String> greets = new ArrayList<>();
		//greets 에 들어 있는 참조값을 이용해서 인사말 3개를 임의로 담아보세요
		greets.add("hello");
		greets.add("good morning");
		greets.add("what is up?");
		
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		greets.forEach(con);
		
		System.out.println("-----------------------");
		
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("-----------------------");
		
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
