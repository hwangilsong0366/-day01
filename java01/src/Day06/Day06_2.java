package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		//1. Car : ���ǵ� Ŭ������
		//2. mycar �ƹ��ų�
		//3. new: �޸� �Ҵ� ������
		//4. Car() :������
		
		//2. ��ü�� �ʵ� ȣ�� [. : ���ٿ�����]
		System.out.println("����ȸ�� : " + myCar.company);
		//mycar ��ü�� �ʵ� ����
		System.out.println("�𵨸�:" + myCar.model);
		
		System.out.println("����:" + myCar.color);
		
		System.out.println("�ְ�ӵ�:" + myCar.maxSpeed);
		
		//3.��ü�� �ʵ� �� ����
		
		myCar.speed= 60;
		System.out.println("������ �ӵ� : " + myCar.speed );
		
		Car yourcar = new Car();
	System.out.println(" 2�� �ڵ��� :"+ yourcar.speed );
	
	}
	
	
}
