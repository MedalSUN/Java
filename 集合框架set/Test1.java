package ���Ͽ��֮Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class Test1 {

	/*
	 * HashSet----������Ԫ���ظ����Ҳ���֤����˳��(��ϣ�㷨����֮��ͻ�ı������˳��)
	 * ���Թ�ϣ�㷨Ϊ����ʵ�ֵġ�
	 * ��ArrayList��ͬ��ArrayList���ж��Ƿ���Ԫ���ظ���ʱ����Ҫ�����е�Ԫ�ؽ��б���һ�Σ�Ȼ����ȥ�ж��Ƿ����ظ����֡�
	 * ��HashSet���ж��Ƿ����ظ����ֵ�ʱ�����ǽ�����ȥ�Ķ���ʹ���ڲ�����Ĺ�ϣ�㷨������ض���ֵ�����ڲ��ᶨ�����ֵ����ĳһ���ض��ĵ�ַ��
	 * �������ط��Ѿ����˾ͻ�ó��������Ѿ������������
	 * ������ͬ�����Ǽ�������Ĺ�ϣֵ��ͬ��ʱ����Ҫʹ��equlas�������ж��Ƿ��ٲ�����������ж��Ƿ��ظ�����һ����������
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(new Person("����",18));
		hs.add(new Person("����",12));
		hs.add(new Person("����",11));
		hs.add(new Person("����",18));
		hs.add(new Person("����",15));
		
		
		//set ���Ͽ��ֻ��ͨ�����������б�����û��get�����������޷�ͨ���±������б�����
		
		for (Iterator it = hs.iterator();it.hasNext(); ) {
			
			Person p = (Person) it.next();
			System.out.println(p+"------"+p.hashCode());
			
		}
	}

	


}
