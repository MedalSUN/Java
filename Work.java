package ccec.edu;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		/*
		 * =====test1
		 * 计算出一到一百之间    所有    不能被3整除的整数     的和     大于（或等于）2000的数字。
		 *
		 
		int i=1;
		int sum=0;
		while (i<=100)//
		{
			if(i%3!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		if (2000<=sum)
		{
			System.out.println("总和是："+sum);
		}else{System.out.println("没有满足条件的数字");}
		
		 */
		
		
		/*
		 * =====test2
		 * 输出一到十所有数的平方和
		 * 
		
		int i=1;
		int sum=0;
		while (i<=10)
		{
			int m=0;
			m=i*i;
			sum=sum+m;
			i++;
		}
		System.out.println(sum);
		 */
		
		/*
		 *  =====test3
		 * 打印一个直角三角形形状的星****图。====共有八行
		 * 
		int i=1;
		while (i<=8)
		{
			int f=0;//输出每一行后都需要归零的变量设置为局部变量比较合适。
			while (f<i)
				{  
					System.out.print("*");
					f++;
				}
			i++;
			System.out.println();
		}
		
		
		/*
		 * =====test4
		 * 
		 * 打印九九乘法表===========循环，乘法公式里的第一个数代表列，第二个数代表行。
		 * 
		
		int i=1;
		while (i<=9)//外层循环代表行
		{
			int s=1;//变量s代表列
			int m=0;
			while (s<=i)//内层循环代表每一行的式子（依次输出每一列）
			{
				m=s*i;
				System.out.print("\t"+s+"*"+i+"="+m);
				s++;
			}
			i++;
			System.out.println();
		}
		
		
		/*
		 * =====test5
		 * 要求输出一个菱形图案====每行个数为1357  5  3  1
		 * 
		int i = 1;
		while (i<=7)
		{
			int f=1;
			int k=0;
			int j=1;
			int p=0;
			if (i<=4) {
				k=2*(4-i);
				p=2*i-1;
			}else {
				k=2*i-8;
				p=2*(8-i)-1;
			}
			while (f<=k){
				System.out.print(" ");
				f++;
			}
			while (j<=p){
				System.out.print("*"+" ");
				j++;
			}
			i++;
			System.out.println();
		}
		
		
		
		
		/*
		 * =====test6
		 * 循环中判断输入密码三次。
		 * 
		Scanner scan=new Scanner(System.in);//注意，对象不用进入循环语句中
		int i=0;
		while (i<3)//超过三次直接提示失败
		{
			System.out.println("请输入密码");                
			int pwd=scan.nextInt();
			if (pwd == 111111) {
				//金额不符合规范就一直循环输出提示信息。
				int money=0;
				boolean flag=false;
				while (flag==false)
				{
					System.out.println("请输入金额");
					money=scan.nextInt();
					flag=money % 100 == 0 && money >= 0 && money <= 1000;
					
				}
				System.out.println("您取了"+money+"元");
				System.out.println("交易完成，请取卡！");
				break;//return，结束当前整个函数的调用，break只能跳出当前循环，也就是说只能跳出当前的那一层，只能一层。
			}else {//当密码输入不正确的时候，
				if (i<2) {
					System.out.print("密码错误：");
				}else if (i==2){
					System.out.print("密码三次输错，请取卡");
					break;
				}
			}
			i++;
			
		}
		
		
		
		//要求： 用一个循环将直角三角形（由*组成）打印输出。
		
		//重点：在于如何控制换行。
		
		int i=1;
		int j=0;
		while (i<=7){
			System.out.print("*");
			j++;//
			if (j==i) {
				System.out.println();
				j=0;//每走一次这个分支就要执行一次
				i++;//i++写在这里面，如果不满足换行标准，即j！=i就可以将输出*语句一直执行下去。
			}
			
			
		}
		
		
		//2/1+3/2+5/3+8/5+13/8+......前二十位
		int i=2;//分子初始值
		int j=1;//分母初始值。
		int sum=0;//用于总和
		int m=0;//中间变量，
		int n=1;//控制循环次数
		while (n<=20){
			int k=0;
			k=i/j;//定义第一项的形式
			sum=sum+k;
			m=i+j;//下一项的分母
			j=i;
			i=m;//这三步是进行下一项的数的替换。
			n++;
		}
		System.out.println(sum);
		
		*/
		
		
		
	}
}
