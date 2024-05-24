package test.main;

import test.mypac.Square;

public class MainClass08 {
	public static void main(String[] args) {
		Square set1=new Square();
		Square set2=new Square();
		
		set1.hori=10;
		set1.vert=10;
		
		set2.hori=20;
		set2.vert=20;
		
		set1.showArea();
		set2.showArea();
		
	}
}
