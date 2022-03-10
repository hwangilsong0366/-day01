package Day06;

import java.util.Scanner;

public class Day06_3_회원제프로그램 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	Member[] memberlist = new Member[100];  ////////////////
	
	
	while(true) {
	System.out.println("-------회원제[클래스 버전!!]----------");
	System.out.println("1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기");
	System.out.println("번호 입력: "); int num =scanner.nextInt();
	
	if(num==1) {
		System.out.println("------회원 가입 진행-----------");
		System.out.println("아이디: "); String id = scanner.next();
		System.out.println("비밀번호: "); String pw = scanner.next();
		System.out.println("이름: "); String name = scanner.next();
		System.out.println("연락처: "); String phone = scanner.next();
		
		Member member = new Member();
		
		member.id = id;     ////////////////
		// 객체내 필드 = 입력받은값 
		member.pw= pw;  ////////////////
		member.name= name;////////////////
		member.phone= phone;////////////////
		
		boolean idc = false; ////////////////
		for(Member temp : memberlist) {
			
			if(temp !=null && temp.id.equals(id)) {
				
				
				System.out.println("해당 아이디는 이미 사용중입니다. 다시 시도하세요");
				idc = true;
				break;  				

			}
		}
		if(idc == false) {
			int i=0;
			for(Member temp:memberlist) {
				if(temp == null) {
					
					memberlist[i] = member;
					System.out.println("회원 가입 성공!!!!");
					break;
				}
		
			}
			i++;
			
		}		
	}
else if(num==2) {
	System.out.println("***************로그인 페이지***************");
	
	System.out.println("아이디:" );  String log1 = scanner.next();
	System.out.println("비밀번호 :" );  String log2 = scanner.next();
	
	boolean loginch =false;
		for(Member temp : memberlist) {
			if(temp !=null && temp.id.equals(log1)) {
				
				System.out.println("로그인 성공!!");
				loginch = true;
				
			}
			
		}
		if(loginch==false) {
			System.out.println("알림)) 동일한 회원정보가 없습니다/.");
			
		}
}
else if(num==3) {
	System.out.println("*********아이디 찾기************");
	System.out.println("이름: ");  String name = scanner.next();
	System.out.println("연락처 : "); String phone = scanner.next();
	
	boolean findch = false;
	for(Member temp : memberlist) {
		if(temp !=null && temp.name.equals(name) && temp.phone.equals(phone)) {
			
			System.out.println("알림)) 아이디 찾기 성공");
			System.out.println("회원 id :" +temp.id);
			findch = true;  // 
			break;
		}
		
	}
	
	if(findch == false) {
		
		System.out.println("동일한 회원정보가 없습니다. ");
	}
}
	else if(num==4) {
	
	System.out.println("아이디 : ");  String id = scanner.next();
	System.out.println("전화번호 ");  String phone = scanner.next();
	boolean findch =false;
	for(Member temp : memberlist) {
		if(temp !=null && temp.id.equals(id) && temp.phone.equals(phone) ) {
			
			System.out.println("비밀번호 찾기 성공");
			System.out.println("회원 비밀번호: "+temp.pw);
			findch= true;
			break;
			
		}
		
	}
	if(findch == false) {
		
		 System.out.println("동일한 회원정보가 없습니다.");
	}
	
	
	}
	else {System.out.println("알수없는 번호입니다.");}
	
	}
	
	
	} //  m e

} // c e 
	