package Day08;

public class Day08_1 {
	public static void main(String[] args) {
	//static 
		//��������
		//�������� ������
		
		//*Ŭ������ �ʵ�, �޼ҵ� ���ٹ��
			//1. ��ü ���� >> ��ü.���
	Calculator calculator =new Calculator() ;
	System.out.println("��ü�� �̿��� ������� :"+calculator);
	
	System.out.println("��ü���� �ɹ�����:"+calculator);
	// (static ��� �϶�) 1. Ŭ������.���
		//Ŭ���� �ڵ� �ǰ� �޼ҵ念���� static ������ �޸� �Ҵ�
	double result =10*10*Calculator.pi;
	
	}
}

