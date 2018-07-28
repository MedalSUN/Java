package IO流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test_in_practice {

	/**
	 * 
	 * readLine读到最后一行的时候是不是就相当于指针，停在最后一行。
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
			
			System.out.println("请输入用户名：");
			user_in = sc.nextLine();

			while ((str = br.readLine()) != null) {
				
				System.out.println("==========："+str);
				
				String[] user_pwd = str.split("@_@");
				
				if (user_pwd[0].equals(user_in)) {
					System.out.println("请输入密码：");
					pwd_in = sc.next();
					if (user_pwd[1].equals(pwd_in)) {
						System.out.println("登陆成功！");
						break;
					} else {
						System.out.println("密码错误！");
						break;
					}
				} else {
					if (str == null) {
						System.out.println("该用户不存在！");
					}else {
						continue;
					}
				}
			}
			br.close();
		}
	}

