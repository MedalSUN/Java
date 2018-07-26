package 集合框架TreeSet进行排序;

import java.util.Comparator;

public class StudentComparator implements Comparator{

	
	
	public int compare(Object arg0, Object arg1) {
	
		Student s1 = (Student) arg0; 
		Student s2 = (Student) arg1; 
		return s1.age-s2.age;
	}
	
	
	

}
