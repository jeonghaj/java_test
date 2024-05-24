package ace.main;

import ace.pac.Package01;
import ace.pac.SubPackage01;

public class Main02 {
	public static void main(String[] args) {
		test03();
		test04("suit up");
		test05(new SubPackage01());
	}
	
	public static void test03() {
		System.out.println("test 03 running");
	}
	public static void test04(String str) {
		System.out.println("message send :"+str);
	}
	public static void test05(Package01 p1) {
		p1.test01();
		p1.test02();
	}
}
