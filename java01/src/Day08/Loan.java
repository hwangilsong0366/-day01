package Day08;






 public class Loan {
	
	// 1. �ʵ�
	private double ����; 
	private int ����; 
	private int �����ݾ�; 
	private String �����ǰ��;	
	private String id ;
	private String ��ȯ����;
	boolean brental;
	//2. ������
	 public Loan() {}
	 
	public Loan(double ����, int ����, int �����ݾ�, String �����ȯ��, String �����ȯ��, String id,String ��ȯ����,boolean brental) {
		
		this.���� = ����;
		this.���� = ����;
		this.�����ݾ� = �����ݾ�;	
		this.�����ǰ�� = �����ǰ��;
		this.id = id;
		this.��ȯ���� = ��ȯ����;
		
		}

	
	

	
		
	
	// 3. �޼ҵ� 
	
	void �����ǰ���(){
		System.out.println("�����ǰ ���������");
		System.out.println("�����ǰ��: "); String �����ǰ�� = BankApplication.scanner.next();
		System.out.println("�������ڼ���: "); double ���� = BankApplication.scanner.nextDouble();
		
	}

	void �����û() {			 
	        	System.out.println("---------�����û ������-------------");
	        	System.out.println("�����û"); String isbn = BankApplication.scanner.next();
	        	for(Loan temp : BankApplication.Loan) {
	        		
	        		if(temp != null && temp.�����ǰ��.equals(�����ǰ��)){
	        			if(temp.brental) {
	        				System.out.println("������ �����մϴ�.");
	        				
	        			}else {
	        				System.out.println("�˸�]] ������ �Ұ����մϴ�.");
	        				return;
	        			}
	        			
	        		}
	        		
	        	}
	        }
	        void �����ݳ�() {
	
	}
	void ��ȯ����() {System.out.println("�����ȯ����Ȯ�� ");}
	
	
}

