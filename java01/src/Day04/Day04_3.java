package Day04;

import java.util.Random;  
import java.util.Scanner;  

public class Day04_3 { // c s
	public static void main(String[] args) { // m s
		
		int �÷��̾�; //����ڰ� ������ �� ����
		int ��ǻ��; //��ǻ�Ͱ� ������ ������ �� ����
		int ���Ӽ�=0; // �� ���������� ���� Ƚ�� ����
		int �÷��̾�¸���=0; int ��ǻ�ͽ¸���=0; // �� �¸� �� ����
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){ // ���ѷ��� �������� : 3���Է½� ���� (�극��ũ)
			System.out.println("-------���������� ����-----------");
			System.out.println("����(0) ����(1) ��(2) ����(3) ���� : ");
			�÷��̾� = scanner.nextInt(); // �Է��� �� ����
			System.out.println("�÷��̾ ����"+�÷��̾�);
			
			Random random = new Random(); //���� ��ü ����
			��ǻ�� = random.nextInt(3);
			// ������ ������ ��������  
			//random.nextInt() int�� ǥ���Ҽ� �ִ� ��������
			//random.nextInt(��): 0~ �� ������ ������ ���� �߻�
			//random.nextInt(10) : 0~9 �� ���� �߻�
			// �÷��̾� �¸� ����Ǽ� [0 > 2 / 1 > 0 / 2 > 1]
			
			
				if(�÷��̾� ==3) {
					System.out.println("�˸�)) ��������");
					System.out.println("�� ���� Ƚ��:"+���Ӽ�);
					
					if(�÷��̾�¸��� > ��ǻ�ͽ¸���) System.out.println("");
					
				}
			
			
			if((�÷��̾�==0 && ��ǻ��==2) || (�÷��̾�==1&&��ǻ��==0)||(�÷��̾�==2&&��ǻ��==1)){
				System.out.println("�˸�)) �÷��̾� �¸�");
				�÷��̾�¸���++;
				
			}
			
			else if((�÷��̾�==0 && ��ǻ��==0) || (�÷��̾�==1&&��ǻ��==1)||(�÷��̾�==2&&��ǻ��==2)) {
				System.out.println("�˸�)) ���º�");			
			}
			else{
				System.out.println("�˸�)) ��ǻ�� �¸�");
				��ǻ�ͽ¸���++;			
			}
			
			System.out.println(" ��ǻ�Ͱ� ����:"+ ��ǻ��);
			
		} // w e
			���Ӽ�++;
		

	} // m e

} // c e
