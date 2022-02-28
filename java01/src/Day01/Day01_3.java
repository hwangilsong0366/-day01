package Day01;

import java.util.Scanner;

public class Day01_3 { // c s
	
	public static void main(String[] args) { // m s
		
		
		// 입력
		//	Scanner : 입력 클래스 [ 입력에 관련된 기능 제공]
		
	
		
		Scanner 입력개체=new Scanner(System.in);
		
		// 1. Scaaner : 입력 클래스 
				// 2. scanner : 객체이름 
					//3. new : 메모리할당
						//4. Scanner() : 생성자
						//5. System.in  : 입력 [ 키보드 > 컴퓨터 ]
		System.out.print("이름 입력");
				
				
				String a= 입력개체.next();
		//1.String : 문자열 클래스 
			//2. 이름 : 객체이름 
				//3. 입력개체.next() : 입력개체내 저장된 데이터 가져오기
		System.out.println("입력하신 이름은 :" + a );
		
		
	}  // m e

} // c e
