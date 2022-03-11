package Day08;

import java.util.Scanner;

import Day07.Book;
import Day07.Day07_5_BookApplication;

public class Loan {
	
	// 1. 필드
	private double 이자; 
	private int 원금; 
	private int 빌린금액; 
	private String 대출상품명;	
	private String id ;
	private String 상환여부;
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

	
	

	
		
	
	// 3. 메소드 

	  
	
	
	void  대출인() { System.out.println(" id(대출인): ");
	
	System.out.println("---------도서대여 페이지-------------");
	System.out.println(" 도서 ISBN:"); String id = Day07_5_BookApplication.scanner.next();
	for(Book temp : Day07_5_BookApplication.books) {
		
		if(temp != null && temp.대출인.equals()){
			if(temp.brental) {
				System.out.println("");
				
			}else {
				System.out.println("");
				return;
			}
			
		}
		
	}
}
	
		
	}
	void 대출상품명() {}
	
	
		
		
	}
	
	

