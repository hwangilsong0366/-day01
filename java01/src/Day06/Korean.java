package Day06;

public class Korean {
	
	
	//1. �ʵ�
	String nation = "���ѹα�";
	String name;
	// �̸� �������� �ʱ�ȭ x[NULL]
	String  ssn;
	
	//
	
	//2.������
	 //����1 : �������̸� == Ŭ�����̸� ����
	// ����2 : �ܺηκ��� ������ �Ű���[�μ�] ����
	// ����3 : ������ ������ �̸� ������ ����.
		// �����ε� : ������ �̸��� ��� �ڵ带 ������
	//3.�޼ҵ�
	
	Korean(){ // 1. �������
		//���빰 x
		
		
	}
	
		Korean(String n){
		
		name = n;
		
	}
	

	
	
	
	
	
	Korean(String n, String s){
		
		name = n;
		ssn =s ;
	}
	
	
	// 3. �ʵ� 3���� ���� ������
	Korean(String nation, String name, String ssn){
		
		
		nation = nation;
		name = name;
		ssn= ssn;
			// ���κ��� (����Ŭ���� ����)
			// �Ű����� (�ܺηκ��� ���� ����)
		
		
	}


}

