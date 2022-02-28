package Day01;

import java.util.Scanner; // 

import javax.print.attribute.SetOfIntegerSyntax;

public class Day01_4 { //  c s

	public static void main(String[] args) {  // m s
		
		
		// 예제1 : 이름, 1교시, 2교시, 3교시 출석여부를 입력받아 출력
		
		
		
		// 1. 입력객체 선언
		
		Scanner a= new Scanner(System.in);
		
		//2 입력받을 데이터 안내
		
		System.out.println("이름 : ");
		
		//3. 입력받은 데이터 가져오기 > 다른곳 (String:문자열)에 저장
		
		String b=a.next();
		
		
		System.out.println("1교시 : ");   
		String 교시1 =a.next();
		System.out.println("2교시 : ");   
		String 교시2 =a.next();
		System.out.println("3교시 : ");   
		String 교시3 =a.next();
		
		
		System.out.println("\t\t[[출석부]]");
		System.out.println("-------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("--------------------------------");
		
		
		

		
		
		
		
	}
	
	
	
}
