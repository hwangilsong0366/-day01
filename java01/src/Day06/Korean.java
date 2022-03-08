package Day06;

public class Korean {
	
	
	//1. 필드
	String nation = "대한민국";
	String name;
	// 이름 변수에는 초기화 x[NULL]
	String  ssn;
	
	//
	
	//2.생성자
	 //조건1 : 생성자이름 == 클래스이름 동일
	// 조건2 : 외부로부터 들어오는 매개값[인수] 선언
	// 조건3 : 동일한 생성자 이를 가질수 없다.
		// 오버로딩 : 동일한 이름일 경우 코드를 재정의
	//3.메소드
	
	Korean(){ // 1. 빈생성자
		//내용물 x
		
		
	}
	
		Korean(String n){
		
		name = n;
		
	}
	

	
	
	
	
	
	Korean(String n, String s){
		
		name = n;
		ssn =s ;
	}
	
	
	// 3. 필드 3개를 갖는 생성자
	Korean(String nation, String name, String ssn){
		
		
		nation = nation;
		name = name;
		ssn= ssn;
			// 내부변수 (현재클래스 변수)
			// 매개변수 (외부로부터 들어온 변수)
		
		
	}


}

