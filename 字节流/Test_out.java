package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_out {

	/**
	 * =============一般情况下往文件中传输东西 使用字符流就可以了
	 * 
	 * 输出字节流
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\123.txt",true);
		
		fos.write("天天".getBytes());//将字符串转换为字节，进行读取，
		//注意不必使用flush方法，输出字节流的时候不用调用flush方法，在write方法中就已经自己调用了flush方法
		
		fos.close();
		
		
	}

}
