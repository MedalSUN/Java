package IO流;

import java.io.FileWriter;
import java.io.IOException;

public class Test_out {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		
		
		//创建输出流对象，如果没有该文件，那么就会直接去创建该文件。如果有，则对他创建输出流对象。
		FileWriter fw = new  FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt");
		
		/*//有一个构造函数方法，加了true试验一下。
		
		FileWriter fw = new  FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt",true);
		注意加了true之后，使用的是FileWriter的构造方法。====
		根据给定的 File 对象构造一个 FileWriter 对象。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
		
		注意：如果去接着写东西，而不是重新写，就要使用这个构造函数，在他的后边写。
		
		*/
		
		/*fw.write("sws2");//这个字符串是写在输出流中的，相当于是打开文件，然后写进去，但是还是没有写进去，需要保存。
		fw.flush();//将输出内容将流刷新，刷入到文件中。相当于保存。
		
		//
		fw.write("swsaaa3");//如果前边的write被注释掉了，那么后边的这个内容就会覆盖前边的那个
		fw.close();//相当于是关闭并且保存=========但是要先flush一下。
*/		
		//使用                       final String SEPARATOR = System.getProperty(line.separator),获取当前系统的换行符。
		  final String SEPARATOR = System.getProperty("line.separator");
		fw.write("=====swsaaa2");
		fw.write("swsaaad1");
		fw.write("swsaa1a");
		fw.write(SEPARATOR);
		fw.write("swsaaa1");
		fw.flush();
		fw.close();
		
		
		
		
		

	}

}
