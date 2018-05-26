package ccec.edu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	/**
	 * 1数组是连续的内存空间，是变量的集合
	 * 2存放县同类型的数据
	 * 3通过下标来访问从0开始！！！！
	 * 4定义的时候就确定了大小。不能改变
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		
		//int[] age=new int[10];?????这也对？？？？？？
		//int ages[];//只是进行定义，起了个名，但是没有这个数组的空间
		
		int ages[] = new int[10]; //通过new来开辟一个空间，在内存中划分出来一块空间。 
		ages[0]=1;//给数组第一个赋值
		
		
		String array[]={"","",""};
		String array2[]=new String[]{"","","","",""};//这两种定义方式相同，但上边的比较简便
		
		
		//************test1
		//输入十个人的成绩放入数组中，并遍历出来
		int score[]=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<score.length;k++){
			System.out.println("请输入第"+(k+1)+"个学生的成绩");
			score[k]=scan.nextInt();
		}
		for(int i=0;i<score.length;i++){
			System.out.println("第"+(i+1)+"个学生的成绩为"+score[i]);
		}
		
		
		//************test2
		
		 
		double money[]=new double[4];
		Scanner scan=new Scanner(System.in);
		double sum=0;
		for(int k=0;k<money.length;k++){
			System.out.print("请输入第"+(k+1)+"笔购物金额:"+"\t");
			money[k]=scan.nextDouble();
			sum=sum+money[k];
		}
		System.out.print("序号");
		System.out.println("\t"+"购物金额");
		for(int i=0;i<money.length;i++){
			System.out.print(i+1);
			System.out.println("\t"+money[i]);
		}
		System.out.print("总金额");
		System.out.println("\t"+sum);
		
		
		
		
		
		//二分法查找，必须先进行排序sort==========可以用于查找数组中有没有这个数字，没有就是负数有就是正数，！！！！必须先进行排序。
		
		
		
		//************test3
		//输入数组，最大的和第一个元素互换，最小的和最后一个元素互换，并输出
		
		int score[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<score.length;k++){
			System.out.println("请输入第"+(k+1)+"个数");
			score[k]=scan.nextInt();
		}
		Arrays.sort(score);
		int f=0;
		f=score[0];
		score[0]=score[4];
		score[4]=f;
		for(int i=0;i<score.length;i++){
			System.out.println("重置后的第"+(i+1)+"个数为"+score[i]);
		}
		
		
		
		//************test4
		//班级里有十名学生，将学员的姓名存储在数组中，进行查找是否有该学生，
		
		String student[]=new String[4];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<student.length;k++){
			System.out.println("请输入第"+(k+1)+"个学生");
			student[k]=scan.next();
		}
		System.out.println("请输入你想查找的学员的姓名：");
		String name = scan.next();
		for(int i=0;i<student.length;i++){
			if(i!=student.length-1){//当还没有查找到最后一个的时候
				if (student[i].equals(name)) {
					System.out.println("该学员在此班");
					break;
				}else {
					continue;
				}
			}else {//是最后一个的时候
				if (!student[i].equals(name)) {
					System.out.println("未找到");
					break;
				}else {
					System.out.println("该学员在此班");
					break;
				}
			}
		}
		
		*/	
		
		//************test5
		//有两个已知数组，进行合并后的升序排列。
		
		int[] arr1={3,1,23};
		int[] arr2={27,7,2};
		int a=arr1.length+arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int arr3[]=new int[a];
		for (int i = 0; i < arr3.length; i++) {
			if (i<arr1.length) {
				arr3[i]=arr1[i];
			}else {
				arr3[i]=arr2[i-3];
			}
		}
		Arrays.sort(arr3);
		System.out.println("合并前的数组arr1为");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("合并前的数组arr2为");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("合并后的数组为");
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		
		
		
		
	}

}
