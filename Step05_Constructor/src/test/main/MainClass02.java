package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {

		Member m1 = new Member(1,"김구라","노량진");
		
		Member m2 = new Member();
		m2.num = 2;
		m2.name = "해골";
		m2.addr = "행신동";
	}
}
