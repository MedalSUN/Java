package ���Ͽ��TreeSet��ҵ;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	/*
	 * ʹ��TreeSet���ַ������бȽ����򲢲������ݣ�Ҫ�����ַ����ĳ��Ƚ��бȽ�
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String one;
		String k;
		TreeSet ts = new TreeSet(new MyComparator()); 
		while(true){
	
			System.out.println("������һ���ַ�����");
			one = scan.nextLine();
			ts.add(one);
			System.out.println("�Ƿ�������������ַ�����Y/N����");
			k = scan.nextLine();
			if ("N".equals(k)) {
				break;
			}
		}
		for (Iterator it = ts.iterator();it.hasNext();) {
			String st = (String) it.next();
			System.out.println(st);
		}

	}

}
