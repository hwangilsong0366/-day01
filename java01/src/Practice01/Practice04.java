package Practice01;

import java.util.Scanner;

public class Practice04 {
	// 공통변수 
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int 콜라재고=10;  int 환타재고=10; int 우유재고=10; 
		int 콜라 = 0; 	int 환타 = 0; 	int 우유 = 0;
		

	

		while(true) {
			
			System.out.println("-------===-메뉴판---====-------");
			System.out.println("1.콜라100 2.환타200 3.우유300 4.결제");
			System.out.println(">>>>>>>번호를 입력");  int 번호 = scanner.nextInt();
			if(번호==1) {
				if(콜라재고==0) {					
					System.out.println("콜라 재고가 x ");			
				}
							
			else {
				System.out.println("콜라 1개를 담았습니다");		
				콜라++;
				콜라재고--;
			}
			  	
			}
			else if(번호==2) {
				if(환타재고==0) {
					System.out.println("환타 재고가 x ");										
				}
				else {
					System.out.println("환타 1개를 담았습니다");			
					환타++;
					환타재고--;
					
				}
				
			}
			else if(번호==3) {
				if(우유재고==0) {
					System.out.println("우유 재고가 x ");										
				}
				else {
					System.out.println("우유 1개를 담았습니다");			
					우유++;
					우유재고--;
					
				}
				
				
			}
			else if(번호==4) {
				System.out.println("-------결제 제품 목록---------");
				System.out.println("제품명\t수량\t금액");
				if(콜라!=0) {
					System.out.println("콜라\t"+콜라+"\t"+(콜라*100));
				}
				if(환타!=0) {
					System.out.println("환타\t"+환타+"\t"+(환타*200));
				}	
				if(우유!=0) {
					System.out.println("우유\t"+우유+"\t"+(우유*300));
				}	
				int 총결제 = (콜라*100)+(환타*200)+(우유*300);
				System.out.println(" 제품 총 결제액 : " + 총결제 );
				
				System.out.println("----------------------------------------");
				System.out.println(" 1.결제 2.취소"); int 번호2 = scanner.nextInt();	
				
				if(번호2==1) {
					while(true) { // 무한루프 [ 종료조건 : 금액이 총결제액보다 크면 ]  
						System.err.println(" 알림)) 금액 : "); int 금액 = scanner.nextInt();

						if( 금액 < 총결제 ) { // 결제불가 -> 재입력 
							System.err.println(" 알림)) 금액이 부족합니다. 다시 금액 투여 ");
						}else { // 금액이 더크면 
							System.err.println(" 알림)) 구매완료  주문번호 : OOOO번");
							System.err.println(" 알림)) 잔돈 출력 : " + ( 금액 - 총결제 )+"원" );
							콜라 =0; 환타=0; 우유=0;				// 구매수 초기화 
							break; // while 탈출
						}
					}
					
				}
		
					
				
			
				
		
		
			
			} // 결제 e 

		
		} // w e  
		
		
	} // m e
	

} // c e
