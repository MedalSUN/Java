package 集合框架TreeSet进行排序;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet 是一个有序的集合
 * 他在集合中进行判断顺序的时候是需要进行使用compareto方法
 * 
 * hashSet中是使用hashcode进行判断的，这里是使用compareto来进行判断的。
 * 如果想要特定顺序，就可以进行重写compareTo方法。
 * 
 * 他的数据结构是二叉树。
 * 
 * 进行顺序排放的时候可以有两个方法。
 * 一：使用实现comparable接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 * 
 * 二：创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法
 * 
 * */



public class Test {

	
	
	public static void main(String[] args) {
	
		//实现方法   public TreeSet(Comparator<? super E> comparator)
		
		//构造一个新的空 TreeSet，它根据指定比较器进行排序。插入到该 set 的所有元素都必须能够由指定比较器进行相互比较
		TreeSet ts = new TreeSet(new StudentComparator());
		
			ts.add(new Student("张三", 12));
			ts.add(new Student("李三", 13));
			ts.add(new Student("李四", 11));
			ts.add(new Student("王五", 16));
			ts.add(new Student("李三", 10));
		
		System.out.println(ts);
		
		
	}
}
