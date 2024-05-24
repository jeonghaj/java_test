package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		//1. 로또번호를 담을 HashSet 객체를 생성해서 set1 이라는 지역변수에 담으시오
		Set<Integer> set1=new HashSet<>();
		//2. while 문을 이용해서 랜덤한 로또 번로를 set1에 반복적으로 담으시오
		// while 문 탈출 조건은 set1.size() 가 6이 되면 탈출
		while(true) {
			Random ran = new Random();
			set1.add(ran.nextInt(0,46));
			if(set1.size() == 6) {
				break;
			}
		}
		//3. set1 에 담긴 번호를 오름차순 정렬해서 콘솔창에 출력
		List<Integer> list=new ArrayList<>(set1);
		Collections.sort(list);
		for(int tmp:list) {
			System.out.println(tmp);	
		}
		
	}
}
