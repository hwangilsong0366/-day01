package Day07;

public class Book {
	
	String ISBN;
	String bname;
	String bwriter;
	boolean brental;
	String mid;
	
	// 1. �ʵ�
	
		// ISBN [������ȣ = �ĺ���]
		// ������
		// �۰�
		// �����뿩����
		// �뿩��ID
	
	//2. ������
		//1. �������[�⺻������] : �޼ҵ�ȣ���
	
	
	
	
	 public Book() {}

	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {
		
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	 



		//3.�޼ҵ�
			//1.�����˻�
        void �����˻�() {
        	System.out.println("---------�����뿩 ������-------------");
        }
        void �������() {
        	System.out.println("---------������� ������-------------");
        	System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
        	for(Book temp : Day07_5_BookApplication.books) {
        		if(temp.brental) {
        			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"�뿩����");
        			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"�뿩��");
        		}
        		
        	}
        }
        void �����뿩() {
        	System.out.println("---------�����뿩 ������-------------");
        	System.out.println(" ���� ISBN:"); String isbn = Day07_5_BookApplication.scanner.next();
        	for(Book temp : Day07_5_BookApplication.books) {
        		
        		if(temp != null && temp.ISBN.equals(isbn)){
        			if(temp.brental) {
        				System.out.println("�˸�]] �ش� �����뿩 �մϴ�.");
        				
        			}else {
        				System.out.println("�˸�]] �ش� ���� �뿩���Դϴ�. [�뿩�Ұ�]");
        				return;
        			}
        			
        		}
        		
        	}
        }
        void �����ݳ�() {
        	System.out.println("---------�����ݳ� ������-------------");
        	
        	void �����뿩���()
        	
        }
        void �������() {
        	System.out.println("---------������� ������-------------");
        	System.out.println(" ISBN : "); String isbn = Day07_5_BookApplication.scanner.next();
        	System.out.println(" ������ : ");	String bname = Day07_5_BookApplication.scanner.next();
        	System.out.println(" �۰� : ");	String bwriter = Day07_5_BookApplication.scanner.next();
        	Book book = new Book(isbn,bname,bwriter,true,null);        
        	}
      
        void ��������() {
        	System.out.println("---------�������� ������-------------");
        }	
}
