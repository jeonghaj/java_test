package frame09;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		MyFrame f=new MyFrame("타이틀");
//		f.setTitle("나의 프레임");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
