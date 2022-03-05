package Practice01;

import java.util.Scanner;

public class Practice0_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 콜라구매수=0; int 환타구매수=0;		int 우유구매수=0;	 
		int 콜라재고=10;  int 환타재고=10;   int 우유재고=10;  
		
		
		while(true) {  // 1		
			System.out.println("-------------메뉴판--------------");
			System.out.println("1. 콜라100 2.환타200 3.우유300 4.구매");
			System.out.println(">>>>>>>>>번호 입려:"  ); 	 		int 번호= scanner.nextInt();
			if(번호==1) { //2
				if(콜라재고==0) {
					System.out.println("콜라 재고가 없습니다");										
				}
				else {
					System.out.println("콜라 1개를 담았습니다");
					콜라재고--;
					콜라구매수++;		
				}
			}
				else if(번호==2) {
					if(환타재고==0) {
						
						System.out.println("환타 재고가 없습니다");
						
					}
					else {
						System.out.println("환타 1개를 담았습니다");
						환타재고--;
						환타구매수++;		
						
					}
						
					
				}
				else if(번호==3) {
					if(우유재고==0) {
						
						System.out.println("우유 재고가 없습니다");
						
					}
					else {
						System.out.println("우유 1개를 담았습니다");
						우유재고--;
						우유구매수++;		
						
					}
						
					
				}
			
				else if(번호==4) {
					System.out.println(" ------------- 결제 제품목록 -------------");
					System.out.println("제품명\t수량\t금액");
					if(콜라구매수 !=0) {
						System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*100));
					}
					if(환타구매수 !=0) {
						System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*200));
					}
					if(우유구매수 !=0) {
						System.out.println("우유\t"+우유구매수+"\t"+(우유구매수*300));
					}
				int 총결제금액 = (콜라구매수*100)+(환타구매수*200)+(우유구매수*300);
				System.out.println(" --------------------------");
				System.out.println("총 결제액:"+총결제금액);
				System.out.println(" --------------------------");
				System.out.println("1.결제 2.취소"); int 번호2=scanner.nextInt();
				
				if (번호2==1) {
			
					while(true) {
						System.err.println(" 알림)) 금액 : "); int 금액 = scanner.nextInt();
					
							
						if(금액 < 총결제금액) {
							System.err.println(" 알림)) 금액이 부족합니다. 다시 금액 투여 ");
							
						}else {
							
							System.err.println(" 잔돈 :"+(금액-총결제금액));
							콜라구매수 =0; 환타구매수=0; 우유구매수=0;				// 구매수 초기화 
							break; // while 탈출
						}
						
						
					}
				
				
				       }
				
				
				
			
	
		} //1 
		

		}
		
   }

	
} 