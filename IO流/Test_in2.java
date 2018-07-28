package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test_in2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		FileReader fReader = new FileReader("C:\\Users\\Administrator\\Desktop\\123.txt");
		
		//一个一个字符的读太慢，需要多个多个的分批传进来！！！！%%%%%%%%%%%%

		char[] arr = new char[3];//这个数组用于将读取的数据存在数组中。===========一次性读取5个。
		
		//返回的是读到了多少个字符的长度，读到多少返回多少，小于等于数组长度！！！！！！&&&&&&&&&&&&&&&&
		int len = fReader.read(arr);//这个参数是数组！！！=======只要返回值不是-1，那么就证明读取到了字符。====读了之后放到数组中。！！！！（有可能会有重复出现）
	    
		
		
		System.out.println(len);
		
		 while ((len = fReader.read(arr))!=-1) //当fReader.read())==-1的时候，说明读取到 了最后一位。
			{
				System.out.println(new String(arr));//使用String的构造方法，将数组中的字符进行拼接成一个字符串。====
				/**
				 * 这个地方有一个细节，例如要读取的文件中有asdfg五个字符，但是创建的数组的长度是4，那么输出的时候，将会输出两行
				 * asdf
				 * gsdf
				 * 为什么第二行多出来了sdf这三个字符呢，因为在第二次读取的时候，是将g把原数组中的a覆盖掉了，但是没有将后边的覆盖掉。
				 * 所以在拼接字符的构造方法中需要使用========new String (char[] arr,int a,int b);方法
				 * new String (arr,0,len);
				 * int a是数组的第一个代码点的索引位置，在这个题中也就是从零开始的
				 * int b 是用于指定子数组的长度。
				 * 
				 * 
				 * */
		}
		fReader.close();
		

	}

}
