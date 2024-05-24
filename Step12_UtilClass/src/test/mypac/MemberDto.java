package test.mypac;
/*
 * Dto => Data Transfer object 의 약자
 * 
 * [작성 규칙]
 * 
 * 1.디폴트 생성자가 반드시 있어야 한다.
 * 2. 필드는 접근지정자가 private 로 되어 있어야 한다.
 * 3. 필드의 접근 메소드 setter, getter 메소드가 있어야 한다.
 */
public class MemberDto {
	//필드의 접근 지정자를 private
	private int num;
	private String name;
	private String addr;
	//디폴트 생성자
	public MemberDto () {}
	//우클릭  + source + generate Constructor using fields
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
//		private 접근지정자는 선언이나 호출로 접근 x
//		>> setter / getter
//		우클릭  + source + generate Getter Setter
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
