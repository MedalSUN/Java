package ��װ��ϰ��;

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
		System.out.println("���ǣ�"+name+"���ҵ�Ա������ǣ�"+id+",�����ڵĲ��ű���ǣ�"+departNum);
		
	}
	
	
	
}
