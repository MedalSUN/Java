package ���Ͽ��֮TreeSet;



//Ҫ��ʵ�����comparable������ȥдcompareTo����
//�˽ӿ�ǿ�ж�ʵ������ÿ����Ķ���������������������򱻳�Ϊ�����Ȼ������� compareTo ��������Ϊ������Ȼ�ȽϷ�����

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
		
		//age ��׼���洢���Ǹ�������δ�洢��stu.age��Ҫ�Ƚϵ�����
		
		
	}
	
	/*public int compareTo(Object arg0) {
		Student stu = (Student) arg0;
		return name.compareTo(stu.name);
		
		name��һ��String���͵����ݣ�String���͵��������Ѿ�ʵ��implements��comparable�ӿڣ����ԣ�����ֱ�ӵ���comparaTo()
		����
		�ַ����洢��ʱ���ǻ��ֳ��ַ�����������������д洢�ģ������ڽ��бȽϵ�ʱ������ÿһλÿһλ�Ľ��бȽϡ�
		�磺��aaa��=====���淽ʽ��[a,a,a]
		
		
	}*/

	
	

}
