package 集合框架TreeSet作业;


import java.util.Comparator;

public class MyComparator implements Comparator {

	public int compare(Object arg0, Object arg1) {
		/*ArrayList[] s1 = (ArrayList[]) arg0;
		ArrayList[] s2 = (ArrayList[]) arg1;*/
		String s2 = (String) arg1;
		String s1 = (String) arg0;
		//ArrayList[] a1 = s1;
		//return s1.length-s2.length; 
		return s1.length()-s2.length(); 
	}



}
