package Practice01;

import java.util.Scanner;

public class Practice01_1 {
	
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 int �ݶ���� =10; 	 int �䷹Ÿ��� =10; 	 int �꽺��� =10; 
		int �ݶ󱸸ż� = 0;		 int �䷹Ÿ���ż� = 0;		 int �꽺���ż� = 0;		 

		while(true) { //w s
			
			System.out.println("----------------�޴���-------------------");
			System.out.println("1.�ݶ�:300 2.�䷹Ÿ:200 3.�꽺:500 4.����");
			System.out.println(">>>>>>>����");        int ��ȣ = scanner.nextInt();
			
			
			if(��ȣ==1) {
				
				if(�ݶ����==0){
					
					 System.out.println("��� �����ϴ� ");
					
				}
			
			else { 
				 System.out.println("�ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
				�ݶ����--;
				�ݶ󱸸ż�++;
			}
				
				
			}else if(��ȣ==2) {
				if(�䷹Ÿ���==0) {
					 
						System.out.println("��� �����ϴ�");
				}else {
					
					System.out.println("�䷹Ÿ�� ��ٱ��Ͽ� ��ҽ��ϴ�");
					�䷹Ÿ���--;
					�䷹Ÿ���ż�++;
				}
				
			}else if(��ȣ==3){
				if(�꽺���==0) {
					System.out.println("��� �����ϴ�.");
					
				}else {
					System.out.println("�긣�� ��ٱ��Ͽ� ��ҽ��ϴ�");
					�꽺���--;
					�꽺���ż�++;
				
				}
				
			}else if(��ȣ==4) {
				System.out.println("-------����-------");
				System.out.println("��ǰ��\t���ż���\t�ݾ�");
				if(�ݶ󱸸ż�!=0) 	System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*300));
				if(�䷹Ÿ���ż�!=0)   	System.out.println("�䷹Ÿ\t"+ �䷹Ÿ���ż� +"\t"+(�䷹Ÿ���ż�*200));
				if(�꽺���ż�!=0)   	System.out.println("�꽺\t"+�꽺���ż�+"\t"+(�꽺���ż�*500));				
				int �Ѱ��� = (�ݶ󱸸ż�*300)+(�䷹Ÿ���ż�*200)+(�꽺���ż�*500);
				System.out.println("�� ������:"+�Ѱ���);
				System.out.println("1. ����  2.���");  int ��ȣ2 = scanner.nextInt();
							
						
			      if(��ȣ2==1) {
			    	  while(true) {
			    			System.out.println("�˸�)) �ݾ�:"); int �ݾ� = scanner.nextInt();
			    			if( �ݾ� <�Ѱ���) {
			    				System.out.println("�ݾ��� �����մϴ�");
			    			}else {
			    				
			    		
			    				System.out.println("���ſϷ� �ֹ���ȣ 0000��");
			    			System.out.println("�ܵ�:"+(�ݾ�-�Ѱ���));
			    			
		    				�ݶ󱸸ż�=0; 	�䷹Ÿ���ż�=0; 	�꽺���ż�=0;
			    				break;
			    				
			    			} // 
			    		  
			    			
			    	  }  // 
 			    	
			    	  
			      } // 
			      else if(��ȣ2==2) {
			    	  
			    	  System.out.println("���Ÿ�� ��� �����");
			    	  �ݶ���� += �ݶ󱸸ż�;	�䷹Ÿ��� += �䷹Ÿ���ż�; �꽺��� +=�꽺���ż�; //  ���ż��� ���� �ű�� 
						�ݶ󱸸ż� =0; �䷹Ÿ���ż�=0; �꽺���ż�=0;			
			    	  
			      }else {
			    	  
			    	  System.out.println("�˼����� �ൿ");
			      }
				
			}
			else {
				
				  System.out.println("�˼����� �ൿ");
				
			
			
		} // 
			
		 
	} // 
	
	 }
}

