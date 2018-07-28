package IO流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_in3 {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * readLine（）方法在读取的时候，读到最后一行如果想要循环一次那么需要先关闭然后再读取
	 * 
	 * readLine方法在输出的时候不能System.out.println(br.readLine());否则，他会隔一行一输出。！！！！！！！！！！
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fReader = new FileReader("C:\\Users\\Administrator\\Desktop\\123.txt");
		BufferedReader br = new BufferedReader(fReader);
		String  str ;
		while ((str=br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();//关闭这一个资源就可以了，因为这个是Reader的加强版。
	}

}
