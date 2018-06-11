package 继承教学;

/*
 * 1：通过extends关键字，将会继承父类，除了私有的之外的所有的属性和方法（但是可以通过父类提供的set，get方法来调用这些私有方法）super.getName()//或者是this.getName()
 * 将有共同特性的属性方法，抽取出来，作为一个父类。
 * 2：子类可以在继承的基础上进行扩展。
 * 3：调用方法的时候，对象调用的方法，要现在子类中去寻找，如果找不到，则去父类中寻找。
 *   子类中与父类中方法完全相同，我们称之为是对父类的方法的重写。重写就是覆盖。
 *   注意=====重载和重写的区别！！！重载是在同一个类中，方法名相同但是参数不同返回值类型也可以不一样，重写是在一个继承关系中的两个类中，方法完全相同。
 * 4：Java属于单继承，他可以有n个子类，但是一个子类只能有一个父类。
 * 
 * 5：构造方法能不能被继承？？？？？：======super（）仔细看一下，，通过super来调用父类的方法。
 * 	不能！！！  不用被继承，因为在继承的时候子类执行的时候就会直接调用父类的构造方法了，=====先调用父类的构造方法，再调用子类的构造方法。
 * 初始化子类的时候，会默认调用父类的无参的构造方法！！！！如果父类里面没有无参的构造方法，此时必须得使用super！！！====&*****
 * 
 * 6：super代表的是父类对象，super（）是构造方法
 * super.方法==代表的是调用父类的方法。
 * super必须写在最上边，表示最先执行。
 * 
 * */



public class Animal {
	
	private String name;
	private String color;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void run(){
		System.out.println("动物会跑");
	}
	
	public void sing(){
		System.out.println("动物会唱歌");
	}
	
	
	
	

}
