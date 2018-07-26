package 集合框架TreeSet作业;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	/*
	 * 使用TreeSet对字符串进行比较排序并插入数据，要求按照字符串的长度进行比较
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String one;
		String k;
		TreeSet ts = new TreeSet(new MyComparator()); 
		while(true){
	
			System.out.println("请输入一个字符串：");
			one = scan.nextLine();
			ts.add(one);
			System.out.println("是否继续进行输入字符串（Y/N）：");
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
