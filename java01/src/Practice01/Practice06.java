package Practice01;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int 콜라=0;	int 사이다=0;	int 토레타=0;
		int 콜라재고=10;  int 사이다재고=10; int 토레타재고=10; 
		
		while(true) {
			System.out.println("-------------메뉴-------------");
			System.out.println("1.콜라 2.사이다 3.토레타 4.결제");
			System.out.println(">>>>>>>번호"); int 번호=scanner.nextInt();
			
			if(번호==1) {
				if(콜라재고==0) {
					System.out.println("콜라 재고가 없습니다.");					
				}
				else {
					System.out.println("콜라 1개를 담았습니다.");
					콜라++;
					콜라재고--;					
				}					
			}
			if(번호==2) {
				if(사이다재고==0) {
					System.out.println("사이다 재고가 없습니다.");					
				}
				else {
					System.out.println("사이다 1개를 담았습니다.");
					사이다++;
					사이다재고--;					
				}					
			}
			if(번호==3) {
				if(토레타재고==0) {
					System.out.println("토레타 재고가 없습니다.");					
				}
				else {
					System.out.println("토레타 1개를 담았습니다.");
					토레타++;
					토레타재고--;					
				}					
			}
			if(번호==4) {
				System.out.println("----------결제-----------.");
				System.out.println("제품\t수량\t금액");
				if(콜라!=0) System.out.println("콜라\t"+콜라+"\t"+(콜라*100));
				if(사이다!=0) System.out.println("사이다\t"+사이다+"\t"+(사이다*200));
				if(토레타!=0) System.out.println("토레타\t"+토레타+"\t"+(토레타*300));
				int 총결제 =(콜라*100)+(사이다*200)+(토레타*300);
				System.out.println("결제금액:" +총결제); 
				System.out.println("1.결제 2.취소"); int 번호2=scanner.nextInt();
				
				if(번호2==1) {
					while(true) {
						System.out.println("결제금액을 입력하시오:" );  int 결제=scanner.nextInt();
						if(결제< 총결제) {
							System.out.println("잔액이 부족합니다" );
							
						}
						else {
							System.out.println("결제 성공" );
							System.out.println("잔돈: "+(결제-총결제)+"원" );
							콜라=0; 사이다=0; 토레타=0;
							break;
							
						}
						
					}
				
				}
				else if(번호2==2) {          // ***** if 사용*****
					System.out.println("결제를 취소합니다." );
					콜라재고+=콜라; 사이다재고+=사이다; 토레타재고+=토레타;
					콜라=0; 사이다=0; 토레타=0;
					
				}else {
					
					System.out.println("알수없습니다" );
				}
				
				
			} // 결제 e
			else {
				
				System.out.println("알수없습니다" );
			}
		} //  w e
	}

}
