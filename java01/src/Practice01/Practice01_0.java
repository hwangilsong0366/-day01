package Practice01;

import java.util.Scanner;

public class Practice01_0 {
	
	//// Ű����ũ ����
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int �ݶ����=10;  	int ȯŸ���=10; 	int ���̴����=10; // �迭 Ȱ���غ���
		
		int �ݶ󱸸ż�=10; int ȯŸ���ż�=10; int ���̴ٱ��ż�=10;
		
		while(true) {  // w s
			System.out.println("-------------�޴�-----------");
			System.out.println("1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.����");
			System.out.println(">>>>>> ����: "); int ���� = scanner.nextInt();
			
			
			if(����==1) {  // if 1 s
				if(�ݶ����==0){
					System.out.println("�˸�)) ��� �����ϴ�. ��� �غ���");
					
					
				}else {
					System.out.println("�ݶ� ��ҽ��ϴ�");
					�ݶ󱸸ż�++;
					�ݶ����--;
					
					
				}
					
				
			} // if 1 e
			else if(����==2) {  
				if(ȯŸ��� == 0) {
					System.out.println("�˸�)) ��� �����ϴ�. ��� �غ���");  
					
					
				}else {
					System.out.println("ȯŸ�� ��ҽ��ϴ�");
					ȯŸ���ż�++;
					ȯŸ���--;
					
					
				}
				
				
			}else if(����==3) {
				if(���̴����==0) {
					System.out.println("�˸�)) ��� �����ϴ�. ��� �غ���");  
				}else {
					System.out.println("���̴ٸ� ��ҽ��ϴ�");
					���̴ٱ��ż�++;
					���̴����--;
					
				}
				
			}else if(����==4) {
				
				System.out.println("---------------����ǰ��------------------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if(�ݶ󱸸ż� !=0) System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*300));
				if(ȯŸ���ż� !=0) System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+(ȯŸ���ż�*200));
				if(���̴ٱ��ż� !=0) System.out.println("���̴�\t"+���̴ٱ��ż�+"\t"+(���̴ٱ��ż�*100));
				int �Ѱ����� = (�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100);
				System.out.println("�� ������:"+�Ѱ�����);
				System.out.println("-----------------------------");
				System.out.println("1.����  2.���");       int ����2 = scanner.nextInt();
						
						if(����2==1) {
							while(true) {
								
								System.out.println("�˸�)) �ݾ�: ");   int �ݾ� =scanner.nextInt();
								
								
								if (�ݾ� < �Ѱ�����) {
									
									System.out.println("�˸�: �ݾ��� �����մϴ�");
								}else {
									
									System.out.println("���ſϷ� �ֹ���ȣ:0000��");
									System.out.println("�ܵ� ���: "+ (�ݾ�-�Ѱ�����));
									�ݶ󱸸ż�=0; ȯŸ���ż�=0; ���̴ٱ��ż�=0;
									break;  // while Ż��
									
									
								}
								
								
								
								
							} // w2 e 
							
						}  // ����2 e 
						
						else if  (����2==2) {
							System.out.println("�˸�)) ���Ÿ�� ��� �����");
							�ݶ���� +=�ݶ󱸸ż�; ȯŸ��� +=ȯŸ���ż�; ���̴���� +=���̴ٱ��ż�;
							�ݶ󱸸ż�=0; ȯŸ���ż�=0; ���̴ٱ��ż�=0;
							
							
							
						}else {
							 System.out.println("�˸�)) �˼����� �ൿ�Դϴ�.");
						}
							
				} else {
							
					 System.out.println("�˸�)) �˼����� �ൿ�Դϴ�.");
							
						
						
						}
			
				
				
			} // ���� 4 e
			
			
			
			
		} //me
		
		
		
		
    
		
		
	} // ce
	

 
