package ccec.edu;

import java.util.Scanner;

public class MenueEat {

	/**
	 * @param args
	 * 
	 * 要求：首先输出一个提示，表示欢迎来到杰瑞点餐系统，一和二分别代表注册和登录，先输入1进行注册，注意两次的密码要相同才能验证成功
	 * 成功后，又产生开头的提示，再输入2进行点餐，
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int q = 2;// 错误的次数
		String g_account="";
		String g_pwd="";
		String name = ""; // 商品名称
		double price = 0.0; // 商品价格
		int goodsNo = 0; // 商品编号
		int amount = 0; // 购买数量
		double total = 0.0; // 商品总价
		double money = 0.0; // 应付金额
		Scanner scan = new Scanner(System.in);
		System.out.println("**************欢迎来到杰瑞点餐系统***************");
		System.out.println("1.注册");
		System.out.println("2.登录");
		System.out.println("请输入你要进行的操作：");
		int choise = scan.nextInt();// 获取用户输入的数字，注册或登录
//while(true){}死循环，直到return跳出循环	
		
		while(choise==1||choise==2){
			if(choise==1){
				System.out.println("*******欢迎注册！*******");
				for (int i = 0; i < 3; i++) {
					System.out.println("请输入账号");
					g_account = scan.next();
					System.out.println("请输入密码");
					g_pwd = scan.next();
					System.out.println("请确认密码");
					String pwd2 = scan.next();

					if ((g_account != null) && (g_pwd != null) && (pwd2 != null)
							&& (g_pwd.equals(pwd2))) {
						System.out.println("恭喜您注册成功！");
						i = 3;// 标记，跳出for循环
						System.out.println("**************欢迎来到杰瑞点餐系统***************");
						System.out.println("1.注册");
						System.out.println("2.登录");
						System.out.println("请输入你要进行的操作：");
						choise = scan.nextInt();// 获取用户输入的数字，注册或登录
						
						
					} else if (q != 0) {
						System.out.println("输入有误 请重新输入(您还有" + q + "次机会)");
						q--;
					} else {
						choise = -1;// 跳出while循环
						System.out.println("对不起，您已经没有机会再次输入了！");
					}
				}
			}
			if(choise==2){
				int p = 2;// 错误的次数
				System.out.println("欢迎登录！");
				for (int i = 0; i < 3; i++) {
					System.out.println("请输入账号");
					String account = scan.next();
					System.out.println("请输入密码");
					String pwd = scan.next();
					if (account.equals(g_account) && pwd.equals(g_pwd)) {
						System.out.println("登陆成功！");
						System.out.println("***************欢迎来到杰瑞点餐系统主页*************** ");
						System.out.println("1.宫保鸡丁 ￥3\n2.大份 ￥5\n3.土豆丝 ￥3.5\n4.鸡公煲 ￥8\n5.鱼香肉丝 ￥6\n6.米饭 ￥2");
						String answer = "y"; // 标识是否继续
						while ("y".equals(answer)) {
							System.out.print("请输入菜品编号:");
							goodsNo = scan.nextInt();
							System.out.print("请输入购买数量:");
							amount = scan.nextInt();
							switch (goodsNo) {
							case 1:
								name = "宫保鸡丁";
								price = 3.0;
								break;
							case 2:
								name = "大份";
								price = 5.0;
								break;
							case 3:
								name = "土豆丝";
								price = 3.5;
								break;
							case 4:
								name = "鸡公煲";
								price = 8.0;
								break;
							case 5:
								name = "鱼香肉丝";
								price = 6.0;
								break;
							case 6:
								name = "米饭";
								price = 2.0;
								break;
							}
							total = price * amount; // 合计
							System.out.println(name + "￥ " + price + "\t" + "数量 " + amount
									+ "\t合计￥ " + total);
							System.out.println("是否继续 (y/n)");
							answer = scan.next();
							money += total;
						}
						System.out.println("您一共消费"+money+"元");
						i = 3;// 跳出for循环
					} else if (p != 0) {
						System.out.println("账号密码有误 请重新输入(您还有" + p + "次机会)");
						p--;
					} else {
						choise = -1;// 跳出while循环
						System.out.println("对不起，您已经没有机会再次输入了！");
					}
				}
				choise=-1;
			}
		}

	}
}
