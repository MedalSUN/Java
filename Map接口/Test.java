package Map接口;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Test {

	/*
	 * Map
	 * 常用于，翻译的开发，
	 * 在设计函数方法的时候，如果不知道传入参数的类型，个数。可以传进去一个Map，在函数内部可以使用key值和value值进行数据类型的匹配！！！！！
	 * 
	 * 
	 * HashMap 是在哈希表的基础上实现的
	 * 
	 * 1：HashMap<k,v>（k和v是映射关系）其中的key是不允许重复的，value值可以重复===[key值是使用的哈希算法，所以是不允许重复的]
	 * 		==将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
	 * 2:某些映射可以明确保证其顺序，比如TreeMap类，但是有些映射则不保证其顺序，比如说HashMap类
	 * 
	 * 
	 * */
	
	/* remove()方法，返回值是value值，看一看到底删除了什么值，根据Key值删除value值，
	 ====String value = map.remove(1);输出value，得出为猪八戒*/
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "四娃");
		map.put(2, "大娃");
		map.put(3, "二娃");
		map.put(4, "三娃");
		map.put(5, "六娃");
		
		/*//练习一：第一个方法
		boolean flag = map.containsValue("大娃");
		if (flag) {
			for (int i = 0; i < map.size(); i++) {
				String value = map.get(i);
				if ("大娃".equals(value)) {
					map.put(i, "蛇精");
				}
			}
			System.out.println("修改已完成");
		}else {
			System.out.println("不存在value为大娃的值");
		}
		System.out.println(map);
		
		*/
		/* //练习二：第二个方法
		 boolean flag = map.containsValue("大娃");
		if (flag) {
			Set set = map.entrySet();
			for (Iterator it = set.iterator();it.hasNext();) {
				Entry en = (Entry) it.next();
				int k = (Integer) en.getKey();
				String value = (String) en.getValue();
				if ("大娃".equals(value)) {
					map.put(k, "蛇精");
				}
			}
			}else {
			System.out.println("不存在value为大娃的值");
		}
		System.out.println(map);
			
		
		*/
		
		/*
		 * 遍历Map中的元素第一个方法：
		 * 如何遍历HashMap中的值。
		 * 1：使用KeySet方法获取到键值的视图=====注意出来的视图只是所有的键值
		 * 2：使用迭代器进行遍历。
		 * 3：在进行迭代器迭代的时候，需使用get方法，返回每一个键值所对应的value值。
		 * 
		 * 
		Set set = map.keySet();//迭代器在Map中不能使用，必须使用set的迭代器方法
		for (Iterator it = set.iterator();it.hasNext();) {
			int i =  (Integer) it.next();
			String str = map.get(i);
			System.out.println(i+"====="+str);
		}
		*/
		
		/*
		 *  遍历Map中的元素第二个方法：=====****开发中使用这种遍历方式！！！！
		 * 使用entrySet返回一个映射关系的视图：
		 * Set<Map.Entry<K,V>> entrySet()
		 * 在这个方法中还有getKey（），和getValue方法
		 * 
		 *  */
		
		Set set = map.entrySet();
		//可以直接输出这个set视图，或者使用迭代器进行迭代输出。System.out.println(set);
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
				
				map2.put(a, ++count);//count++和++count不一样，如果是前者，那么结果中全是一，因为你直接放进去，还没有进行运算，
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
			System.out.println("没有");
		}else {
			System.out.println(str.charAt(temp));
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}


