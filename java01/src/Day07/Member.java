package Day07;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Member {
	
	// 1.�ʵ�
	 int mno;//ȸ����ȣ
	 String id;	//���̵�
	 String pw;// ��й�ȣ
	 String name;//�̸�
	 String phone;//����ó
		
	//2.������  [�����ڸ� == Ŭ������]
	 	// 1.�������[�⺻������] : �޼ҵ�ȣ��� ��ü������
		//����
	 Scanner scanner = new Scanner(System.in);
	 public Member() {}
	 
	 public Member(int mno, String id, String pw, String name,String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	 }
	
	//3.�α��� �޼ҵ� [�μ�x ��ȯo]
 boolean ȸ������() {
	 System.out.println(" ----- ȸ������ ������ ------");
		System.out.println("���̵�:"); String id= Day07_5_BookApplication.scanner.next();
		System.out.println("��й�ȣ:"); String pw=Day07_5_BookApplication.scanner.next();
		System.out.println("�̸�:");String name = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó:");String phone = Day07_5_BookApplication.scanner.next();
 		}

		String �α���() {
			 System.out.println(" ----- �α��� ������ ------");
				//1. �Է¹ޱ�
			 System.out.println("���̵�:"); String id =Day07_5_BookApplication.scanner.next();
			 System.out.println("��й�ȣ:"); String pw =Day07_5_BookApplication.scanner.next();
			 //2.�迭�� ��ü id�� pw�� �Է��� ���� �����ϸ�
			  for(Member temp : Day07_5_BookApplication.members) {
				  if(temp !=null && temp.id.equals(id) && temp.pw.equals(pw)) {
					  return temp.id;
					  
				  }
				  
			  }
			 return "���̵�";
			 
		 }
		 void ���̵�ã��() {
			 System.out.println(" ----- ���̵�ã�� ������ ------");
			 System.out.println("�̸�:"); String name = Day07_5_BookApplication.scanner.next();
			 System.out.println("��ȭ��ȣ:"); String phone = Day07_5_BookApplication.scanner.next();
			 for(Member temp : Day07_5_BookApplication.members) {
				 if(temp !=null && temp.name.equals(phone)) {
					 
					 
				 }
				 
			 }
		 }
		 void ��й�ȣã��() {
			 System.out.println(" ----- ��й�ȣã�� ������ ------");
		 }
		 
		 
		//1. ȸ������ �޼ҵ�
		//2 . �α��� �޼ҵ�
		//3. ���̵�ã�� �޼ҵ�
}


