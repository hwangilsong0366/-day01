package Practice01;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int �ݶ�=0;	int ���̴�=0;	int �䷹Ÿ=0;
		int �ݶ����=10;  int ���̴����=10; int �䷹Ÿ���=10; 
		
		while(true) {
			System.out.println("-------------�޴�-------------");
			System.out.println("1.�ݶ� 2.���̴� 3.�䷹Ÿ 4.����");
			System.out.println(">>>>>>>��ȣ"); int ��ȣ=scanner.nextInt();
			
			if(��ȣ==1) {
				if(�ݶ����==0) {
					System.out.println("�ݶ� ��� �����ϴ�.");					
				}
				else {
					System.out.println("�ݶ� 1���� ��ҽ��ϴ�.");
					�ݶ�++;
					�ݶ����--;					
				}					
			}
			if(��ȣ==2) {
				if(���̴����==0) {
					System.out.println("���̴� ��� �����ϴ�.");					
				}
				else {
					System.out.println("���̴� 1���� ��ҽ��ϴ�.");
					���̴�++;
					���̴����--;					
				}					
			}
			if(��ȣ==3) {
				if(�䷹Ÿ���==0) {
					System.out.println("�䷹Ÿ ��� �����ϴ�.");					
				}
				else {
					System.out.println("�䷹Ÿ 1���� ��ҽ��ϴ�.");
					�䷹Ÿ++;
					�䷹Ÿ���--;					
				}					
			}
			if(��ȣ==4) {
				System.out.println("----------����-----------.");
				System.out.println("��ǰ\t����\t�ݾ�");
				if(�ݶ�!=0) System.out.println("�ݶ�\t"+�ݶ�+"\t"+(�ݶ�*100));
				if(���̴�!=0) System.out.println("���̴�\t"+���̴�+"\t"+(���̴�*200));
				if(�䷹Ÿ!=0) System.out.println("�䷹Ÿ\t"+�䷹Ÿ+"\t"+(�䷹Ÿ*300));
				int �Ѱ��� =(�ݶ�*100)+(���̴�*200)+(�䷹Ÿ*300);
				System.out.println("�����ݾ�:" +�Ѱ���); 
				System.out.println("1.���� 2.���"); int ��ȣ2=scanner.nextInt();
				
				if(��ȣ2==1) {
					while(true) {
						System.out.println("�����ݾ��� �Է��Ͻÿ�:" );  int ����=scanner.nextInt();
						if(����< �Ѱ���) {
							System.out.println("�ܾ��� �����մϴ�" );
							
						}
						else {
							System.out.println("���� ����" );
							System.out.println("�ܵ�: "+(����-�Ѱ���)+"��" );
							�ݶ�=0; ���̴�=0; �䷹Ÿ=0;
							break;
							
						}
						
					}
				
				}
				else if(��ȣ2==2) {          // ***** if ���*****
					System.out.println("������ ����մϴ�." );
					�ݶ����+=�ݶ�; ���̴����+=���̴�; �䷹Ÿ���+=�䷹Ÿ;
					�ݶ�=0; ���̴�=0; �䷹Ÿ=0;
					
				}else {
					
					System.out.println("�˼������ϴ�" );
				}
				
				
			} // ���� e
			else {
				
				System.out.println("�˼������ϴ�" );
			}
		} //  w e
	}

}
