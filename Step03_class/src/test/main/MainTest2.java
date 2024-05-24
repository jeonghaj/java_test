package test.main;

import test.mypac.Square;

public class MainTest2 {
	public static void main(String[] args) {
		
		Square set1 = new Square();
		
		set1.hori = 8;
		set1.vert = 6;
		
		set1.showArea();
		
		new Square().showArea();
	}
}
