package Map��ϰ;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

	
	public static void main(String[] args) {
		
		/*HashMap map = new HashMap();
		map.put(1, "����");
		map.put(11, "����1");
		map.put(12, "����2");
		map.put(13, "����3");
		map.put(14, "����4");
		
		Set set = map.entrySet();//�γ�ӳ����ͼ
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			System.out.println(en.getKey()+"----==-----"+en.getValue());
			
			
		}*/
		/*
		 * 
		 * ����ȥ��valueֵ��һ�����󣡣���
		HashMap map = new HashMap();
		map.put(1, new Student("����",11,"��"));
		map.put(11, new Student("����1",111,"��"));
		map.put(12, new Student("����2",121,"��"));
		map.put(13, new Student("����3",131,"��"));
		map.put(14, new Student("����4",141,"��"));
		
		Set set = map.entrySet();
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			Student stu = (Student) en.getValue();
			System.out.println(stu.name+"--"+stu.age+"--"+stu.classNum);
			
		}
		*/
		
		
		HashMap map = new HashMap();
		map.put(1, new Products("�ƶ���Դ", 10, 155.00));
		map.put(2, new Products("�ƶ�����", 10, 15.00));
		map.put(3, new Products("���а�", 10, 55.00));
		map.put(4, new Products("ϴ��Һ", 10, 255.00));
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan2 = new Scanner(System.in);
		int k =0;
		String result ;
		while (true) {
			System.out.println("������Ҫ��ѯ�Ĳ�Ʒ���");
			k = scan.nextInt();
			Products products =  (Products) map.get(k);
			System.out.println("��ѯ�Ĳ�Ʒ��ϢΪ��"+products.name+"==="+products.num+"==="+products.price);
			
			System.out.println("�Ƿ������ѯY/N��");
			result = scan.next();//����ط�Ҫ��next���������������������
			if ("N".equals(result)) {
				break;
			}
		}
		System.out.println("��ѯ����");
		
		
		
		
		
		
		
		
		

	}

}
