package Day06;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷� {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	Member[] memberlist = new Member[100];  ////////////////
	
	
	while(true) {
	System.out.println("-------ȸ����[Ŭ���� ����!!]----------");
	System.out.println("1.ȸ������ 2.�α��� 3.���̵� ã�� 4.��й�ȣ ã��");
	System.out.println("��ȣ �Է�: "); int num =scanner.nextInt();
	
	if(num==1) {
		System.out.println("------ȸ�� ���� ����-----------");
		System.out.println("���̵�: "); String id = scanner.next();
		System.out.println("��й�ȣ: "); String pw = scanner.next();
		System.out.println("�̸�: "); String name = scanner.next();
		System.out.println("����ó: "); String phone = scanner.next();
		
		Member member = new Member();
		
		member.id = id;     ////////////////
		// ��ü�� �ʵ� = �Է¹����� 
		member.pw= pw;  ////////////////
		member.name= name;////////////////
		member.phone= phone;////////////////
		
		boolean idc = false; ////////////////
		for(Member temp : memberlist) {
			
			if(temp !=null && temp.id.equals(id)) {
				
				
				System.out.println("�ش� ���̵�� �̹� ������Դϴ�. �ٽ� �õ��ϼ���");
				idc = true;
				break;  				

			}
		}
		if(idc == false) {
			int i=0;
			for(Member temp:memberlist) {
				if(temp == null) {
					
					memberlist[i] = member;
					System.out.println("ȸ�� ���� ����!!!!");
					break;
				}
		
			}
			i++;
			
		}		
	}
else if(num==2) {
	System.out.println("***************�α��� ������***************");
	
	System.out.println("���̵�:" );  String log1 = scanner.next();
	System.out.println("��й�ȣ :" );  String log2 = scanner.next();
	
	boolean loginch =false;
		for(Member temp : memberlist) {
			if(temp !=null && temp.id.equals(log1)) {
				
				System.out.println("�α��� ����!!");
				loginch = true;
				
			}
			
		}
		if(loginch==false) {
			System.out.println("�˸�)) ������ ȸ�������� �����ϴ�/.");
			
		}
}
else if(num==3) {
	System.out.println("*********���̵� ã��************");
	System.out.println("�̸�: ");  String name = scanner.next();
	System.out.println("����ó : "); String phone = scanner.next();
	
	boolean findch = false;
	for(Member temp : memberlist) {
		if(temp !=null && temp.name.equals(name) && temp.phone.equals(phone)) {
			
			System.out.println("�˸�)) ���̵� ã�� ����");
			System.out.println("ȸ�� id :" +temp.id);
			findch = true;  // 
			break;
		}
		
	}
	
	if(findch == false) {
		
		System.out.println("������ ȸ�������� �����ϴ�. ");
	}
}
	else if(num==4) {
	
	System.out.println("���̵� : ");  String id = scanner.next();
	System.out.println("��ȭ��ȣ ");  String phone = scanner.next();
	boolean findch =false;
	for(Member temp : memberlist) {
		if(temp !=null && temp.id.equals(id) && temp.phone.equals(phone) ) {
			
			System.out.println("��й�ȣ ã�� ����");
			System.out.println("ȸ�� ��й�ȣ: "+temp.pw);
			findch= true;
			break;
			
		}
		
	}
	if(findch == false) {
		
		 System.out.println("������ ȸ�������� �����ϴ�.");
	}
	
	
	}
	else {System.out.println("�˼����� ��ȣ�Դϴ�.");}
	
	}
	
	
	} //  m e

} // c e 
	