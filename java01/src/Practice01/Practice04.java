package Practice01;

import java.util.Scanner;

public class Practice04 {
	// ���뺯�� 
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int �ݶ����=10;  int ȯŸ���=10; int �������=10; 
		int �ݶ� = 0; 	int ȯŸ = 0; 	int ���� = 0;
		

	

		while(true) {
			
			System.out.println("-------===-�޴���---====-------");
			System.out.println("1.�ݶ�100 2.ȯŸ200 3.����300 4.����");
			System.out.println(">>>>>>>��ȣ�� �Է�");  int ��ȣ = scanner.nextInt();
			if(��ȣ==1) {
				if(�ݶ����==0) {					
					System.out.println("�ݶ� ��� x ");			
				}
							
			else {
				System.out.println("�ݶ� 1���� ��ҽ��ϴ�");		
				�ݶ�++;
				�ݶ����--;
			}
			  	
			}
			else if(��ȣ==2) {
				if(ȯŸ���==0) {
					System.out.println("ȯŸ ��� x ");										
				}
				else {
					System.out.println("ȯŸ 1���� ��ҽ��ϴ�");			
					ȯŸ++;
					ȯŸ���--;
					
				}
				
			}
			else if(��ȣ==3) {
				if(�������==0) {
					System.out.println("���� ��� x ");										
				}
				else {
					System.out.println("���� 1���� ��ҽ��ϴ�");			
					����++;
					�������--;
					
				}
				
				
			}
			else if(��ȣ==4) {
				System.out.println("-------���� ��ǰ ���---------");
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
				System.out.println(" ��ǰ �� ������ : " + �Ѱ��� );
				
				System.out.println("----------------------------------------");
				System.out.println(" 1.���� 2.���"); int ��ȣ2 = scanner.nextInt();	
				
				if(��ȣ2==1) {
					while(true) { // ���ѷ��� [ �������� : �ݾ��� �Ѱ����׺��� ũ�� ]  
						System.err.println(" �˸�)) �ݾ� : "); int �ݾ� = scanner.nextInt();

						if( �ݾ� < �Ѱ��� ) { // �����Ұ� -> ���Է� 
							System.err.println(" �˸�)) �ݾ��� �����մϴ�. �ٽ� �ݾ� ���� ");
						}else { // �ݾ��� ��ũ�� 
							System.err.println(" �˸�)) ���ſϷ�  �ֹ���ȣ : OOOO��");
							System.err.println(" �˸�)) �ܵ� ��� : " + ( �ݾ� - �Ѱ��� )+"��" );
							�ݶ� =0; ȯŸ=0; ����=0;				// ���ż� �ʱ�ȭ 
							break; // while Ż��
						}
					}
					
				}
		
					
				
			
				
		
		
			
			} // ���� e 

		
		} // w e  
		
		
	} // m e
	

} // c e
