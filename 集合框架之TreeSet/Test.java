package 集合框架之TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import 集合框架TreeSet进行排序.StudentComparator;

/*
 * TreeSet 是一个有序的集合
 * 他在集合中进行判断顺序的时候是需要进行使用compareto方法
 * 
 * hashSet中是使用hashcode进行判断的，这里是使用compareto来进行判断的。
 * 如果想要特定顺序，就可以进行重写compareTo方法。
 * 
 * 他的数据结构是二叉树。
 * 
 * ****不论使用哪种方法***都必须要有实现比较的方法，否则根本没有办法使用TreeSet。！！！！！！！！！！！！！
 * 
 * 进行顺序排放的时候可以有两个方法。
 * 一：使用实现comparable接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 * 		1：在对象实体类中实现comparable接口	（或者根据需要将comparaTo方法重写一次）		
 * 		2：在test中这个方法是在add的时候由对象自动调用的
 * 
 * 二：创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法(构造一个新的空 TreeSet，它根据指定比较器进行排序。插入到该 set 的所有元素都必须能够由指定比较器进行相互比较)
 * 		1：创建一个comparator（比较器）类，实现（implements） comparator接口
 * 		2：在Test中创建TreeSet的时候将【TreeSet ts = new TreeSet(new StudentComparator());	】将比较器扔进TreeSet中
 * 		3:此时在进行add的时候，他的比较将自动调用重写的比较器中的方法。		
 * 这个比较器是
 * */



public class Test {

	
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(new Student("张三", 12));
		ts.add(new Student("李三", 13));
		ts.add(new Student("李四", 11));
		ts.add(new Student("王五", 16));
		ts.add(new Student("李三", 10));
		
		
		for (Iterator it = ts.iterator();it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
		
	}
}
