package Day04;

import java.util.Random;  
import java.util.Scanner;  

public class Day04_3 { // c s
	public static void main(String[] args) { // m s
		
		int 플레이어; //사용자가 선택한 수 저장
		int 컴퓨터; //컴퓨터가 난수를 생성한 수 저장
		int 게임수=0; // 총 가위바위보 실행 횟수 저장
		int 플레이어승리수=0; int 컴퓨터승리수=0; // 각 승리 수 저장
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){ // 무한루프 종료조건 : 3번입력시 종료 (브레이크)
			System.out.println("-------가위바위보 게임-----------");
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) 선택 : ");
			플레이어 = scanner.nextInt(); // 입력한 수 저장
			System.out.println("플레이어가 낸수"+플레이어);
			
			Random random = new Random(); //난수 객체 선언
			컴퓨터 = random.nextInt(3);
			// 난수중 정수로 가져오기  
			//random.nextInt() int가 표현할수 있는 범위까지
			//random.nextInt(수): 0~ 수 전까지 범위내 난수 발생
			//random.nextInt(10) : 0~9 중 난수 발생
			// 플레이어 승리 경우의수 [0 > 2 / 1 > 0 / 2 > 1]
			
			
				if(플레이어 ==3) {
					System.out.println("알림)) 게임종료");
					System.out.println("총 게임 횟수:"+게임수);
					
					if(플레이어승리수 > 컴퓨터승리수) System.out.println("");
					
				}
			
			
			if((플레이어==0 && 컴퓨터==2) || (플레이어==1&&컴퓨터==0)||(플레이어==2&&컴퓨터==1)){
				System.out.println("알림)) 플레이어 승리");
				플레이어승리수++;
				
			}
			
			else if((플레이어==0 && 컴퓨터==0) || (플레이어==1&&컴퓨터==1)||(플레이어==2&&컴퓨터==2)) {
				System.out.println("알림)) 무승부");			
			}
			else{
				System.out.println("알림)) 컴퓨터 승리");
				컴퓨터승리수++;			
			}
			
			System.out.println(" 컴퓨터가 낸수:"+ 컴퓨터);
			
		} // w e
			게임수++;
		

	} // m e

} // c e
