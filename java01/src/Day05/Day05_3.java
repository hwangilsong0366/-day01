package Day05;

import java.util.Scanner;

public class Day05_3 {
	public static void main(String[] args) {
		int max =0;
		int[] array = { 1,5,3,8,2};
		for(int i=0; i<array.length; i++) {
			
			if(max < array[i]) max= array[i];
		}
		System.out.println("max :"+max );
		
		int[][]array2= {
				{95 , 86},{83,92,96},{78,83,93,87,88}
				
		};
		int sum=0;
		double avg=0.0;
		for(int ��=0; ��<array2.length; ��++) {
			for(int ��=0; ��<array2[��].length; ��++) {
				sum += array2[��][��];
				
			}
			
		}
		
		
		// 9  
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("------------------------");
			System.out.println("���� :");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л���>"); studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			else if(selectNo ==2) {
				for(int i =0; i<scores.length; i++) {
					System.out.printf("scores[%d]: \n",i,scores[i] );
					
				}
			}
			else if(selectNo==3) {
				for(int i=0; i<scores.length; i++) {
					
					
				}
				
			}
			else if(selectNo == 4) {
				int �ְ����� = 0;
				int ���հ�=0;
				double ������� = 0.0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) max = scores[i];
					���հ�+= scores[i];
					
				}
			}
			else if(selectNo == 5) {
				
				break;
			}
					
		}
		
	}

}
