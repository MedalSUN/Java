package 继承教学;

public class Dog extends Animal {

	/*
	 * private String name; private String color; public String getName() {
	 * return name; } public void setName(String name) { this.name = name; }
	 * public String getColor() { return color; } public void setColor(String
	 * color) { this.color = color; } public void run(){ System.out.println("");
	 * } public void sing(){ System.out.println(""); }
	 */
	public Dog(){
		
	}
	
	
	
	/*
	 * 子类可以在继承的基础上进行扩展======扩展！！！！！
	 * */
	public void lookHome(){
		System.out.println("狗会看家");
	}
	
	/*
	 * 调用方法的时候，对象调用的方法，要现在子类中去寻找，如果找不到，则去父类中寻找。
	 * 这个就是重写，即覆盖=======覆盖。
	 * 
	 * */
	public void run(){
		
		
	}
	
	
	
}
