package Practice01;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		int �ݶ� = 0; 	int ȯŸ = 0; 	int ����= 0;
		int �ݶ���� = 10;   	int ȯŸ��� = 10;   	int ������� = 10;  
		Scanner scanner = new Scanner(System.in);
		
		 while(true) {
			 System.out.println("-----------------------------");
			 System.out.println("1.�ݶ� 2.ȯŸ 3.���� 4.����");
			 System.out.println(">>>>>��ȣ "); int ��ȣ = scanner.nextInt();
			 
			 if(��ȣ==1) {
				 if(�ݶ����==0) {
					 System.out.println("��� �����ϴ�. ");
					 
				 }
				 else {
					 System.out.println("�ݶ� 1�� ��ҽ��ϴ�.");
					 �ݶ�++;
					 �ݶ����--;					 
				 }
				 
			 }
			 if(��ȣ==2) {
				 if(ȯŸ���==0) {
					 System.out.println("��� �����ϴ�. ");					 
				 }
				 else {
					 System.out.println("ȯŸ�� 1�� ��ҽ��ϴ�.");
					 ȯŸ++;
					 ȯŸ���--;					 
				 }				 
			 }
			 if(��ȣ==3) {
				 if(�������==0) {
					 System.out.println("��� �����ϴ�. ");					 
				 }
				 else {
					 System.out.println("������ 1�� ��ҽ��ϴ�.");
					 ����++;
					 �������--;					 
				 }
			 }
			 if(��ȣ==4) {
				 System.out.println("������ �����մϴ�");
				 System.out.println("��ǰ��\t����\t�ݾ�");
				 if(�ݶ�!=0) {
					 System.out.println("�ݶ�\t"+�ݶ�+"\t"+(�ݶ�*100));
					 
				 }
				 if(ȯŸ!=0) {
					 System.out.println("ȯŸ\t"+ȯŸ+"\t"+(ȯŸ*200));
					 
				 }
				 if(����!=0) {
					 System.out.println("����\t"+����+"\t"+(����*300));					 
				 }
				 int �Ѱ��� = (�ݶ�*100)+(ȯŸ*200)+(����*300); 
				 System.out.println("�� �����ݾ�:"+�Ѱ���);	
				 System.out.println("1.���� 2.��� "); int ��ȣ2 = scanner.nextInt();
				 System.out.println("--------------------------------");	
				 if(��ȣ2==1) {
					while(true) {						
						 System.out.println(" ���� �ݾ�:");  int �ݾ� = scanner.nextInt();
							if(�ݾ� <�Ѱ���) {
								 System.out.println("�ܾ��� �����մϴ�");	
								
							}
							else {
								 System.out.println("�����Ϸ� ");	
								 System.out.println("�Ž����� :" +(�ݾ�-�Ѱ���)+"��");	
								 �ݶ�  = 0;  ȯŸ  = 0;  ����  = 0;
								 break;
								 
							}
							
						}
						
					
				 }
				 else if(��ȣ2==2) {
					 System.out.println("���Ÿ�� �����");
					 �ݶ���� += �ݶ�;      ȯŸ��� += ȯŸ;    ������� += ����;  
					 �ݶ�  = 0;  ȯŸ  = 0;  ����  = 0;
					 
				 }
				 else {
					 System.out.println("����");
				 }
				
				
			 } // ���� e
			
		 } // w e
			 
		
		
		
	} //  m me 
	

} // c e
