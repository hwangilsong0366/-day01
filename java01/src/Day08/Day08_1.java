package Day08;

public class Day08_1 {
	public static void main(String[] args) {
	//static 
		//정적변수
		//공용적인 데이터
		
		//*클래스내 필드, 메소드 접근방법
			//1. 객체 생성 >> 객체.멤버
	Calculator calculator =new Calculator() ;
	System.out.println("객체를 이용한 멤버접근 :"+calculator);
	
	System.out.println("객체없이 맴버접근:"+calculator);
	// (static 멤버 일때) 1. 클래스명.멤버
		//클래스 코딩 되고 메소드영역에 static 변수에 메모리 할당
	double result =10*10*Calculator.pi;
	
	}
}

