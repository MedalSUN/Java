package IO��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test_in_practice {

	/**
	 * 
	 * readLine�������һ�е�ʱ���ǲ��Ǿ��൱��ָ�룬ͣ�����һ�С�
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		
			FileReader fReader = new FileReader(
					"C:\\Users\\Administrator\\Desktop\\123.txt");
			BufferedReader br = new BufferedReader(fReader);
			String str;
			String user_in;
			String pwd_in;
			String k;
			
			System.out.println("�������û�����");
			user_in = sc.nextLine();

			while ((str = br.readLine()) != null) {
				
				System.out.println("==========��"+str);
				
				String[] user_pwd = str.split("@_@");
				
				if (user_pwd[0].equals(user_in)) {
					System.out.println("���������룺");
					pwd_in = sc.next();
					if (user_pwd[1].equals(pwd_in)) {
						System.out.println("��½�ɹ���");
						break;
					} else {
						System.out.println("�������");
						break;
					}
				} else {
					if (str == null) {
						System.out.println("���û������ڣ�");
					}else {
						continue;
					}
				}
			}
			br.close();
		}
	}

