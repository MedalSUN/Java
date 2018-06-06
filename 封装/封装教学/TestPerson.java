package 封装教学;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Person one = new Person("张三",22);
		one.name="李四";
		System.out.println(one.name);
		one.showInfo();*/
		
		Person p = new Person("张三",-33);
		//p.age=22;
		//p.setAge(-33);
		//int age= p.getAge();
		//p.setName("张三");
		//String name=p.getName();
		//System.out.println("我叫"+name+", 我今年"+age+"岁了");
		p.showInfo();
		

	}

}
