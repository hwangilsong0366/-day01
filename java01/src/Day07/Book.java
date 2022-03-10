package Day07;

public class Book {
	
	String ISBN;
	String bname;
	String bwriter;
	boolean brental;
	String mid;
	
	// 1. 필드
	
		// ISBN [도서번호 = 식별용]
		// 도서명
		// 작가
		// 도서대여여부
		// 대여인ID
	
	//2. 생성자
		//1. 빈생성자[기본생성자] : 메소드호출용
	
	
	
	
	 public Book() {}

	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {
		
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	 



		//3.메소드
			//1.도서검색
        void 도서검색() {
        	System.out.println("---------도서대여 페이지-------------");
        }
        void 도서목록() {
        	System.out.println("---------도서목록 페이지-------------");
        	System.out.println("ISBN\t도서명\t작가\t대여가능여부");
        	for(Book temp : Day07_5_BookApplication.books) {
        		if(temp.brental) {
        			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"대여가능");
        			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"대여중");
        		}
        		
        	}
        }
        void 도서대여() {
        	System.out.println("---------도서대여 페이지-------------");
        	System.out.println(" 도서 ISBN:"); String isbn = Day07_5_BookApplication.scanner.next();
        	for(Book temp : Day07_5_BookApplication.books) {
        		
        		if(temp != null && temp.ISBN.equals(isbn)){
        			if(temp.brental) {
        				System.out.println("알림]] 해당 도서대여 합니다.");
        				
        			}else {
        				System.out.println("알림]] 해당 도서 대여중입니다. [대여불가]");
        				return;
        			}
        			
        		}
        		
        	}
        }
        void 도서반납() {
        	System.out.println("---------도서반납 페이지-------------");
        	
        	void 도서대여목록()
        	
        }
        void 도서등록() {
        	System.out.println("---------도서등록 페이지-------------");
        	System.out.println(" ISBN : "); String isbn = Day07_5_BookApplication.scanner.next();
        	System.out.println(" 도서명 : ");	String bname = Day07_5_BookApplication.scanner.next();
        	System.out.println(" 작가 : ");	String bwriter = Day07_5_BookApplication.scanner.next();
        	Book book = new Book(isbn,bname,bwriter,true,null);        
        	}
      
        void 도서삭제() {
        	System.out.println("---------도서삭제 페이지-------------");
        }	
}
