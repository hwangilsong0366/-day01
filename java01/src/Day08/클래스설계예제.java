package Day08;

public class 클래스설계예제 {
	//1. 필그
	private String id;
	private String pw;
	private String name;
	private String point;
	//2생성자 
			// 1.*[필드0개] 빈생성자 [메소드 호출용 사용예정]
	public 클래스설계예제() {}
	
	public 클래스설계예제(String id, String pw, String name, String point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}

	// 3.메소드
		//private 필드 사용시 get or set 메소드
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
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	
	
	
	
}
