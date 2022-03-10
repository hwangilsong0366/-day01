package Day07;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Member {
	
	// 1.필드
	 int mno;//회원번호
	 String id;	//아이디
	 String pw;// 비밀번호
	 String name;//이름
	 String phone;//연락처
		
	//2.생성자  [생성자명 == 클래스명]
	 	// 1.빈생성자[기본생성자] : 메소드호출용 객체생성시
		//임의
	 Scanner scanner = new Scanner(System.in);
	 public Member() {}
	 
	 public Member(int mno, String id, String pw, String name,String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	 }
	
	//3.로그인 메소드 [인수x 반환o]
 boolean 회원가입() {
	 System.out.println(" ----- 회원가입 페이지 ------");
		System.out.println("아이디:"); String id= Day07_5_BookApplication.scanner.next();
		System.out.println("비밀번호:"); String pw=Day07_5_BookApplication.scanner.next();
		System.out.println("이름:");String name = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처:");String phone = Day07_5_BookApplication.scanner.next();
 		}

		String 로그인() {
			 System.out.println(" ----- 로그인 페이지 ------");
				//1. 입력받기
			 System.out.println("아이디:"); String id =Day07_5_BookApplication.scanner.next();
			 System.out.println("비밀번호:"); String pw =Day07_5_BookApplication.scanner.next();
			 //2.배열내 객체 id와 pw가 입력한 값과 동일하면
			  for(Member temp : Day07_5_BookApplication.members) {
				  if(temp !=null && temp.id.equals(id) && temp.pw.equals(pw)) {
					  return temp.id;
					  
				  }
				  
			  }
			 return "아이디";
			 
		 }
		 void 아이디찾기() {
			 System.out.println(" ----- 아이디찾기 페이지 ------");
			 System.out.println("이름:"); String name = Day07_5_BookApplication.scanner.next();
			 System.out.println("전화번호:"); String phone = Day07_5_BookApplication.scanner.next();
			 for(Member temp : Day07_5_BookApplication.members) {
				 if(temp !=null && temp.name.equals(phone)) {
					 
					 
				 }
				 
			 }
		 }
		 void 비밀번호찾기() {
			 System.out.println(" ----- 비밀번호찾기 페이지 ------");
		 }
		 
		 
		//1. 회원가입 메소드
		//2 . 로그인 메소드
		//3. 아이디찾기 메소드
}


