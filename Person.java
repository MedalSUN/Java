package 封装教学;

//=========================封装！！！！！！！！！！！！

public class Person {

	
	/*
	 * 面向对象的三大特性之一
	 * 封装
	 * ====由来：属性为public的时候，在测试类中直接使用对象名点属性名就可以给对象的属性赋值，但是有些属性需要进行一些安全性上的判断，
	 * 如：在Person实体类中   有一个有参构造方法用于属性初始赋值，作为程序的赋值的入口。如果还有一个自我介绍的方法 showinfo（）作为结果的出口，
	 * 在测试类中创建Person对象的时候，如果直接使用构造方法进行赋值，age需要进行验证，如age=-33.安全性得不到保障，
	 * 而在验证age的合法性的时候应该在程序的赋值的入口，而不是结果的出口进行验证，所以应该在构造函数中进行验证。
	 * 
	 * 你虽然使用了构造方法进行判断，但是他的属性依然是暴露在外界，外界仍然可以通过对象名点属性进行赋值，这会造成很大的安全隐患，仍然无法对赋值进来的age
	 * 进行合法性判断。Person one = new Person("张三",22);one.name="李四";System.out.println(one.name);
	 * 上述代码，虽然使用了构造函数，但是仍然可以通过对象名点属性进行赋值，age无法判断。
	 * 
	 * 
	 * 改进，对属性进行private修饰，将其封装起来，只是暴露几个接口供外界使用，同时，将一些验证条件都放在这些接口中，在这里，接口就是那些set，get方法
	 * （此时不需要写带参数的构造方法进行属性赋值）外界对属性进行赋值就只能通过这些接口，唯一，安全！！！
	 * 
	 * 
	 * 
	 * 
	 * 对于封装的属性，实体类提供一个接口，用于操作类进行操作，赋值和取值，
	 * 
	 * 第一：安全性，不把细节暴露给外界，他的属性在外界不是随意可以调用，即对象名点方法名是无效的。
	 * 
	 * */
	
	//属性全部由public转变成private。
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//封装的作用之一就是减少了传值的不安全性，在赋值的过程中进行判断age是否符合逻辑，
		
		if (age<=1) {
			age=1;
		}
		this.age = age;
	}
	
	
	
	//************赋值的入口===============在将属性都private之后就不能使用带参数的构造方法了。
	public Person(String name,int age){
		//需要更加注意的是，构造函数也是属性的操作接口，他也可以直接的操作属性，对他进行赋值。！！！！！
		
	    if (age<=0) {
	    	this.age = 1;
		}else {
			this.age = age;
		}
		this.name = name;
	}
	
	
	
	//***********结果的出口
	public void showInfo(){
		System.out.println("我叫"+name+", 我今年"+age+"岁了");
	}
	

}
