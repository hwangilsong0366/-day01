package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	

	System.out.println("�ݾ� : ");


	int �ݾ� = scanner.nextInt();
	
	System.out.println(" �Է��� �ݾ�:"+ �ݾ�);
	
	System.out.println("�ʸ���:"+ (�ݾ�/100000)+ "��");

	�ݾ� -= (�ݾ�/100000)*100000;
	
	System.out.println("�ʸ��� ���� �ݾ� : "+ �ݾ�);
	System.out.println("���� : "+ (�ݾ�/10000)+"��");
	
	�ݾ� -= (�ݾ�/10000)*10000;
	
	System.out.println("���� ���� �ݾ� : "+ �ݾ�);
	System.out.println("õ�� : "+ (�ݾ�/1000)+"��");
	
	�ݾ� -= (�ݾ�/1000)*1000;
	
	System.out.println("��� : "+ (�ݾ�/100)+"��");
	
	
	
		//����3 
		
			// �� % ������ �������� 0���� �������� 
		
//		
//		System.out.println("����3)���� �Է�:");
//		int ��� = scanner.nextInt();
//		
//		System.out.println("�Է��� ������ 7�� ��� �Ǵ�:"+ (���%7==0));
//		
		
		
		
		//����4 
				// Ȧ¦ ã�� 
					//Ȧ��: �� %2������ �������� 1�̸� Ȧ�� 
					//¦��: �� %2������ �������� 0�̸� ¦�� 
//		System.out.println("����4) �����Է�:");
//		
//		int Ȧ¦=scanner.nextInt();
//		
//		
//		System.out.println("�Է��� ������ Ȧ�� :"+ (Ȧ¦%2==1));
//		
//		

//	
//		//����5
//		
//		System.out.println("������ �Է�:");
//		
//		int Ȧ¦= scanner.nextInt();
//		
//		System.out.println("�Է��� ������ 7�� ����̸鼭 ¦���̴�"+(Ȧ¦%7==0 && + Ȧ¦%2==0) );
//		
//		
		
		
//		
//		System.out.println("����1�� �Է��Ͻÿ�");
//		
//		
//		int ����1=scanner.nextInt();
//		
//		System.out.println("����2�� �Է��Ͻÿ�");
//		
//		int ����2=scanner.nextInt();
//		
//		int ū�� = ����1 >= ����2 ? ����1 : ����2;
//		
//		System.out.println("�� ū����:" + ū��);
		
		//����7
//		
//		System.out.println("�������� �Է��Ͻÿ�:");
//		
//		int ������ = scanner.nextInt();
//		
//		System.out.println("���� ���̴�: ");
//		
//		System.out.println((������*������*3.14));
//		
		
		
		
				//����8 
//	
//			System.out.println("�Ǽ�1�� �Է�:"); 
//			
//			double �Ǽ�1 = scanner.nextDouble();
//			
//			System.out.println("�Ǽ�2�� �Է�:"); 
//			
//			double �Ǽ�2 = scanner.nextDouble();
//	
//			double ���� = (�Ǽ�1/�Ǽ�2)*100;
//			
//			System.out.println("�Ǽ�1�� �Ǽ�2 �����" + ����+ "%"); 
//			System.out.printf("�Ǽ�1�� �Ǽ�2 ����� : %.2f %%",����); 
//			
//				// %f : �Ǽ� ǥ�� 
					// %.����f 
					// %.2f : �Ҽ��� 2��° 
					// %.5f : �Ҽ��� 5��°
			
			
		
		
//		����9
//		System.out.println("������ ����:");
//		
//		int ���� =scanner.nextInt();
//		
//		System.out.println("�غ��� ����:");
//		
//		int �غ� = scanner.nextInt();
//		
//		System.out.println("����:");
//		
//		int ���� = scanner.nextInt();
//		
//		System.out.println("��ٸ��� ���̴�"+ (����*�غ�)*����/2);


		
//	     ����10
	
//	    System.out.println("Ű�� �Է��Ͻÿ�:");
//	
//	    int Ű = scanner.nextInt();
//	
//	    System.out.println("ǥ��ü���� : "+ (Ű-100)*0.9);
	
		
		//���� 11
//		
//		System.out.println("Ű�� �Է��Ͻÿ�:");
//		
//		int Ű = scanner.nextInt();
//		
//	    System.out.println("�����Ը� �Է��Ͻÿ�:");
//		
//		int ������ = scanner.nextInt();
//		
//		System.out.println("BMI�� :"+ ������/((Ű /100.0))*(Ű /100.0));
	
		
		
		//���� 12
//		
//		System.out.println("inch �� �Է��Ͻÿ�:");
//		
//		int cm = scanner.nextInt();
//		
//		System.out.println("cm�� : "+ (cm*2.54) +"�Դϴ�");
//		
		
		// ���� 13
		
//		System.out.println("�߰���� ���� : ");
//		
//		int �߰� = scanner.nextInt();
//		
//		System.out.println("�⸻��� ���� : ");
//		
//		int �⸻ = scanner.nextInt();
//		
//		System.out.println("������ ���� : ");
//		
//		int ���� = scanner.nextInt();
//		
//		double �߰�1 = �߰�*0.3;
//		double �⸻1 = �⸻*0.3;
//		double ����1 = ����*0.4;
//		
//		System.out.printf(" �ݿ� ���� ����: %.2f",(�߰�1+�⸻1+����1));
//		
//		//����14
//		
//		int x = 10;
//		int y = x-- + 5 + --x;
//		printf(" x�� �� : %d , y�ǰ� :  %d ", x, y);
//		
		// 1. x-- + 5 >> 10+5  ****
			// 2. x--�� ���� >   x =9
			// 3. 15 + --x >>  x=8
			// 4. 15+ 8= 23 
		
		
		//����15
		
//		System.out.println("���� : ");
//		
//		int ���� = scanner.nextInt();
//		
//		String ����1 = ���� > 40 ? "�߳�" : ���� > 20 ? "����" : "�л�" ;
//		     		//  1.���̰� 40�̻��̸� �߳� �ƴϸ� 
//							
//		System.out.println("���̴� : "+ ����1+ "�̴�.");
		
		
	
		
	         //����16 : 3���� ������ �Է¹޾� ������������ ����
	
	
	
			//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
//		
     }
   
}