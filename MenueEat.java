package ccec.edu;

import java.util.Scanner;

public class MenueEat {

	/**
	 * @param args
	 * 
	 * Ҫ���������һ����ʾ����ʾ��ӭ����������ϵͳ��һ�Ͷ��ֱ����ע��͵�¼��������1����ע�ᣬע�����ε�����Ҫ��ͬ������֤�ɹ�
	 * �ɹ����ֲ�����ͷ����ʾ��������2���е�ͣ�
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int q = 2;// ����Ĵ���
		String g_account="";
		String g_pwd="";
		String name = ""; // ��Ʒ����
		double price = 0.0; // ��Ʒ�۸�
		int goodsNo = 0; // ��Ʒ���
		int amount = 0; // ��������
		double total = 0.0; // ��Ʒ�ܼ�
		double money = 0.0; // Ӧ�����
		Scanner scan = new Scanner(System.in);
		System.out.println("**************��ӭ����������ϵͳ***************");
		System.out.println("1.ע��");
		System.out.println("2.��¼");
		System.out.println("��������Ҫ���еĲ�����");
		int choise = scan.nextInt();// ��ȡ�û���������֣�ע����¼
//while(true){}��ѭ����ֱ��return����ѭ��	
		
		while(choise==1||choise==2){
			if(choise==1){
				System.out.println("*******��ӭע�ᣡ*******");
				for (int i = 0; i < 3; i++) {
					System.out.println("�������˺�");
					g_account = scan.next();
					System.out.println("����������");
					g_pwd = scan.next();
					System.out.println("��ȷ������");
					String pwd2 = scan.next();

					if ((g_account != null) && (g_pwd != null) && (pwd2 != null)
							&& (g_pwd.equals(pwd2))) {
						System.out.println("��ϲ��ע��ɹ���");
						i = 3;// ��ǣ�����forѭ��
						System.out.println("**************��ӭ����������ϵͳ***************");
						System.out.println("1.ע��");
						System.out.println("2.��¼");
						System.out.println("��������Ҫ���еĲ�����");
						choise = scan.nextInt();// ��ȡ�û���������֣�ע����¼
						
						
					} else if (q != 0) {
						System.out.println("�������� ����������(������" + q + "�λ���)");
						q--;
					} else {
						choise = -1;// ����whileѭ��
						System.out.println("�Բ������Ѿ�û�л����ٴ������ˣ�");
					}
				}
			}
			if(choise==2){
				int p = 2;// ����Ĵ���
				System.out.println("��ӭ��¼��");
				for (int i = 0; i < 3; i++) {
					System.out.println("�������˺�");
					String account = scan.next();
					System.out.println("����������");
					String pwd = scan.next();
					if (account.equals(g_account) && pwd.equals(g_pwd)) {
						System.out.println("��½�ɹ���");
						System.out.println("***************��ӭ����������ϵͳ��ҳ*************** ");
						System.out.println("1.�������� ��3\n2.��� ��5\n3.����˿ ��3.5\n4.������ ��8\n5.������˿ ��6\n6.�׷� ��2");
						String answer = "y"; // ��ʶ�Ƿ����
						while ("y".equals(answer)) {
							System.out.print("�������Ʒ���:");
							goodsNo = scan.nextInt();
							System.out.print("�����빺������:");
							amount = scan.nextInt();
							switch (goodsNo) {
							case 1:
								name = "��������";
								price = 3.0;
								break;
							case 2:
								name = "���";
								price = 5.0;
								break;
							case 3:
								name = "����˿";
								price = 3.5;
								break;
							case 4:
								name = "������";
								price = 8.0;
								break;
							case 5:
								name = "������˿";
								price = 6.0;
								break;
							case 6:
								name = "�׷�";
								price = 2.0;
								break;
							}
							total = price * amount; // �ϼ�
							System.out.println(name + "�� " + price + "\t" + "���� " + amount
									+ "\t�ϼƣ� " + total);
							System.out.println("�Ƿ���� (y/n)");
							answer = scan.next();
							money += total;
						}
						System.out.println("��һ������"+money+"Ԫ");
						i = 3;// ����forѭ��
					} else if (p != 0) {
						System.out.println("�˺��������� ����������(������" + p + "�λ���)");
						p--;
					} else {
						choise = -1;// ����whileѭ��
						System.out.println("�Բ������Ѿ�û�л����ٴ������ˣ�");
					}
				}
				choise=-1;
			}
		}

	}
}
