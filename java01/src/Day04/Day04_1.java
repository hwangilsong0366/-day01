package Day04;

import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		
		// ��� : if, switch
		// �ݺ��� : for, while
				//1.�ʱⰪ 2.���ǽ� 3.������ 4.���๮
		//while ����
		
		
		
		
		//for ��1)
		
		for(int i=1; i<=10; i++) {
			
			//  i�� 1���� 10���ϱ��� 1�������ϸ鼭 ���๮ �ݺ�ó��
			
			System.out.println(i+" ");
			
		}
		
		
		// while ��1)
		
		int i=1; 
		while(i<=10) {
			
			
			
			System.out.println(i+" ");
			i++;
			
			
		}
		
		// for ��2)
		int sum=0;
		for(int j=1; j<=100; j++) {
	
			sum +=j;
			
			System.out.println("for�� �����հ� :" +sum);
			
		}
		//while ��3)
		
		int j =1; 
		int sum2=0;
		while (j<=100) {
			sum+=j;
			j++;
			
		}
		
		//��4
		
		// true ���� ������ ���ѷ��� ���̳���
		while(true) {
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			
			
		}
		
		
		
		
		
		
		
	} // m e

} // ce 
