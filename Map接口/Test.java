package Map�ӿ�;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Test {

	/*
	 * Map
	 * �����ڣ�����Ŀ�����
	 * ����ƺ���������ʱ�������֪��������������ͣ����������Դ���ȥһ��Map���ں����ڲ�����ʹ��keyֵ��valueֵ�����������͵�ƥ�䣡��������
	 * 
	 * 
	 * HashMap ���ڹ�ϣ��Ļ�����ʵ�ֵ�
	 * 
	 * 1��HashMap<k,v>��k��v��ӳ���ϵ�����е�key�ǲ������ظ��ģ�valueֵ�����ظ�===[keyֵ��ʹ�õĹ�ϣ�㷨�������ǲ������ظ���]
	 * 		==����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
	 * 2:ĳЩӳ�������ȷ��֤��˳�򣬱���TreeMap�࣬������Щӳ���򲻱�֤��˳�򣬱���˵HashMap��
	 * 
	 * 
	 * */
	
	/* remove()����������ֵ��valueֵ����һ������ɾ����ʲôֵ������Keyֵɾ��valueֵ��
	 ====String value = map.remove(1);���value���ó�Ϊ��˽�*/
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		map.put(4, "����");
		map.put(5, "����");
		
		/*//��ϰһ����һ������
		boolean flag = map.containsValue("����");
		if (flag) {
			for (int i = 0; i < map.size(); i++) {
				String value = map.get(i);
				if ("����".equals(value)) {
					map.put(i, "�߾�");
				}
			}
			System.out.println("�޸������");
		}else {
			System.out.println("������valueΪ���޵�ֵ");
		}
		System.out.println(map);
		
		*/
		/* //��ϰ�����ڶ�������
		 boolean flag = map.containsValue("����");
		if (flag) {
			Set set = map.entrySet();
			for (Iterator it = set.iterator();it.hasNext();) {
				Entry en = (Entry) it.next();
				int k = (Integer) en.getKey();
				String value = (String) en.getValue();
				if ("����".equals(value)) {
					map.put(k, "�߾�");
				}
			}
			}else {
			System.out.println("������valueΪ���޵�ֵ");
		}
		System.out.println(map);
			
		
		*/
		
		/*
		 * ����Map�е�Ԫ�ص�һ��������
		 * ��α���HashMap�е�ֵ��
		 * 1��ʹ��KeySet������ȡ����ֵ����ͼ=====ע���������ͼֻ�����еļ�ֵ
		 * 2��ʹ�õ��������б�����
		 * 3���ڽ��е�����������ʱ����ʹ��get����������ÿһ����ֵ����Ӧ��valueֵ��
		 * 
		 * 
		Set set = map.keySet();//��������Map�в���ʹ�ã�����ʹ��set�ĵ���������
		for (Iterator it = set.iterator();it.hasNext();) {
			int i =  (Integer) it.next();
			String str = map.get(i);
			System.out.println(i+"====="+str);
		}
		*/
		
		/*
		 *  ����Map�е�Ԫ�صڶ���������=====****������ʹ�����ֱ�����ʽ��������
		 * ʹ��entrySet����һ��ӳ���ϵ����ͼ��
		 * Set<Map.Entry<K,V>> entrySet()
		 * ����������л���getKey��������getValue����
		 * 
		 *  */
		
		Set set = map.entrySet();
		//����ֱ��������set��ͼ������ʹ�õ��������е��������System.out.println(set);
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			int k = (Integer) en.getKey();
			String value = (String) en.getValue();
			System.out.println(k+"====="+value);
		}

		
		
		
		/*
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		String str = "adxfrfgrhhgmjg";
		
		char a =0;
		for (int i = 0; i < str.length(); i++) {
			  a = str.charAt(i);
			if (map2.containsKey(a)) {
				int count =(int) map2.get(a);
				
				map2.put(a, ++count);//count++��++count��һ���������ǰ�ߣ���ô�����ȫ��һ����Ϊ��ֱ�ӷŽ�ȥ����û�н������㣬
			}else {
				map2.put(a, 1);
			}
			} 
		System.out.println(map2);
		
		
		Set set = map2.entrySet();
		int temp = -1;
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			if ((Integer)en.getValue() == 2){	
				int num = str.indexOf( (Character)en.getKey());
				if (temp==-1||num<temp) {
					temp=num;
				}
			}
		}
		if (temp==-1) {
			System.out.println("û��");
		}else {
			System.out.println(str.charAt(temp));
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}


