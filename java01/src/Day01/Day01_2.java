
package Day01;

public class Day01_2 { //  c s

	
	// 1. 출력
		// 1. print : 출력만
		// 2. printf : 꾸미기
		// 2. println : 줄바꿈
	
	// 제어문자 [ \ : 엔터위에 원화기호]
	// /n 줄바꿈
	
				
	
	// 1.System : 시스템 클래스 [입출력 관련 만들어진 코드 제공]
		// 2. out " 출력 스트림
	
	
	public static void main(String[] args) {
		
		
		System.out.print("aaabbb");
		System.out.print("java");  // 문자 " "처리
		System.out.print(123); 		
		
				// *미리 만들어진 단어를 제외한 모든 문자는 " " 처리
					//(syso + 컨트롤 + 스페이스 )
		
		System.out.println("aaabbb");
		System.out.println("java");  // 문자 " "처리
		System.out.println(123); 
		
		
		
		// 3. 형식출력
		 System.out.printf("%s","안녕하세요");
		System.out.printf("java %d일차",1);
		
		// 
		
		// 예제1 [출석부]
		System.out.println("\n\t[[출석부]]");
		System.out.println("----------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t출석\t결석\t출석");
		System.out.println("유재석\t출석\t출석\t출석");
		System.out.println("----------------------------");
		
		
		
		// 예제2 printf
		
		System.out.printf("\n\t%s","[[출석부]]\n");
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s \n", "이름", "1교시", "2교시", "3교시", "비교");
		System.out.printf("%s\t%s\t%s\t%s\t%s \n", "강호동", "출석", "출석", "출석", "");
		System.out.printf("%s\t%s\t%s\t%s\t%s \n", "유재석", "출석", "결석", "출석", "");
		
		
		// 문제1 : 고양이
		
		
		
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  / )");
		System.out.println(" \\(__)|"); 
		
		
		
		// 문제2 : 강아지
		
		System.out.println("|\\_/|");
		System.out.println("|q p|");
		System.out.println("( 0 )\"\"\\");  // \ 출력시 > \\
		System.out.println("|\"^\"`");
		System.out.println("||_/=\\\\_|"); 
		
	}

	
	
} // c e 
