package Day08;

import Day07.Book;
import Day07.Day07_5_BookApplication;

public class Loan {
	//필드
	String 대출이름;
	double 이자;
	String id;
	
	
	//생성자
	public Loan() {}
		public Loan(String 대출이름, double 이자, String id) {
		
		this.대출이름 = 대출이름;
		
		this.이자 = 이자;
		this.id = id;
	}
	
	public void 대출목록() {
		System.out.println(" ------- 대출 페이지 -------");
		System.out.println("대출이름\t\t금액\t이자\t누가신청했는가");
		for( Loan temp1 : Day08_5.BankApplication) {
			if( temp1 != null ) { 
				System.out.println( temp1.대출이름 +"\t" + temp1.이자 +"\t" + temp1.id);
			}
		}
	}
	
	void 대출등록() {
		System.out.println(" ------- 대출등록 페이지 -------");
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		System.out.print(" 금액 : ");	int how =Day08_5.sc.nextInt();
		System.out.print(" 이자(%) : ");	double 이자 =Day08_5.sc.nextDouble();

		

		Loan loan = new Loan(대출이름,  이자, null);

		int i = 0;
		for( Loan temp4 : Day08_5.ls) {
			if(temp4 == null ) {
				Day08_5.ls[i]=loan;
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
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.대출이름.equals(대출이름)) {
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
		System.out.println("어떤거 대출상환할거임.!?..,,,@@");
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.대출이름.equals(대출이름)) {
				if(account.balance>=(temp4.how+temp4.how*temp4.이자)) {
					temp4.id = Member.yourName;
					System.out.println("대출성공");
					
					member.money(account.balance);
					member.getMonney();
				}
				else {
					System.out.println("))현금이 없습니다");
				}

				break;
			}
		}
	}
}