package Practice01;

import java.util.Scanner;

public class Practice01_1 {
	
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 int 콜라재고 =10; 	 int 토레타재고 =10; 	 int 쥬스재고 =10; 
		int 콜라구매수 = 0;		 int 토레타구매수 = 0;		 int 쥬스구매수 = 0;		 

		while(true) { //w s
			
			System.out.println("----------------메뉴판-------------------");
			System.out.println("1.콜라:300 2.토레타:200 3.쥬스:500 4.결제");
			System.out.println(">>>>>>>선택");        int 번호 = scanner.nextInt();
			
			
			if(번호==1) {
				
				if(콜라재고==0){
					
					 System.out.println("재고가 없습니다 ");
					
				}
			
			else { 
				 System.out.println("콜라를 장바구니에 담았습니다.");
				콜라재고--;
				콜라구매수++;
			}
				
				
			}else if(번호==2) {
				if(토레타재고==0) {
					 
						System.out.println("재고가 없습니다");
				}else {
					
					System.out.println("토레타를 장바구니에 담았습니다");
					토레타재고--;
					토레타구매수++;
				}
				
			}else if(번호==3){
				if(쥬스재고==0) {
					System.out.println("재고가 없습니다.");
					
				}else {
					System.out.println("쥬르를 장바구니에 담았습니다");
					쥬스재고--;
					쥬스구매수++;
				
				}
				
			}else if(번호==4) {
				System.out.println("-------결제-------");
				System.out.println("제품명\t구매수량\t금액");
				if(콜라구매수!=0) 	System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300));
				if(토레타구매수!=0)   	System.out.println("토레타\t"+ 토레타구매수 +"\t"+(토레타구매수*200));
				if(쥬스구매수!=0)   	System.out.println("쥬스\t"+쥬스구매수+"\t"+(쥬스구매수*500));				
				int 총결제 = (콜라구매수*300)+(토레타구매수*200)+(쥬스구매수*500);
				System.out.println("총 결제액:"+총결제);
				System.out.println("1. 결제  2.취소");  int 번호2 = scanner.nextInt();
							
						
			      if(번호2==1) {
			    	  while(true) {
			    			System.out.println("알림)) 금액:"); int 금액 = scanner.nextInt();
			    			if( 금액 <총결제) {
			    				System.out.println("금액이 부족합니다");
			    			}else {
			    				
			    		
			    				System.out.println("구매완료 주문번호 0000번");
			    			System.out.println("잔돈:"+(금액-총결제));
			    			
		    				콜라구매수=0; 	토레타구매수=0; 	쥬스구매수=0;
			    				break;
			    				
			    			} // 
			    		  
			    			
			    	  }  // 
 			    	
			    	  
			      } // 
			      else if(번호2==2) {
			    	  
			    	  System.out.println("구매목록 모두 지우기");
			    	  콜라재고 += 콜라구매수;	토레타재고 += 토레타구매수; 쥬스재고 +=쥬스구매수; //  구매수를 재고로 옮기기 
						콜라구매수 =0; 토레타구매수=0; 쥬스구매수=0;			
			    	  
			      }else {
			    	  
			    	  System.out.println("알수없는 행동");
			      }
				
			}
			else {
				
				  System.out.println("알수없는 행동");
				
			
			
		} // 
			
		 
	} // 
	
	 }
}

