package Day04;

import java.util.Scanner;

public class Day04_4 {
	public static void main(String[] args) {
		// 데이터 저장1개 > 변수
		// 배열 [특정 기준으로 나열]
			// *동일한 자료형 여러개 변수를 저장/관리
			//1. 인덱스: 저장되는 순서번호[0번 시작~]
			//2. [] : 대괄호 사용한다/
			//3. 동일한 자료형의 여려 변수를 관리
		
		//선언 
			//1. 자료형[] 배열명;   2.자료형 배열명[];
			//3. 자료형[] 배열명 = {데이터1, 데잍터2 ,데이터3 ~~}
			//4. 자료형[] 배열명= new 자료향[길이] ; 
		//데이터 호출
			//*배열명: 배열 메모리 주소값
			//1. 배열명[인덱스번호] : 해당 인덱스번호의 데이터 호출
		//데이터 변경
			//1. 배열명[인덱스번호] = 새로운 데이터
		
		// 배열의 길이
			//1. 배열명.length : 배열내 길이[ 변수의개수]
		
		//for 과 배열 활용
			//for(자료형 임시변수 : 배열명) { } 
			//배열내 0번 인덱스부터 끝 인덱스 까지 하나씩 임시변수에 대입 반복처리
		
		
//		int[] scores = {83,90,87};
		
			//1. int[] : int형 데이터 여러개를 저장할수 있는 배열선언
			//2. scores : 배열이름 
			//3. {데이터1, 데이터2 , 데이터3 ~~~~~~~} : 배열에 값 추가
//		
//		System.out.println(" scorse"+ scores); // 배열이름 호출 > 메모리 주소값
//		System.out.println("scores[0]:"+scores[0]); //0번 인덱스의 데이터 호출
//		System.out.println("scores[1]:"+scores[1]);	//1번 인덱스의 데이터 호출
//		System.out.println("scores[2]:"+scores[2]);
//		
//		
//		// 반복문과 배열 활용
//		int sum=0;
//		for(int i=0; i<3; i++) {
//			
//			System.out.println("scores["+ i+"] :" +scores[i]);
//			
//			sum+=scores[i];			
//	
//		}
//			System.out.println("총합:"+sum);
//			double avg= sum/3;
//			System.out.println("평균:"+avg);
//		
//		
//		//예제2
//		int[] 정수배열1 = new int[3];
//			// int[] : int형 배열 선언
//			// 정수배열1 : 배열이름[아무거나]
//			// new : 메모리할당 (객체, 배열에서 사용)
//			// int[3] : 자료형[길이] : 저장개수
//		
//		// *int 형 변수 3개를 저장할수 있는 배열 선언[메모리 할당]
//		
//		// 데이터 넣기전
//		for(int i=0; i<3; i++) {
//			
//			System.out.println("정수배열1[i]");
//			
//		}
//		
//		
//		
//		//for문 변경 활용
//			// 배열자료형 변수명 : 배열명
//		for(int temp : 정수배열1) {
//			// 배열내 인덱스 0번부터 끝까지 하나씩 데이터르 템프에 저장 반복
//					//1.정수배열1[0] > temp 저장
//					//2.정수배열1[1] > temp 저장
//					//3.정수배열[2] > temp 저장
//			
			
			// 
			
			int[] 사용자번호 = new int[6]; //사용자가 선택한 번호
			int[] 추첨번호 = new int[6]; //사용자가 선택한 번호
			Scanner scanner = new Scanner(System.in);
			
			//사용자에게 입력받기
			for(int i=0; i<=5; i++) {
				
				System.out.println("1~45 사이 입력 : ");
				int 번호 = scanner.nextInt();
				
			
				boolean 통과= true;
				
				//조건1: 유효성검사
				
				if(번호 < 1 || 번호 > 45) {
					// 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력
					
					System.out.println("알림 )) 선택할수 없는 번호 입니다.[재입력]");
					// 1보다 작서나 45보다 크면 선택할수 없는 번호입력시 재입력
					
					i--; // 			
				
				} // if end
				
			} // 조건2 : 중복체크
				//1. 배열내 모든 인덱스 호출			
			for(int j=0; j<6; j++) {
				if(번호 == 사용자번호[j]) {
					// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
				
					
				}
		
			}
			
			
	} // me 
	
} // c e
			
	 
	

