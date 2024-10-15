package aaa;

public class Member {
	private int num;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String regDate;
	private String id;
	private String pw;
	private String name;
	
	public Member(int num, String regDate, String id, String pw, String name) {
		this.num =num;
		this.regDate = regDate;
		this.pw =pw;
		this.id =id;
		this.name = name;
	}
	
}

