package Day01;

import java.util.Scanner;

public class Day01_5 {
	public static void main(String[] args) {
		
		// 문제1
		
		
		//1. 입력객체 선언
		Scanner scanner=new Scanner(System.in);
		
		//2. 입력할 대상 안내
		System.out.println("아이디: ");
		
		String id= scanner.next();
		
		System.out.println("비밀번호:");
		
		String pw= scanner.next();
		
		System.out.println("성명:");
		
		String name= scanner.next();
		
		System.out.println("이메일:");
		
		String e= scanner.next();
		
		System.out.println(">>>>>>>>>>>회원가입 완료 아래 정보를 확인 >>>>>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(id + "\t" + pw + "\t" + name + "\t" + e);
		
		
		
		
		
	
		
		
	}
	
}
