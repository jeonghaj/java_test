package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain {
	public static void main(String[] args) {
	//1. 정수를 담을 수 있는 ArrayList 객체를 생성해서 nums 라는 지역 변수에 담아라
	ArrayList<Integer> nums = new ArrayList<Integer>();
	//2. 반복문 10번을 통해서 1~100 사이의 랜덤한 정수를 10개 얻어내서
	//위에서 생성한 nums 객체에 순서대로 담으시오
	Random ran=new Random();
	
	for(int i=0; i<10; i++) {
		int numb=ran.nextInt(0, 100);
		nums.add(numb);
	}

		
	//3. nums 에 저장된 숫자에서 중복된 숫자가 제거된 새로운 ArrayList 객체를 얻어내 보시오
	Set<Integer>set=new HashSet<>(nums);
	List<Integer>result=new ArrayList<>(set);
	//4.새로운 배열에 숫자를 오름 차순으로 정렬해 보세요
	Collections.sort(result);
	//5. 새로운 배열에 저장된 숫자를 순서대로 콘솔창에 출력해 보세요.
	for(Integer tmp:result) {
		System.out.println(tmp);
	}

	}
}
