package ���Ͽ��TreeSet��������;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet ��һ������ļ���
 * ���ڼ����н����ж�˳���ʱ������Ҫ����ʹ��compareto����
 * 
 * hashSet����ʹ��hashcode�����жϵģ�������ʹ��compareto�������жϵġ�
 * �����Ҫ�ض�˳�򣬾Ϳ��Խ�����дcompareTo������
 * 
 * �������ݽṹ�Ƕ�������
 * 
 * ����˳���ŷŵ�ʱ�����������������
 * һ��ʹ��ʵ��comparable�ӿ�ǿ�ж�ʵ������ÿ����Ķ���������������������򱻳�Ϊ�����Ȼ������� compareTo ��������Ϊ������Ȼ�ȽϷ�����
 * 
 * �������� set ʱ�ṩ�� Comparator �������򣬾���ȡ����ʹ�õĹ��췽��
 * 
 * */



public class Test {

	
	
	public static void main(String[] args) {
	
		//ʵ�ַ���   public TreeSet(Comparator<? super E> comparator)
		
		//����һ���µĿ� TreeSet��������ָ���Ƚ����������򡣲��뵽�� set ������Ԫ�ض������ܹ���ָ���Ƚ��������໥�Ƚ�
		TreeSet ts = new TreeSet(new StudentComparator());
		
			ts.add(new Student("����", 12));
			ts.add(new Student("����", 13));
			ts.add(new Student("����", 11));
			ts.add(new Student("����", 16));
			ts.add(new Student("����", 10));
		
		System.out.println(ts);
		
		
	}
}
