
package Day08_����Ϲ�ũ;

import java.util.Scanner;


public class Loan {
	
	// 1. �ʵ�
	private double ����; 
	private int ����; 
	private int �����ݾ�; 
	private String �����ǰ��;	
	private String id ;
	private String ��ȯ����;
	private String how;
	
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

	
	///////////////////////////
	public void ������() {
		System.out.println(" ------- ���� ������ -------");
		System.out.println("�����ǰ��\t\t�ݾ�\t����\t������û�ߴ°�");
		for( Loan temp1 : BankApplication.ls) {
			if( temp1 != null ) { 
				System.out.println( temp1.�����ǰ�� +"\t  "+ temp1.how +"\t" + temp1.���� +"\t" + temp1.id);
			}
		}
	}
	
	void ������() {
		System.out.println(" ------- ������ ������ -------");
		System.out.print(" �����ǰ�� : ");	String �����ǰ�� =BankApplication.sc.next();
		System.out.print(" �ݾ� : ");	int how =BankApplication.sc.nextInt();
		System.out.print(" ����(%) : ");	double ���� =BankApplication.sc.nextDouble();

		

		Loan loan = new Loan(�����ǰ��, how, ����, null);

		int i = 0;
		for( Loan temp4 : BankApplication.ls) {
			if(temp4 == null ) {
				BankApplication.ls[i]=loan;
				System.out.println(" �˸�]] �������� �Ǿ����ϴ�. ");
				return; 
			}
			i++; 
		}
	}
	void �����û() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- �����û ������ -------");
		System.out.println("��� �����Ұ���...,,,@@");
		System.out.print(" �����ǰ�� : ");	String �����ǰ�� =BankApplication.sc.next();
		for( Loan temp4  : BankApplication.ls) {
			if(temp4!=null && temp4.�����ǰ��.equals(�����ǰ��)) {
				temp4.id = Member.yourName;
				System.out.println("���⼺��");
				account.balance += temp4.how;
				member.money(account.balance);
				member.getMonney();

				break;
			}
		}
	}
	void �����ȯ() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

			System.out.println(" ------- �����ȯ ������ -------");
			System.out.print(" �����ǰ�� : ");	String �����ǰ�� =BankApplication.sc.next();
		for( Loan temp4  : BankApplication.ls) {
			if(temp4!=null && temp4.�����ǰ��.equals(�����ǰ��)) {
				if(account.balance>=(temp4.how+temp4.how*temp4.����)) {
					temp4.id = Member.yourName;
					System.out.println("���⼺��");
					account.balance -= (temp4.how+temp4.how*temp4.����);
					member.money(account.balance);
					member.getMonney();
				}
				else {
					System.out.println("�ܾ��� �����մϴ�");
				}

				break;
			}
		}
	}
}
	

	
		
	
	
	
	
	