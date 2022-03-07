package Day05;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		String[][] memberlist = new String[100][3];
		// 방문록 100개[title, contents, writer] 저장하는 배열
		String[][] boardlist = new String[100][3];
		while(true) {
			System.out.println("----------회원제 방문록----------");
			System.out.println("--------------------------");
			System.out.println("1. 회원 가입 2. 로그인 선택"); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("-----------회원가입-----------");
				System.out.println("id 입력"); String id = scanner.next();
				System.out.println("pw 입력"); String pw = scanner.next();
				System.out.println("이름 입력"); String 이름 = scanner.next();
				// 1.빈공간 숫자=0, 객체(문자열) = null 을 찾아서 저장
				
				//아이디 중복체크
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null &&memberlist[i][0].equals(id)) {
						
						System.out.println("동일한 아이디가 존재합니다.");
						idcheck=false; // 저장x
						break;
					}
						//
					
				}
				
				//저장부분
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] == null) {
						memberlist[i][0]=id;
						memberlist[i][0]=pw;
						memberlist[i][0]=이름;
						System.out.println("알림 회원가입이 되었습니다");
						break;
					}					
				}	
					
			}
			else if(ch==2) {				
				System.out.println("------------로그인-----------");
				System.out.println("id 입력"); String id = scanner.next();
				System.out.println("pw 입력"); String pw = scanner.next();
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("로그인 성공");			
						System.out.println("----------------------");	
						System.out.println("------------방문록-------------");	
						System.out.println("1.방문록남기기 2.로그아웃 선택:"); int ch2= scanner.nextInt();
						
						if(ch2==1) {
							System.out.println("------글쓰기-------");
							System.out.println("title:");  int title= scanner.nextInt();				
							System.out.println(" content:");  int content= scanner.nextInt();
							// 배열내 공백찾아서 저장
							for(int j=0; i<boardlist.length; j++) {
								if(boardlist[j][0]==null) {
									boardlist[j][0]==title;
											boardlist[j][1]==content;
													boardlist[j][2]==id;
													
										}		
										
									}
								}
								else if(ch2==3) {
									System.out.println("로그아웃을 진행합니다");
									break;
								}
								else {
									System.out.println("알수없는 번호입니다. !!");	
								}
							} // if e					
				}// for e
			} // ch 2
			else {
				System.out.println("--------------------------");				
			}
		}// 종료조건 없음
	} // m e

} // c e 
