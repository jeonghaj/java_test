package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*
 * 1.PostDto 클래스를 만들어 보세요
 *   PostDto 에는 글번호, 작성자, 제목을 담을 수 있어야 한다.
 *   즉 3개의 필드를 만드시오
 *   필드명은 마음대로, 필드의 date type 은 잘 생각해서 결정
 *   dto 작성 규약에 맞게 만들어주세요 (eclipse generate 기능 활용)
 *   test.mypac 패기지에 만들기
 *   
 *   
 *   2.PostDto 객체에 임의의 글 3개의 정보를 담아 보세요.
 *     총 3개의 PostDto 객체가 생성이 되어야한다.
 *   
 *   3.PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 위에서 생성한 PostDto 객체를
 *     ArrayList 에 담아보세요.
 *     
 *   4.반복문을 이용하여 ArrayList 에 담긴 글 목록을 콘솔창에 출력해 보세요.
 */
public class QuizMain3 {
	public static void main(String[] args) {
		PostDto q1 = new PostDto();
		q1.setPostnum(1);
		q1.setPostauthor("김");
		q1.setPosttitle("라임오렌지나무");
		
		PostDto q2 = new PostDto();
		q2.setPostnum(2);
		q2.setPostauthor("이");
		q2.setPosttitle("라임사과나무");
		
		PostDto q3 = new PostDto();
		q3.setPostnum(3);
		q3.setPostauthor("박");
		q3.setPosttitle("라임귤나무");
		
		List<PostDto> Q = new ArrayList<>();
		Q.add(q1);
		Q.add(q2);
		Q.add(q3);
		
		for(PostDto tmp:Q) {
			String sys=String.format("글번호:%d , 작성자:%s , 제목:%s ", tmp.getPostnum(), tmp.getPostauthor(),tmp.getPosttitle());
			System.out.println(sys);
		}
		
	}
	
}
