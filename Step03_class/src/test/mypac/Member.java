package test.mypac;

public class Member {
	//Member 객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Member 클래스를 설계하려고 한다.
	//필드
	public int num;
	public String name;
	public String addr;
	//메소드
	public void showinfo() {
	    String info = "번호는 " + this.num + " 이고 이름은 " + this.name + " 이고 주소는 " + this.addr + " 입니다.";
	    System.out.println(info);
	}
	
}
