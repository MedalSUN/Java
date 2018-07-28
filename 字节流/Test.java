package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * 
	 * 前边的是字符流，字符流是依赖于字节流实现的
	 * 
	 * 在进行读取汉字的时候一般不使用字节流来实现，传出来的可能是乱码，因为是按照字节输出的，一个汉字是两个字节。是使用字符流进行读取
	 * 只有在读取，传输   图片 还有音频的时候使用的是字节流，同时字节流要使用加强版的BufferedInputStream.和BufferedOutputStream
	 * 
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
	/*	
	 * 方法一：
	 * 
	 * FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
		
		int res = 0;       //读取的返回值是读取的字节的阿斯克码
		while ((res = fis.read()) != -1) {
			System.out.println("=="+res);
			
		}
		fis.close();*/
		

		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\abc.txt");
		
		
		/*
		 * 注意数组的大小可以控制正好，可以一次输出
		 * 
		 * System.out.println(fis.available());//能输出目标文件的内容的字节大小
		 * 
		 * 
		 * 
		 * byte[] b = new byte[fis.available()];//创建的数组和文件内容字节大小一样
		 * 注意！！！！这个时候就可以一次性输出了，不用循环了！！！
		 * 
		 * */
		
		
		byte[] b = new byte[5];
		//fis.read(b);//========注意内部的参数是byte类型的数组。
		
		int res = 0;
		//注意：此处的res为读到字节的个数，如果返回的是-1，那么就说明读完了，所以判断是否是-1
		while ((res = fis.read(b)) != -1) {
			System.out.println(new String(b, 0, res));//使用String类的构造方法，不会出现重复读取输出的情况。
		}
		
	}

}
