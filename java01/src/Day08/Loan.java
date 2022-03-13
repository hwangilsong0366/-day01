
package Day08_모바일뱅크;

import java.util.Scanner;


public class Loan {
	
	// 1. 필드
	private double 이자; 
	private int 원금; 
	private int 빌린금액; 
	private String 대출상품명;	
	private String id ;
	private String 상환여부;
	private String how;
	
	//2. 생성자
	 public Loan() {}
	 
	public Loan(double 이자, int 원금, int 빌린금액, String 대출상환일, String 대출상환액, String id,String 상환여부) {
		
		this.이자 = 이자;
		this.원금 = 원금;
		this.빌린금액 = 빌린금액;	
		this.대출상품명 = 대출상품명;
		this.id = id;
		this.상환여부 = 상환여부;
		
		}

	
	///////////////////////////
	public void 대출목록() {
		System.out.println(" ------- 대출 페이지 -------");
		System.out.println("대출상품명\t\t금액\t이자\t누가신청했는가");
		for( Loan temp1 : BankApplication.ls) {
			if( temp1 != null ) { 
				System.out.println( temp1.대출상품명 +"\t  "+ temp1.how +"\t" + temp1.이자 +"\t" + temp1.id);
			}
		}
	}
	
	void 대출등록() {
		System.out.println(" ------- 대출등록 페이지 -------");
		System.out.print(" 대출상품명 : ");	String 대출상품명 =BankApplication.sc.next();
		System.out.print(" 금액 : ");	int how =BankApplication.sc.nextInt();
		System.out.print(" 이자(%) : ");	double 이자 =BankApplication.sc.nextDouble();

		

		Loan loan = new Loan(대출상품명, how, 이자, null);

		int i = 0;
		for( Loan temp4 : BankApplication.ls) {
			if(temp4 == null ) {
				BankApplication.ls[i]=loan;
				System.out.println(" 알림]] 대출등록이 되었습니다. ");
				return; 
			}
			i++; 
		}
	}
	void 대출신청() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- 대출신청 페이지 -------");
		System.out.println("어떤거 대출할거임...,,,@@");
		System.out.print(" 대출상품명 : ");	String 대출상품명 =BankApplication.sc.next();
		for( Loan temp4  : BankApplication.ls) {
			if(temp4!=null && temp4.대출상품명.equals(대출상품명)) {
				temp4.id = Member.yourName;
				System.out.println("대출성공");
				account.balance += temp4.how;
				member.money(account.balance);
				member.getMonney();

				break;
			}
		}
	}
	void 대출상환() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

			System.out.println(" ------- 대출상환 페이지 -------");
			System.out.print(" 대출상품명 : ");	String 대출상품명 =BankApplication.sc.next();
		for( Loan temp4  : BankApplication.ls) {
			if(temp4!=null && temp4.대출상품명.equals(대출상품명)) {
				if(account.balance>=(temp4.how+temp4.how*temp4.이자)) {
					temp4.id = Member.yourName;
					System.out.println("대출성공");
					account.balance -= (temp4.how+temp4.how*temp4.이자);
					member.money(account.balance);
					member.getMonney();
				}
				else {
					System.out.println("잔액이 부족합니다");
				}

				break;
			}
		}
	}
}
	

	
		
	
	
	
	
	