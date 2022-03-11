package Day08_3;

public class A {
	//전범위 클래스선언 A
		// 1.필드
	A a1 = new A(true);  // 현클래스에서 public 호출 가능
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	
	public int field1;
	int field2;
		// 2.생성자
	public A(boolean b) {}
	A( int b) {}				
	private A (String s) {}
	
	// 3.메소드
	public void method1() {}
	void method2() {}
	
	
}
