package Day06;

public class Day06_5 {
	
	public static void main(String[] args) {
		
		
		//1. 빈 생성자로 객체 생성
		Korean k1 = new Korean();
		
	k1.	name = "유재석";
	k1.	ssn = "123123-123123";
	System.out.println("k1 국적:"+k1);
		
	//////////////////////////////////////////////////
	 // 1.빈 생성자 객체
	
	Korean 한국인1 = new Korean();
	// 한국인1 국적이 대한민국이고 이름, 주민등록번호 없음
	
	Korean 한국인2 = new Korean("유재석");
	
	Korean 한국인3 = new Korean("강호동", "123455-123456");
	// 2. 필드 1개 생성자 객체생성
	// 3. 필드 2개 생성자 객체 생성
		
	}

}
