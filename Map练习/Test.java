package Map练习;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

	
	public static void main(String[] args) {
		
		/*HashMap map = new HashMap();
		map.put(1, "张三");
		map.put(11, "张三1");
		map.put(12, "张三2");
		map.put(13, "张三3");
		map.put(14, "张三4");
		
		Set set = map.entrySet();//形成映射视图
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			System.out.println(en.getKey()+"----==-----"+en.getValue());
			
			
		}*/
		/*
		 * 
		 * 传进去的value值是一个对象！！！
		HashMap map = new HashMap();
		map.put(1, new Student("张三",11,"二"));
		map.put(11, new Student("张三1",111,"二"));
		map.put(12, new Student("张三2",121,"二"));
		map.put(13, new Student("张三3",131,"二"));
		map.put(14, new Student("张三4",141,"二"));
		
		Set set = map.entrySet();
		for (Iterator it = set.iterator();it.hasNext();) {
			Entry en = (Entry) it.next();
			Student stu = (Student) en.getValue();
			System.out.println(stu.name+"--"+stu.age+"--"+stu.classNum);
			
		}
		*/
		
		
		HashMap map = new HashMap();
		map.put(1, new Products("移动电源", 10, 155.00));
		map.put(2, new Products("移动风扇", 10, 15.00));
		map.put(3, new Products("旅行包", 10, 55.00));
		map.put(4, new Products("洗发液", 10, 255.00));
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan2 = new Scanner(System.in);
		int k =0;
		String result ;
		while (true) {
			System.out.println("请输入要查询的产品编号");
			k = scan.nextInt();
			Products products =  (Products) map.get(k);
			System.out.println("查询的产品信息为："+products.name+"==="+products.num+"==="+products.price);
			
			System.out.println("是否继续查询Y/N：");
			result = scan.next();//这个地方要用next（）方法，否则读不进来
			if ("N".equals(result)) {
				break;
			}
		}
		System.out.println("查询结束");
		
		
		
		
		
		
		
		
		

	}

}
