package Day02;

public class Day02_4 {
	
             public static void main(String[] args) {
            	 
            	 // 1. ��� 1. + (���ϱ�) 2. - ���� 3. * ���ϱ� 4. / ������ >>�� 5. %( ������ >) ������)
            	 
            	 // 2. ��
            	 			//> �ʰ�     <�̸�
            	 			//>= �̻� 		<=����
            	 			//== ����		!= ���� �ʴ�. [�ٸ���]
            	 			
            	 			
            	 // 3. ���� [ 2���̻� �񱳿����� ����]
            	            //&& �̸鼭 �̰� ��� �׸��� and
            	            //|| �̰ų� �ų� �Ǵ� �ϳ��� or
            	            // ! ����[�ݴ�] 
            	 //4. ���� �����ʰ��� �������� �̵�
            	 			//= : �����ʰ��� �������� �̵�[����]
            	 			//+= : �����ʰ��� ���ʰ��� ���ϱ� �Ŀ� 			
            	 			//
            	 
            	 				// ������ = ������ +10 
            	 					//1 ������ ȣ�� 
            	 					//2. ������ 10 ���Ѵ�.
            	 					//3. �ش纯���� 10�� ���Ѵ�.
            	 
            	 
            	 //5. ���� [* : ������������ ��ȭ]
            	 			//1. ++: 1����     2.-- : 1����
            	 			//���� ����/���� : 
            	 
            	 
            	 // ���׿����� [���ǿ�����]
            	 
            	 	 // ���ǽ� ? �� : ���� 
	
            	 // ��������� ��
            	 
            	 
            	 int ����1 = 10;   int ����2= 20;
            	 
            	 
            	 System.out.println("���ϱ� :" + ����1+����2);      // ���ڿ�+���� >> ���Ῥ����
            	 												// ���ڿ�+(����1+����2) 
            	 System.out.println("���ϱ� :" + (����1+����2));
            	 
            	 
            	 System.out.println("���� : "+ (����1-����2));
            	 
            	 System.out.println(" ���ϱ� : " + (����1*����2));
            	 
            	 System.out.println(" ������ :" + (����1/����2));
            	 
            	 System.out.println(" ������ :" + (����1%����2));
            	 
            	 // ���������� ����
            	 
            	 ����1++; // �������ڿ� ++�� ��� �ش� ������ �����Ϳ� +1 
            	 
            	 
            	System.out.println("����: "+ ����1);
            	 
            	 ����1--; // �������ڿ� -- �� ��� �ش� ������ �����Ϳ� -1
            	 
            	 System.out.println(" ���� : " + ����1);
            	 
            	 System.out.println("��������:" + ++����1); 
            	 System.out.println("��������:" + ����1++);
            	 
            	 
            	 //���ɾ�ó���� ����ó�� �Ұ��� > ó�� ������ ���� 
            	 // ++���� : ���� ������ print ����
            	 //����++ : print ���� �� ����
            	 
            	 System.out.println("�������� �� : "+ ����1);
            	 
            	 
            	 System.out.println("�������� : "+ --����1);
            	 System.out.println(" �������� :" + ����1--);
            	 
            	 System.out.println("�������� �� :" + ����1);
          
            
            	 System.out.println(" �̻� "+ (����1 >= ����2));
            	 
            
             	 System.out.println(" ����: "+(����1 <= ����2));
            	 
            	 System.out.println("�ʰ� : "+ (����1 > ����2));
            	 System.out.println(" ���� :"+ (����1==����2));
            	 
            	 System.out.println("�����ʴ�:"+ (����1!=����2));
            	 
            	 
            	 // ���������� ���� 
            	 	// and && : 2���̻��� �񱳿����ڰ� ��� true  >> ����� true �ƴϸ� false
            	 
            	 
            	 
            	 int ����3 = 30;   int ����4 = 40;
            	 
            	 System.out.println(" and :"+ (����1 >= ����2 && ����4 >=����3));
            	 
            	 System.out.println("or : "+ (����1>=����2 || ����4 >=����3));
            	 
            	 
            	 System.out.println("not ����: " + !(����1>=����2 || ����4>=����3));
            	 
            	 
            	 // ���Կ����� ���� 
            	 
            	 ����1 =����1 +10;
            	 
            	 System.out.println("����1:"+ ����1);
            	 
            	 ����1 +=10;
            	 System.out.println("����1:"+ ����1);
            	 
            	 // ���ǿ����� ����
            	 
            	 int ���� =85;
            	 
            	 char ���= ���� > 90 ? 'A' : 'B';
            	 
            	 //  ���ǽ� ? ��(true) : ����(false)
            	 // ������ 90 �ʰ��ϸ� A �ƴϸ� B
            	 
            	 System.out.println("���:" + ���);
            	 
            	 char ���2 = ���� > 90 ? 'A' : ���� > 80 ? 'B' : 'C' ;
            	 
            	  // ���ǽ� ? �� : ����[���ǽ� ? �� : ���� ]
            	 
            	 
      } 
             
	
	
	
	
	
	

}