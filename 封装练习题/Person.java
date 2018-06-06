package 封装练习题;

public class Person {

	private String name;
	private int id;
	private String departNum;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartNum() {
		return departNum;
	}
	public void setNum(String departNum) {
		this.departNum = departNum;
	}
	
	public void showInfo(){
		System.out.println("我是："+name+"，我的员工编号是："+id+",我所在的部门编号是："+departNum);
		
	}
	
	
	
}
