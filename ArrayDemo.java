package ccec.edu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	/**
	 * 1�������������ڴ�ռ䣬�Ǳ����ļ���
	 * 2�����ͬ���͵�����
	 * 3ͨ���±������ʴ�0��ʼ��������
	 * 4�����ʱ���ȷ���˴�С�����ܸı�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		
		//int[] age=new int[10];?????��Ҳ�ԣ�����������
		//int ages[];//ֻ�ǽ��ж��壬���˸���������û���������Ŀռ�
		
		int ages[] = new int[10]; //ͨ��new������һ���ռ䣬���ڴ��л��ֳ���һ��ռ䡣 
		ages[0]=1;//�������һ����ֵ
		
		
		String array[]={"","",""};
		String array2[]=new String[]{"","","","",""};//�����ֶ��巽ʽ��ͬ�����ϱߵıȽϼ��
		
		
		//************test1
		//����ʮ���˵ĳɼ����������У�����������
		int score[]=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<score.length;k++){
			System.out.println("�������"+(k+1)+"��ѧ���ĳɼ�");
			score[k]=scan.nextInt();
		}
		for(int i=0;i<score.length;i++){
			System.out.println("��"+(i+1)+"��ѧ���ĳɼ�Ϊ"+score[i]);
		}
		
		
		//************test2
		
		 
		double money[]=new double[4];
		Scanner scan=new Scanner(System.in);
		double sum=0;
		for(int k=0;k<money.length;k++){
			System.out.print("�������"+(k+1)+"�ʹ�����:"+"\t");
			money[k]=scan.nextDouble();
			sum=sum+money[k];
		}
		System.out.print("���");
		System.out.println("\t"+"������");
		for(int i=0;i<money.length;i++){
			System.out.print(i+1);
			System.out.println("\t"+money[i]);
		}
		System.out.print("�ܽ��");
		System.out.println("\t"+sum);
		
		
		
		
		
		//���ַ����ң������Ƚ�������sort==========�������ڲ�����������û��������֣�û�о��Ǹ����о����������������������Ƚ�������
		
		
		
		//************test3
		//�������飬���ĺ͵�һ��Ԫ�ػ�������С�ĺ����һ��Ԫ�ػ����������
		
		int score[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<score.length;k++){
			System.out.println("�������"+(k+1)+"����");
			score[k]=scan.nextInt();
		}
		Arrays.sort(score);
		int f=0;
		f=score[0];
		score[0]=score[4];
		score[4]=f;
		for(int i=0;i<score.length;i++){
			System.out.println("���ú�ĵ�"+(i+1)+"����Ϊ"+score[i]);
		}
		
		
		
		//************test4
		//�༶����ʮ��ѧ������ѧԱ�������洢�������У����в����Ƿ��и�ѧ����
		
		String student[]=new String[4];
		Scanner scan=new Scanner(System.in);
		for(int k=0;k<student.length;k++){
			System.out.println("�������"+(k+1)+"��ѧ��");
			student[k]=scan.next();
		}
		System.out.println("������������ҵ�ѧԱ��������");
		String name = scan.next();
		for(int i=0;i<student.length;i++){
			if(i!=student.length-1){//����û�в��ҵ����һ����ʱ��
				if (student[i].equals(name)) {
					System.out.println("��ѧԱ�ڴ˰�");
					break;
				}else {
					continue;
				}
			}else {//�����һ����ʱ��
				if (!student[i].equals(name)) {
					System.out.println("δ�ҵ�");
					break;
				}else {
					System.out.println("��ѧԱ�ڴ˰�");
					break;
				}
			}
		}
		
		*/	
		
		//************test5
		//��������֪���飬���кϲ�����������С�
		
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
		System.out.println("�ϲ�ǰ������arr1Ϊ");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("�ϲ�ǰ������arr2Ϊ");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("�ϲ��������Ϊ");
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		
		
		
		
	}

}
