package Day05;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		String[][] memberlist = new String[100][3];
		// �湮�� 100��[title, contents, writer] �����ϴ� �迭
		String[][] boardlist = new String[100][3];
		while(true) {
			System.out.println("----------ȸ���� �湮��----------");
			System.out.println("--------------------------");
			System.out.println("1. ȸ�� ���� 2. �α��� ����"); int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("-----------ȸ������-----------");
				System.out.println("id �Է�"); String id = scanner.next();
				System.out.println("pw �Է�"); String pw = scanner.next();
				System.out.println("�̸� �Է�"); String �̸� = scanner.next();
				// 1.����� ����=0, ��ü(���ڿ�) = null �� ã�Ƽ� ����
				
				//���̵� �ߺ�üũ
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null &&memberlist[i][0].equals(id)) {
						
						System.out.println("������ ���̵� �����մϴ�.");
						idcheck=false; // ����x
						break;
					}
						//
					
				}
				
				//����κ�
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] == null) {
						memberlist[i][0]=id;
						memberlist[i][0]=pw;
						memberlist[i][0]=�̸�;
						System.out.println("�˸� ȸ�������� �Ǿ����ϴ�");
						break;
					}					
				}	
					
			}
			else if(ch==2) {				
				System.out.println("------------�α���-----------");
				System.out.println("id �Է�"); String id = scanner.next();
				System.out.println("pw �Է�"); String pw = scanner.next();
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("�α��� ����");			
						System.out.println("----------------------");	
						System.out.println("------------�湮��-------------");	
						System.out.println("1.�湮�ϳ���� 2.�α׾ƿ� ����:"); int ch2= scanner.nextInt();
						
						if(ch2==1) {
							System.out.println("------�۾���-------");
							System.out.println("title:");  int title= scanner.nextInt();				
							System.out.println(" content:");  int content= scanner.nextInt();
							// �迭�� ����ã�Ƽ� ����
							for(int j=0; i<boardlist.length; j++) {
								if(boardlist[j][0]==null) {
									boardlist[j][0]==title;
											boardlist[j][1]==content;
													boardlist[j][2]==id;
													
										}		
										
									}
								}
								else if(ch2==3) {
									System.out.println("�α׾ƿ��� �����մϴ�");
									break;
								}
								else {
									System.out.println("�˼����� ��ȣ�Դϴ�. !!");	
								}
							} // if e					
				}// for e
			} // ch 2
			else {
				System.out.println("--------------------------");				
			}
		}// �������� ����
	} // m e

} // c e 
