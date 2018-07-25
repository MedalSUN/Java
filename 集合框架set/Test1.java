package 集合框架之Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class Test1 {

	/*
	 * HashSet----不允许元素重复，且不保证迭代顺序(哈希算法更新之后就会改变迭代的顺序)
	 * 是以哈希算法为基础实现的。
	 * 和ArrayList不同，ArrayList在判断是否有元素重复的时候是要将所有的元素进行遍历一次，然后在去判断是否有重复出现。
	 * 而HashSet在判断是否有重复出现的时候，它是将传进去的对象使用内部定义的哈希算法计算出特定的值，它内部会定义这个值放在某一个特定的地址。
	 * 如果这个地方已经有了就会得出集合中已经有了这个对象。
	 * 当对象不同，但是计算出来的哈希值相同的时候，需要使用equlas来进行判断是否再插入这个对象（判断是否重复的下一步操作。）
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(new Person("张三",18));
		hs.add(new Person("李四",12));
		hs.add(new Person("王五",11));
		hs.add(new Person("张三",18));
		hs.add(new Person("张三",15));
		
		
		//set 集合框架只能通过迭代器进行遍历，没有get方法，所以无法通过下标来进行遍历。
		
		for (Iterator it = hs.iterator();it.hasNext(); ) {
			
			Person p = (Person) it.next();
			System.out.println(p+"------"+p.hashCode());
			
		}
	}

	


}
