package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("기본급 입력 : ");
		
		int 기본급= scanner.nextInt();

		System.out.println("수당 입력 : ");		
		
		int 수당= scanner.nextInt();
		
		
		int 세금= (int)(기본급*0.1);		
		
		int 실수령액 = 기본급 + 수당 - 세금;
		
		System.out.println("회원님의 실수령액은 :" + 실수령액);
		
		
		
		
		
		
		
		
		
	}
	
	
}
