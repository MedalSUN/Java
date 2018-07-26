package 集合框架之TreeSet;



//要先实现这个comparable包才能去写compareTo方法
//此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。

public class Student implements Comparable{
	
	
	String name;
	int age;

	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public int compareTo(Object arg0) {
		Student stu = (Student) arg0;
		return stu.age-age;
		
		//age 是准备存储的那个数，还未存储！stu.age是要比较的数字
		
		
	}
	
	/*public int compareTo(Object arg0) {
		Student stu = (Student) arg0;
		return name.compareTo(stu.name);
		
		name是一个String类型的数据，String类型的数据早已经实现implements了comparable接口，所以，可以直接调用comparaTo()
		方法
		字符串存储的时候是划分成字符，放在数组里面进行存储的，所以在进行比较的时候，他是每一位每一位的进行比较。
		如：“aaa”=====保存方式是[a,a,a]
		
		
	}*/

	
	

}
