package Day08_3;

public class A {
	//������ Ŭ�������� A
		// 1.�ʵ�
	A a1 = new A(true);  // ��Ŭ�������� public ȣ�� ����
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	
	public int field1;
	int field2;
		// 2.������
	public A(boolean b) {}
	A( int b) {}				
	private A (String s) {}
	
	// 3.�޼ҵ�
	public void method1() {}
	void method2() {}
	
	
}
