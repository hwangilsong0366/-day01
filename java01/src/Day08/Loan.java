package Day08;

import java.util.Scanner;
import Day08.Loan;
public class Loan {
	
	// 1. �ʵ�
	private double ����;  
	private int ����; 
	private int �����ݾ�; 
	private String �����ǰ��;	// ���� ��ǰ�̸�
	private String id ; // ������ id 
	private String ��ȯ����;
	boolean brental;
	//2. ������
	 public Loan() {}
	 
	public Loan(double ����, int ����, int �����ݾ�, String �����ȯ��, String �����ȯ��, String id,String ��ȯ����,boolean brental) {
		
		this.���� = ����;
		this.���� = ����;
		this.�����ݾ� = �����ݾ�;	
		this.�����ǰ�� = �����ǰ��;
		this.id = id;
		this.��ȯ���� = ��ȯ����;
		
		}
	
	// 3. �޼ҵ� 
								void ������(String loginid) {
							System.out.println("------ ���� ��� ������ ------");
								System.out.println("��ǰ �̸�\t��ǰ �ѵ�\t��û ���� ����\n");
								System.out.println(loname+"\t"+locontent+"\t"+lolimits+"\t"+loan);
								int j = 0; for(Loanclass temp : Mobilebank.loanclass) {
									if(temp == null) { //����� ã��
										Mobilebank.loanclass[j] = loanclass; return true;} j++;
								} return false; }
			
								
								
					void �����û(String id) {
						System.out.println("------ ���� ��û ������ ------");
						System.out.println("��û�� ���� ��ǰ : "); String �����ǰ�� = BankApplication.scanner.next();
						for(Loan temp : BankApplication.loan) {
							if(temp != null && temp.�����ǰ��.equals(�����ǰ��) && temp.loan) {
								System.out.println("�˸�) �ش� ������ ��û�մϴ�."); temp.loan = false; return;
							} else {System.out.println("�˸�) ���� ���� ��û�� �Ұ����� �����Դϴ�."); return;}
							System.out.println("�˸�) ������ ��ǰ�� �������� �ʽ��ϴ�.");}	}
					
	
				void ������(String loginid) { System.out.println("------ ���� ��� ������ ------");
				
				System.out.print(" ����� ���� ��ǰ �̸� : "); String loname = BankApplication.scanner.next();
				System.out.print(" ����� ���� ��ǰ ���� : "); String locontent = BankApplication.scanner.next();
				System.out.print(" ����� ���� ��ǰ �ѵ� : "); String lolimits = BankApplication.scanner.next();
				System.out.print(" ����� ���� ��ǰ �Ⱓ : "); String years = BankApplication.scanner.next();
			
			
				//�迭 ����
				int i = 0;
				for(Loan temp : BankApplication.loan) {
					if (temp == null) {	BankApplication.loanclass[i] = loan;
						System.out.println("�˸�) ���� ����� �Ϸ�Ǿ����ϴ�.");
						return;} i++;}
				}
				

	
	
}

