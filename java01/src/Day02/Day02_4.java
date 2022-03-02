package Day02;

public class Day02_4 {
	
             public static void main(String[] args) {
            	 
            	 // 1. 산술 1. + (더하기) 2. - 빼기 3. * 곱하기 4. / 나누기 >>목 5. %( 나누기 >) 나머지)
            	 
            	 // 2. 비교
            	 			//> 초과     <미만
            	 			//>= 이상 		<=이하
            	 			//== 같다		!= 같지 않다. [다른다]
            	 			
            	 			
            	 // 3. 논리 [ 2개이상 비교연산자 사용시]
            	            //&& 이면서 이고 모두 그리고 and
            	            //|| 이거나 거나 또는 하나라도 or
            	            // ! 부정[반대] 
            	 //4. 대입 오른쪽값이 왼쪽으로 이동
            	 			//= : 오른쪽값이 왼쪽으로 이동[저장]
            	 			//+= : 오른쪽값이 왼쪽값과 더하기 후에 			
            	 			//
            	 
            	 				// 변수명 = 변수명 +10 
            	 					//1 변수를 호출 
            	 					//2. 변수에 10 더한다.
            	 					//3. 해당변수에 10을 더한다.
            	 
            	 
            	 //5. 증감 [* : 일정간격으로 변화]
            	 			//1. ++: 1증가     2.-- : 1감소
            	 			//선위 증가/감소 : 
            	 
            	 
            	 // 삼항연산자 [조건연산자]
            	 
            	 	 // 조건식 ? 참 : 거짓 
	
            	 // 산술연산자 예
            	 
            	 
            	 int 정수1 = 10;   int 정수2= 20;
            	 
            	 
            	 System.out.println("더하기 :" + 정수1+정수2);      // 문자열+정수 >> 연결연산자
            	 												// 문자열+(정수1+정수2) 
            	 System.out.println("더하기 :" + (정수1+정수2));
            	 
            	 
            	 System.out.println("빼기 : "+ (정수1-정수2));
            	 
            	 System.out.println(" 곱하기 : " + (정수1*정수2));
            	 
            	 System.out.println(" 나누기 :" + (정수1/정수2));
            	 
            	 System.out.println(" 나머지 :" + (정수1%정수2));
            	 
            	 // 증감연산자 예제
            	 
            	 정수1++; // 변수명뒤에 ++할 경우 해당 변수내 데이터에 +1 
            	 
            	 
            	System.out.println("증가: "+ 정수1);
            	 
            	 정수1--; // 변수명뒤에 -- 할 경우 해당 변수내 데이터에 -1
            	 
            	 System.out.println(" 감소 : " + 정수1);
            	 
            	 System.out.println("선위증가:" + ++정수1); 
            	 System.out.println("후위증가:" + 정수1++);
            	 
            	 
            	 //명령어처리는 동시처리 불가능 > 처리 순서가 존재 
            	 // ++변수 : 먼저 증가후 print 실행
            	 //변수++ : print 실행 후 증가
            	 
            	 System.out.println("후위증가 후 : "+ 정수1);
            	 
            	 
            	 System.out.println("선위감소 : "+ --정수1);
            	 System.out.println(" 후위감소 :" + 정수1--);
            	 
            	 System.out.println("후위감소 후 :" + 정수1);
          
            
            	 System.out.println(" 이상 "+ (정수1 >= 정수2));
            	 
            
             	 System.out.println(" 이하: "+(정수1 <= 정수2));
            	 
            	 System.out.println("초과 : "+ (정수1 > 정수2));
            	 System.out.println(" 같다 :"+ (정수1==정수2));
            	 
            	 System.out.println("같지않다:"+ (정수1!=정수2));
            	 
            	 
            	 // 논리연산자 예제 
            	 	// and && : 2개이상의 비교연산자가 모두 true  >> 결과도 true 아니면 false
            	 
            	 
            	 
            	 int 정수3 = 30;   int 정수4 = 40;
            	 
            	 System.out.println(" and :"+ (정수1 >= 정수2 && 정수4 >=정수3));
            	 
            	 System.out.println("or : "+ (정수1>=정수2 || 정수4 >=정수3));
            	 
            	 
            	 System.out.println("not 부정: " + !(정수1>=정수2 || 정수4>=정수3));
            	 
            	 
            	 // 대입연산자 예제 
            	 
            	 정수1 =정수1 +10;
            	 
            	 System.out.println("정수1:"+ 정수1);
            	 
            	 정수1 +=10;
            	 System.out.println("정수1:"+ 정수1);
            	 
            	 // 조건연산자 예제
            	 
            	 int 점수 =85;
            	 
            	 char 등급= 점수 > 90 ? 'A' : 'B';
            	 
            	 //  조건식 ? 참(true) : 거직(false)
            	 // 점수가 90 초과하면 A 아니면 B
            	 
            	 System.out.println("등급:" + 등급);
            	 
            	 char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;
            	 
            	  // 조건식 ? 참 : 거짓[조건식 ? 참 : 거짓 ]
            	 
            	 
      } 
             
	
	
	
	
	
	

}
