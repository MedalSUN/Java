package ccec.edu;

import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		/*
		 * =====test1
		 * �����һ��һ��֮��    ����    ���ܱ�3����������     �ĺ�     ���ڣ�����ڣ�2000�����֡�
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
			System.out.println("�ܺ��ǣ�"+sum);
		}else{System.out.println("û����������������");}
		
		 */
		
		
		/*
		 * =====test2
		 * ���һ��ʮ��������ƽ����
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
		 * ��ӡһ��ֱ����������״����****ͼ��====���а���
		 * 
		int i=1;
		while (i<=8)
		{
			int f=0;//���ÿһ�к���Ҫ����ı�������Ϊ�ֲ������ȽϺ��ʡ�
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
		 * ��ӡ�žų˷���===========ѭ�����˷���ʽ��ĵ�һ���������У��ڶ����������С�
		 * 
		
		int i=1;
		while (i<=9)//���ѭ��������
		{
			int s=1;//����s������
			int m=0;
			while (s<=i)//�ڲ�ѭ������ÿһ�е�ʽ�ӣ��������ÿһ�У�
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
		 * Ҫ�����һ������ͼ��====ÿ�и���Ϊ1357  5  3  1
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
		 * ѭ�����ж������������Ρ�
		 * 
		Scanner scan=new Scanner(System.in);//ע�⣬�����ý���ѭ�������
		int i=0;
		while (i<3)//��������ֱ����ʾʧ��
		{
			System.out.println("����������");                
			int pwd=scan.nextInt();
			if (pwd == 111111) {
				//�����Ϲ淶��һֱѭ�������ʾ��Ϣ��
				int money=0;
				boolean flag=false;
				while (flag==false)
				{
					System.out.println("��������");
					money=scan.nextInt();
					flag=money % 100 == 0 && money >= 0 && money <= 1000;
					
				}
				System.out.println("��ȡ��"+money+"Ԫ");
				System.out.println("������ɣ���ȡ����");
				break;//return��������ǰ���������ĵ��ã�breakֻ��������ǰѭ����Ҳ����˵ֻ��������ǰ����һ�㣬ֻ��һ�㡣
			}else {//���������벻��ȷ��ʱ��
				if (i<2) {
					System.out.print("�������");
				}else if (i==2){
					System.out.print("�������������ȡ��");
					break;
				}
			}
			i++;
			
		}
		
		
		
		//Ҫ�� ��һ��ѭ����ֱ�������Σ���*��ɣ���ӡ�����
		
		//�ص㣺������ο��ƻ��С�
		
		int i=1;
		int j=0;
		while (i<=7){
			System.out.print("*");
			j++;//
			if (j==i) {
				System.out.println();
				j=0;//ÿ��һ�������֧��Ҫִ��һ��
				i++;//i++д�������棬��������㻻�б�׼����j��=i�Ϳ��Խ����*���һֱִ����ȥ��
			}
			
			
		}
		
		
		//2/1+3/2+5/3+8/5+13/8+......ǰ��ʮλ
		int i=2;//���ӳ�ʼֵ
		int j=1;//��ĸ��ʼֵ��
		int sum=0;//�����ܺ�
		int m=0;//�м������
		int n=1;//����ѭ������
		while (n<=20){
			int k=0;
			k=i/j;//�����һ�����ʽ
			sum=sum+k;
			m=i+j;//��һ��ķ�ĸ
			j=i;
			i=m;//�������ǽ�����һ��������滻��
			n++;
		}
		System.out.println(sum);
		
		*/
		
		
		
	}
}
