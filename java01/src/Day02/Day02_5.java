package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	

	System.out.println("금액 : ");


	int 금액 = scanner.nextInt();
	
	System.out.println(" 입력한 금액:"+ 금액);
	
	System.out.println("십만원:"+ (금액/100000)+ "장");

	금액 -= (금액/100000)*100000;
	
	System.out.println("십만원 제외 금액 : "+ 금액);
	System.out.println("만원 : "+ (금액/10000)+"장");
	
	금액 -= (금액/10000)*10000;
	
	System.out.println("만원 제외 금액 : "+ 금액);
	System.out.println("천원 : "+ (금액/1000)+"장");
	
	금액 -= (금액/1000)*1000;
	
	System.out.println("백원 : "+ (금액/100)+"개");
	
	
	
		//문제3 
		
			// 값 % 했을때 나머지가 0으로 떨어지면 
		
//		
//		System.out.println("문제3)정수 입력:");
//		int 배수 = scanner.nextInt();
//		
//		System.out.println("입력한 정수는 7의 배수 판단:"+ (배수%7==0));
//		
		
		
		
		//문제4 
				// 홀짝 찾기 
					//홀수: 값 %2했을때 나머지가 1이면 홀수 
					//짝수: 값 %2했을때 나머지가 0이면 짝수 
//		System.out.println("문제4) 정수입력:");
//		
//		int 홀짝=scanner.nextInt();
//		
//		
//		System.out.println("입력한 정수는 홀수 :"+ (홀짝%2==1));
//		
//		

//	
//		//문제5
//		
//		System.out.println("정수를 입력:");
//		
//		int 홀짝= scanner.nextInt();
//		
//		System.out.println("입력한 정수는 7의 배수이면서 짝수이다"+(홀짝%7==0 && + 홀짝%2==0) );
//		
//		
		
		
//		
//		System.out.println("정수1을 입력하시오");
//		
//		
//		int 정수1=scanner.nextInt();
//		
//		System.out.println("정수2를 입력하시오");
//		
//		int 정수2=scanner.nextInt();
//		
//		int 큰수 = 정수1 >= 정수2 ? 정수1 : 정수2;
//		
//		System.out.println("더 큰수는:" + 큰수);
		
		//문제7
//		
//		System.out.println("반지름을 입력하시오:");
//		
//		int 반지름 = scanner.nextInt();
//		
//		System.out.println("원의 넓이는: ");
//		
//		System.out.println((반지름*반지름*3.14));
//		
		
		
		
				//문제8 
//	
//			System.out.println("실수1을 입력:"); 
//			
//			double 실수1 = scanner.nextDouble();
//			
//			System.out.println("실수2을 입력:"); 
//			
//			double 실수2 = scanner.nextDouble();
//	
//			double 비율 = (실수1/실수2)*100;
//			
//			System.out.println("실수1의 실수2 백분율" + 비율+ "%"); 
//			System.out.printf("실수1의 실수2 백분율 : %.2f %%",비율); 
//			
//				// %f : 실수 표현 
					// %.숫자f 
					// %.2f : 소수점 2번째 
					// %.5f : 소수점 5번째
			
			
		
		
//		문제9
//		System.out.println("윗변의 길이:");
//		
//		int 윗변 =scanner.nextInt();
//		
//		System.out.println("밑변의 길이:");
//		
//		int 밑변 = scanner.nextInt();
//		
//		System.out.println("높이:");
//		
//		int 높이 = scanner.nextInt();
//		
//		System.out.println("사다리꼴 넓이는"+ (윗변*밑변)*높이/2);


		
//	     문제10
	
//	    System.out.println("키를 입력하시오:");
//	
//	    int 키 = scanner.nextInt();
//	
//	    System.out.println("표준체중은 : "+ (키-100)*0.9);
	
		
		//문제 11
//		
//		System.out.println("키를 입렵하시오:");
//		
//		int 키 = scanner.nextInt();
//		
//	    System.out.println("몸무게를 입렵하시오:");
//		
//		int 몸무게 = scanner.nextInt();
//		
//		System.out.println("BMI는 :"+ 몸무게/((키 /100.0))*(키 /100.0));
	
		
		
		//문제 12
//		
//		System.out.println("inch 를 입력하시오:");
//		
//		int cm = scanner.nextInt();
//		
//		System.out.println("cm는 : "+ (cm*2.54) +"입니다");
//		
		
		// 문제 13
		
//		System.out.println("중간고사 점수 : ");
//		
//		int 중간 = scanner.nextInt();
//		
//		System.out.println("기말고사 점수 : ");
//		
//		int 기말 = scanner.nextInt();
//		
//		System.out.println("수행평가 점수 : ");
//		
//		int 수행 = scanner.nextInt();
//		
//		double 중간1 = 중간*0.3;
//		double 기말1 = 기말*0.3;
//		double 수행1 = 수행*0.4;
//		
//		System.out.printf(" 반영 비율 총점: %.2f",(중간1+기말1+수행1));
//		
//		//문제14
//		
//		int x = 10;
//		int y = x-- + 5 + --x;
//		printf(" x의 값 : %d , y의값 :  %d ", x, y);
//		
		// 1. x-- + 5 >> 10+5  ****
			// 2. x--는 감소 >   x =9
			// 3. 15 + --x >>  x=8
			// 4. 15+ 8= 23 
		
		
		//문제15
		
//		System.out.println("나이 : ");
//		
//		int 나이 = scanner.nextInt();
//		
//		String 나이1 = 나이 > 40 ? "중년" : 나이 > 20 ? "성인" : "학생" ;
//		     		//  1.나이가 40이상이면 중년 아니면 
//							
//		System.out.println("나이는 : "+ 나이1+ "이다.");
		
		
	
		
	         //문제16 : 3개의 정수를 입력받아 오름차순으로 정렬
	
	
	
			//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
//		
     }
   
}