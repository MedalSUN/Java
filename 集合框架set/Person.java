package 集合框架之Set;


/*
 * Object是所有类的超类，即父类，这个类的对象有几个方法，需要重写一下
 * 1：toString（）方法    这个方法，默认返回的是对象中所有信息的字符串形式（可以使用默认的体会下），不用使用===对象.toString（）方法。直接写入
 * 对象他就会默认的调用toString方法。===在这里你需要重写来将这个函数内部的输出形式改变一下，
 * 
 * 2：hashCode()方法
 * 		这个方法是HashSet集合框架的主要精髓，集合框架中所存储的对象都是先由集合框架中的hashcode方法来计算出他的哈希值，再由他内部
 * 特定的存储方式来进行存储，Object对象中给定一个默认的hashcode方法，当这个默认的方法无法满足需求的时候就需要重写这个hashcode方法，来满足自己的需求
 * 一般来讲，哈希值相同他的存储的位置是相同的，以此来判断是否有重复录入的现象，但是，当对象的哈希值相同但是对象不同时
 * 他就需要下面的equals方法了
 * 
 * 3：equals()方法
 * 		当前面的哈希值是相同的，但是对象实际上是不同的时候就需要进行此方法的使用，他将会被自动调用去判断这个对象和已经存储进去的具有相同哈希值的
 * 对象到底是不是相同的，如果是相同的，在进行hs.add(new Person("张三",18));的add操作的时候就会报错，即equals方法返回的是一个ture的时候
 * 他就会自动的add成功，如果返回的是false的时候，他将add不成功
 * 
 * 
 * 
 * */




public class Person {
	
	String name;
	int age;
	

	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	

	public String toString() {
		return name +"===="+age;
	}

	
	

	//重写方法
	//hs.add(new Person("张三",18));这个时候调用hashcode（）方法。
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}

	//重写方法
	//hashcode相同那么会再调用equals方法
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//System.out.println(name+"---我被调用了");
		Person p = (Person) arg0;
		return p.name.equals(name) && age==p.age;
		//返回值是ture或者folse
	}
	
}
