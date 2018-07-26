package ���Ͽ��֮TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import ���Ͽ��TreeSet��������.StudentComparator;

/*
 * TreeSet ��һ������ļ���
 * ���ڼ����н����ж�˳���ʱ������Ҫ����ʹ��compareto����
 * 
 * hashSet����ʹ��hashcode�����жϵģ�������ʹ��compareto�������жϵġ�
 * �����Ҫ�ض�˳�򣬾Ϳ��Խ�����дcompareTo������
 * 
 * �������ݽṹ�Ƕ�������
 * 
 * ****����ʹ�����ַ���***������Ҫ��ʵ�ֱȽϵķ������������û�а취ʹ��TreeSet����������������������������
 * 
 * ����˳���ŷŵ�ʱ�����������������
 * һ��ʹ��ʵ��comparable�ӿ�ǿ�ж�ʵ������ÿ����Ķ���������������������򱻳�Ϊ�����Ȼ������� compareTo ��������Ϊ������Ȼ�ȽϷ�����
 * 		1���ڶ���ʵ������ʵ��comparable�ӿ�	�����߸�����Ҫ��comparaTo������дһ�Σ�		
 * 		2����test�������������add��ʱ���ɶ����Զ����õ�
 * 
 * �������� set ʱ�ṩ�� Comparator �������򣬾���ȡ����ʹ�õĹ��췽��(����һ���µĿ� TreeSet��������ָ���Ƚ����������򡣲��뵽�� set ������Ԫ�ض������ܹ���ָ���Ƚ��������໥�Ƚ�)
 * 		1������һ��comparator���Ƚ������࣬ʵ�֣�implements�� comparator�ӿ�
 * 		2����Test�д���TreeSet��ʱ�򽫡�TreeSet ts = new TreeSet(new StudentComparator());	�����Ƚ����ӽ�TreeSet��
 * 		3:��ʱ�ڽ���add��ʱ�����ıȽϽ��Զ�������д�ıȽ����еķ�����		
 * ����Ƚ�����
 * */



public class Test {

	
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(new Student("����", 12));
		ts.add(new Student("����", 13));
		ts.add(new Student("����", 11));
		ts.add(new Student("����", 16));
		ts.add(new Student("����", 10));
		
		
		for (Iterator it = ts.iterator();it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
		
	}
}
