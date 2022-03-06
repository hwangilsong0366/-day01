package Practice01;

import java.util.Scanner;

public class Practice000{
	
	// Day01 : 입출력
	// Day02 : 변수[저장] 연산[계산]
	// Day03 : if[제어문] for[반복문]
	
	// 자판기 프로그램
		// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ] 
		// 		// 1.메뉴판에서 제품선택하면 장바구니에 넣기 
		//		// 2.재고가 부족하면 알림( 재고부족 )
		// 2. 초기 재고 [ 제품 당 10개씩 ]
		// 3. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력 
				// 1. 투입한 금액보다 구매액 이 더 크면 결제 취소 [ 금액부족 ]
	
	
	public static void main(String[] args) {
		
		// 공통변수[ 모든 괄호내에서 사용하는 변수들 ]
		Scanner scanner = new Scanner(System.in); 			// 1. 입력객체
		int 콜라재고 =10; int 환타재고 =10; 	int 사이다재고=10; // 2. 재고변수
		int 콜라구매수=0;	int 환타구매수 = 0;	int 사이다구매수=0;	// 3. 장바구니 
		
		while(true) { // 프로그램 시작 [ 무한루프 ]
			System.out.println("------------- 메뉴 ------------");
			System.out.println(" 1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ");
			System.out.print(">>>>>> 선택 : "); int 선택 = scanner.nextInt();
			
			if( 선택 == 1 ) { // 콜라 구매
				if( 콜라재고 == 0 ) { // 콜라재고가 0이면 구매불가 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중"); // 알림
				}
				else { // 콜라재고가 있으면 구매가능 
					System.err.println(" [[ 콜라 담았습니다.]]"); // 알림
					콜라구매수++; // 장바구니에 콜라 담기 
					콜라재고--;	// 콜라재고 차감
				}
			}// 콜라 구매 end 
			else if( 선택 == 2 ) { // 환타 구매 
				if( 환타재고 == 0 ) { 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중"); 
				}
				else { 
					System.err.println(" [[ 환타 담았습니다.]]");
					환타구매수++; 
					환타재고--;	
				}
			}// 환타 구매 end 
			else if( 선택 == 3 ) { // 사이다 구매 
				if( 사이다재고 == 0 ) { 
					System.err.println(" 알림)) 재고가 없습니다 .재고 준비중"); 
				}
				else { 
					System.err.println(" [[ 사이다 담았습니다.]]");
					사이다구매수++; 
					사이다재고--;	
				}
			}// 사이다 구매 end 
			else if( 선택 == 4 ) { // 결제 
				System.out.println(" ------------- 결제 제품목록 -------------");
				System.out.println("제품명\t수량\t금액");
				if(콜라구매수 !=0) System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300) );
				if(환타구매수 !=0) System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*200) );
				if(사이다구매수 !=0) System.out.println("콜라\t"+사이다구매수+"\t"+(사이다구매수*100) );
				int 총결제액 = (콜라구매수*300)+ (환타구매수*200) + (사이다구매수*100) ;
				System.out.println(" 제품 총 결제액 : " + 총결제액 );
				System.out.println("----------------------------------------");
				System.out.println(" 1.결제 2.취소"); int 선택2 = scanner.nextInt();
				
			}	
			}	
			}
		}
				