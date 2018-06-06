package 封装练习题;

public class Test {

	public static void main(String[] args) {
		Department s1 = new Department();
		s1.setDepartName("销售部门");
		s1.setDepartNum(001);
		s1.showInfo();
		
		Person p1 = new Person();
		p1.setId(00012);
		p1.setName("张三");
		p1.setNum("销售部门");
		p1.showInfo();
	}
}
