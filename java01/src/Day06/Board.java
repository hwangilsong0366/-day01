package Day06;

import javax.print.DocFlavor.STRING;

public class Board {
	
	// board Ŭ���� 
	
	//1 .�ʵ� 
	String title ;
	String content ;
	String writer ;
	String password ;
	
	 //2. ������ [Ŭ���� �̸��� �����ϸ� �����ڸ� ]
	Board(){}
	
	Board(String title){
		this.title = title;
		// �ܺηκ��� ���� ������ ���κ����� ����
	}
	Board(String title, String content){
		this.title = title;
		this.content = content;
		// �ܺηκ��� ���� ������ ���κ����� ����
	}
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
		// �ܺηκ��� ���� ������ ���κ����� ����
	}
	Board(String title, String content, String writer,String password ){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		// �ܺηκ��� ���� ������ ���κ����� ����
	}
	
	//3. �޼ҵ�

}
