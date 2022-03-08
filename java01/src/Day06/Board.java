package Day06;

import javax.print.DocFlavor.STRING;

public class Board {
	
	// board 클래스 
	
	//1 .필드 
	String title ;
	String content ;
	String writer ;
	String password ;
	
	 //2. 생성자 [클래스 이름과 동일하면 생성자명 ]
	Board(){}
	
	Board(String title){
		this.title = title;
		// 외부로부터 들어온 제목을 내부변수에 저장
	}
	Board(String title, String content){
		this.title = title;
		this.content = content;
		// 외부로부터 들어온 제목을 내부변수에 저장
	}
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
		// 외부로부터 들어온 제목을 내부변수에 저장
	}
	Board(String title, String content, String writer,String password ){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		// 외부로부터 들어온 제목을 내부변수에 저장
	}
	
	//3. 메소드

}
