package Day08;

import java.util.Scanner;
import Day08.Loan;
public class Loan {
	
	// 1. 필드
	private double 이자;  
	private int 원금; 
	private int 빌린금액; 
	private String 대출상품명;	// 대출 상품이름
	private String id ; // 대출인 id 
	private String 상환여부;
	boolean brental;
	//2. 생성자
	 public Loan() {}
	 
	public Loan(double 이자, int 원금, int 빌린금액, String 대출상환일, String 대출상환액, String id,String 상환여부,boolean brental) {
		
		this.이자 = 이자;
		this.원금 = 원금;
		this.빌린금액 = 빌린금액;	
		this.대출상품명 = 대출상품명;
		this.id = id;
		this.상환여부 = 상환여부;
		
		}
	
	// 3. 메소드 
								void 대출목록(String loginid) {
							System.out.println("------ 대출 목록 페이지 ------");
								System.out.println("상품 이름\t상품 한도\t신청 가능 여부\n");
								System.out.println(loname+"\t"+locontent+"\t"+lolimits+"\t"+loan);
								int j = 0; for(Loanclass temp : Mobilebank.loanclass) {
									if(temp == null) { //빈공간 찾기
										Mobilebank.loanclass[j] = loanclass; return true;} j++;
								} return false; }
			
								
								
					void 대출신청(String id) {
						System.out.println("------ 대출 신청 페이지 ------");
						System.out.println("신청할 대출 상품 : "); String 대출상품명 = BankApplication.scanner.next();
						for(Loan temp : BankApplication.loan) {
							if(temp != null && temp.대출상품명.equals(대출상품명) && temp.loan) {
								System.out.println("알림) 해당 대출을 신청합니다."); temp.loan = false; return;
							} else {System.out.println("알림) 현재 대출 신청이 불가능한 상태입니다."); return;}
							System.out.println("알림) 동일한 상품이 존재하지 않습니다.");}	}
					
	
				void 대출등록(String loginid) { System.out.println("------ 대출 등록 페이지 ------");
				
				System.out.print(" 등록할 대출 상품 이름 : "); String loname = BankApplication.scanner.next();
				System.out.print(" 등록할 대출 상품 설명 : "); String locontent = BankApplication.scanner.next();
				System.out.print(" 등록할 대출 상품 한도 : "); String lolimits = BankApplication.scanner.next();
				System.out.print(" 등록할 대출 상품 기간 : "); String years = BankApplication.scanner.next();
			
			
				//배열 대입
				int i = 0;
				for(Loan temp : BankApplication.loan) {
					if (temp == null) {	BankApplication.loanclass[i] = loan;
						System.out.println("알림) 대출 등록이 완료되었습니다.");
						return;} i++;}
				}
				

	
	
}

