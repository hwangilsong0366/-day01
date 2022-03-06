package Day04;

import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		
		// 제어문 : if, switch
		// 반복문 : for, while
				//1.초기값 2.조건식 3.증감식 4.실행문
		//while 형태
		
		
		
		
		//for 예1)
		
		for(int i=1; i<=10; i++) {
			
			//  i는 1부터 10이하까지 1씩증가하면서 실행문 반복처리
			
			System.out.println(i+" ");
			
		}
		
		
		// while 예1)
		
		int i=1; 
		while(i<=10) {
			
			
			
			System.out.println(i+" ");
			i++;
			
			
		}
		
		// for 예2)
		int sum=0;
		for(int j=1; j<=100; j++) {
	
			sum +=j;
			
			System.out.println("for문 누적합계 :" +sum);
			
		}
		//while 예3)
		
		int j =1; 
		int sum2=0;
		while (j<=100) {
			sum+=j;
			j++;
			
		}
		
		//예4
		
		// true 값을 만날때 무한루프 끝이난다
		while(true) {
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			
			
		}
		
		
		
		
		
		
		
	} // m e

} // ce 
