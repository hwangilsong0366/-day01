package Day08;

import java.util.Scanner;

import Day07.Book;
import Day07.Day07_5_BookApplication;

public class Loan {
	
	// 1. �ʵ�
	private double ����; 
	private int ����; 
	private int �����ݾ�; 
	private String �����ǰ��;	
	private String id ;
	private String ��ȯ����;
	//2. ������
	 public Loan() {}
	 
	public Loan(double ����, int ����, int �����ݾ�, String �����ȯ��, String �����ȯ��, String id,String ��ȯ����) {
		
		this.���� = ����;
		this.���� = ����;
		this.�����ݾ� = �����ݾ�;	
		this.�����ǰ�� = �����ǰ��;
		this.id = id;
		this.��ȯ���� = ��ȯ����;
		
		
		
	}

	
	

	
		
	
	// 3. �޼ҵ� 

	  
	
	
	void  ������() { System.out.println(" id(������): ");
	
	System.out.println("---------�����뿩 ������-------------");
	System.out.println(" ���� ISBN:"); String id = Day07_5_BookApplication.scanner.next();
	for(Book temp : Day07_5_BookApplication.books) {
		
		if(temp != null && temp.������.equals()){
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
	void �����ǰ��() {}
	
	
		
		
	}
	
	

