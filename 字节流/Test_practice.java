package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_practice {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int r = bis.available();
		System.out.println(r);
		byte[] b = new byte[r];
		int res ;
		
		
		
		
		FileOutputStream fos = new FileOutputStream("D:\\123.text");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while ((res = bis.read(b))!=-1) {
			
			bos.write(b);
			
		}
		bos.close();
		fos.close();
		
		
	}

}
