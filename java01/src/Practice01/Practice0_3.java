package Practice01;

import java.util.Scanner;

public class Practice0_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int �ݶ󱸸ż�=0; int ȯŸ���ż�=0;		int �������ż�=0;	 
		int �ݶ����=10;  int ȯŸ���=10;   int �������=10;  
		
		
		while(true) {  // 1		
			System.out.println("-------------�޴���--------------");
			System.out.println("1. �ݶ�100 2.ȯŸ200 3.����300 4.����");
			System.out.println(">>>>>>>>>��ȣ �Է�:"  ); 	 		int ��ȣ= scanner.nextInt();
			if(��ȣ==1) { //2
				if(�ݶ����==0) {
					System.out.println("�ݶ� ��� �����ϴ�");										
				}
				else {
					System.out.println("�ݶ� 1���� ��ҽ��ϴ�");
					�ݶ����--;
					�ݶ󱸸ż�++;		
				}
			}
				else if(��ȣ==2) {
					if(ȯŸ���==0) {
						
						System.out.println("ȯŸ ��� �����ϴ�");
						
					}
					else {
						System.out.println("ȯŸ 1���� ��ҽ��ϴ�");
						ȯŸ���--;
						ȯŸ���ż�++;		
						
					}
						
					
				}
				else if(��ȣ==3) {
					if(�������==0) {
						
						System.out.println("���� ��� �����ϴ�");
						
					}
					else {
						System.out.println("���� 1���� ��ҽ��ϴ�");
						�������--;
						�������ż�++;		
						
					}
						
					
				}
			
				else if(��ȣ==4) {
					System.out.println(" ------------- ���� ��ǰ��� -------------");
					System.out.println("��ǰ��\t����\t�ݾ�");
					if(�ݶ󱸸ż� !=0) {
						System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*100));
					}
					if(ȯŸ���ż� !=0) {
						System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+(ȯŸ���ż�*200));
					}
					if(�������ż� !=0) {
						System.out.println("����\t"+�������ż�+"\t"+(�������ż�*300));
					}
				int �Ѱ����ݾ� = (�ݶ󱸸ż�*100)+(ȯŸ���ż�*200)+(�������ż�*300);
				System.out.println(" --------------------------");
				System.out.println("�� ������:"+�Ѱ����ݾ�);
				System.out.println(" --------------------------");
				System.out.println("1.���� 2.���"); int ��ȣ2=scanner.nextInt();
				
				if (��ȣ2==1) {
			
					while(true) {
						System.err.println(" �˸�)) �ݾ� : "); int �ݾ� = scanner.nextInt();
					
							
						if(�ݾ� < �Ѱ����ݾ�) {
							System.err.println(" �˸�)) �ݾ��� �����մϴ�. �ٽ� �ݾ� ���� ");
							
						}else {
							
							System.err.println(" �ܵ� :"+(�ݾ�-�Ѱ����ݾ�));
							�ݶ󱸸ż� =0; ȯŸ���ż�=0; �������ż�=0;				// ���ż� �ʱ�ȭ 
							break; // while Ż��
						}
						
						
					}
				
				
				       }
				
				
				
			
	
		} //1 
		

		}
		
   }

	
} 