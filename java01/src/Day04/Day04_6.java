package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {
	public static void main(String[] args) {
		
		
		// 준비 
		Scanner scanner = new Scanner(System.in); // 입력개체
		
		String[] 게임판 = {"[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]" ,"[ ]", "[ ]", "[ ]"}  ; // String 객체 9개를 저장할수 있는 배열 선언
		
		
		//게임실행
		String 승리알= ""; // 3목이 되었을때 해당 알을 변수로
		while(true) { // 무한루프 종료조건 : 1. 9칸이 모두 알이 있을 경우 2. 3목이 되었을때
			
			// 게임판 출력[ 배열내 모든 인덱스 출력]
			
			for(int i=0; i<게임판.length; i++) {
				System.out.print(게임판[i]);
				
				// 인덱스 2 5 8이면 줄바꿈
				if( i % 3== 2) System.out.println(); 
				
			}
			//////////////////////////1. 플레이어 위치(인덱스) 선택////////////////////////////////////
			while(true) {
			System.out.println("위치선택:"); int 위치= scanner.nextInt();
			if(게임판[위치].equals("[ ]")) {
			게임판[위치] = "[0]";
			break;
			
		}else {
			System.out.println("알림)) 해당 위치에 이미 알이 존대 [재 선택]");
	
		    }
		
		
		   }// while2 end
		////////////////////////////2. 컴퓨터 난수(인덱스)선택/////////////////////////////////////	
			while(true) {
				Random random =new Random(); // 1.난수객체 생성
				int 위치 = random.nextInt(9); // 2. 0~8사이의 난수 int형으로 가져오기
				if(게임판[위치].equals("[ ]")) { //3. 행당 난수위치가 공백
					
					게임판[위치]="[X]"; break;
				
				}
				
			} // wh 2 end [ 난수가 공백위치를 생성했을 경우에 break;]
			
			/////////////////////////////////3.승리자 판단////////////////////////////////////////////////
			
			
			// 1.가로로 이기는 수
			
			for (int i=0; i<=6; i+=3) {
				
				if(게임판[i].equals(게임판[i+1]) &&게임판[i+1].equals(게임판[i+2])) {
					
					승리알 = 게임판[i]; 
				}
				
			}
				
			if(승리알.equals("[0]")) {
				System.out.println("알림 )) 플레이어 승리");
				break; // 게임종료
			}
			if(승리알.equals("[X]")) {
				System.out.println("알림 )) 컴퓨터 승리");
				break; // 게임종료
			
			}
			
			// 세로로 이기는 수
			
			for(int i=0; i<=2; i++) {
				if(게임판[i].equals(게임판[i+3]) && (게임판[i+3].equals(i+6)){
					승리알 = 게임판[i];
					
				}
				
			}
			
			
			// 대각선으로 이기는수
			
			if(게임판[0].equals(게임판[4])) && 게임판[4].equals(게임판[8]) {
			
			
			
			
	
	     } //w 1
		
    } // m e 
	
	
	
} // c e
