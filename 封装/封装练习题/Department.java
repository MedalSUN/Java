package 封装练习题;

public class Department {

	private String departName;
	private int departNum;
	
	
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public int getDepartNum() {
		return departNum;
	}
	public void setDepartNum(int departNum) {
		this.departNum = departNum;
	}
 
	public void showInfo(){
		System.out.println("部门名称是："+departName+"，部门编号是："+departNum);
	}
	
	
	
}
