package Practice01;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		int 콜라 = 0; 	int 환타 = 0; 	int 우유= 0;
		int 콜라재고 = 10;   	int 환타재고 = 10;   	int 우유재고 = 10;  
		Scanner scanner = new Scanner(System.in);
		
		 while(true) {
			 System.out.println("-----------------------------");
			 System.out.println("1.콜라 2.환타 3.우유 4.결제");
			 System.out.println(">>>>>번호 "); int 번호 = scanner.nextInt();
			 
			 if(번호==1) {
				 if(콜라재고==0) {
					 System.out.println("재고가 없습니다. ");
					 
				 }
				 else {
					 System.out.println("콜라르 1개 담았습니다.");
					 콜라++;
					 콜라재고--;					 
				 }
				 
			 }
			 if(번호==2) {
				 if(환타재고==0) {
					 System.out.println("재고가 없습니다. ");					 
				 }
				 else {
					 System.out.println("환타를 1개 담았습니다.");
					 환타++;
					 환타재고--;					 
				 }				 
			 }
			 if(번호==3) {
				 if(우유재고==0) {
					 System.out.println("재고가 없습니다. ");					 
				 }
				 else {
					 System.out.println("우유르 1개 담았습니다.");
					 우유++;
					 우유재고--;					 
				 }
			 }
			 if(번호==4) {
				 System.out.println("결제를 진행합니다");
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
				 System.out.println("총 결제금액:"+총결제);	
				 System.out.println("1.결제 2.취소 "); int 번호2 = scanner.nextInt();
				 System.out.println("--------------------------------");	
				 if(번호2==1) {
					while(true) {						
						 System.out.println(" 결제 금액:");  int 금액 = scanner.nextInt();
							if(금액 <총결제) {
								 System.out.println("잔액이 부족합니다");	
								
							}
							else {
								 System.out.println("결제완료 ");	
								 System.out.println("거스름돈 :" +(금액-총결제)+"원");	
								 콜라  = 0;  환타  = 0;  우유  = 0;
								 break;
								 
							}
							
						}
						
					
				 }
				 else if(번호2==2) {
					 System.out.println("구매목록 지우기");
					 콜라재고 += 콜라;      환타재고 += 환타;    우유재고 += 우유;  
					 콜라  = 0;  환타  = 0;  우유  = 0;
					 
				 }
				 else {
					 System.out.println("오류");
				 }
				
				
			 } // 결제 e
			
		 } // w e
			 
		
		
		
	} //  m me 
	

} // c e
