package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		//1. Car : 정의된 클래스명
		//2. mycar 아무거나
		//3. new: 메모리 할당 연산자
		//4. Car() :생성자
		
		//2. 객체내 필드 호출 [. : 접근연산자]
		System.out.println("제작회사 : " + myCar.company);
		//mycar 객체내 필드 접근
		System.out.println("모델명:" + myCar.model);
		
		System.out.println("색깔:" + myCar.color);
		
		System.out.println("최고속도:" + myCar.maxSpeed);
		
		//3.객체내 필드 값 변경
		
		myCar.speed= 60;
		System.out.println("수정된 속도 : " + myCar.speed );
		
		Car yourcar = new Car();
	System.out.println(" 2번 자동차 :"+ yourcar.speed );
	
	}
	
	
}
