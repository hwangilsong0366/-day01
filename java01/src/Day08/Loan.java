package Day08;






 public class Loan {
	
	// 1. 필드
	private double 이자; 
	private int 원금; 
	private int 빌린금액; 
	private String 대출상품명;	
	private String id ;
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
	
	void 대출상품등록(){
		System.out.println("대출상품 등록페이지");
		System.out.println("대출상품명: "); String 대출상품명 = BankApplication.scanner.next();
		System.out.println("대출이자설정: "); double 이자 = BankApplication.scanner.nextDouble();
		
	}

	void 대출신청() {			 
	        	System.out.println("---------대출신청 페이지-------------");
	        	System.out.println("대출신청"); String isbn = BankApplication.scanner.next();
	        	for(Loan temp : BankApplication.Loan) {
	        		
	        		if(temp != null && temp.대출상품명.equals(대출상품명)){
	        			if(temp.brental) {
	        				System.out.println("대출이 가능합니다.");
	        				
	        			}else {
	        				System.out.println("알림]] 대출이 불가능합니다.");
	        				return;
	        			}
	        			
	        		}
	        		
	        	}
	        }
	        void 도서반납() {
	
	}
	void 상환여부() {System.out.println("대출상환여부확인 ");}
	
	
}

