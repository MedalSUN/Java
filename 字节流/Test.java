package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * 
	 * ǰ�ߵ����ַ������ַ������������ֽ���ʵ�ֵ�
	 * 
	 * �ڽ��ж�ȡ���ֵ�ʱ��һ�㲻ʹ���ֽ�����ʵ�֣��������Ŀ��������룬��Ϊ�ǰ����ֽ�����ģ�һ�������������ֽڡ���ʹ���ַ������ж�ȡ
	 * ֻ���ڶ�ȡ������   ͼƬ ������Ƶ��ʱ��ʹ�õ����ֽ�����ͬʱ�ֽ���Ҫʹ�ü�ǿ���BufferedInputStream.��BufferedOutputStream
	 * 
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
	/*	
	 * ����һ��
	 * 
	 * FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
		
		int res = 0;       //��ȡ�ķ���ֵ�Ƕ�ȡ���ֽڵİ�˹����
		while ((res = fis.read()) != -1) {
			System.out.println("=="+res);
			
		}
		fis.close();*/
		

		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\abc.txt");
		
		
		/*
		 * ע������Ĵ�С���Կ������ã�����һ�����
		 * 
		 * System.out.println(fis.available());//�����Ŀ���ļ������ݵ��ֽڴ�С
		 * 
		 * 
		 * 
		 * byte[] b = new byte[fis.available()];//������������ļ������ֽڴ�Сһ��
		 * ע�⣡���������ʱ��Ϳ���һ��������ˣ�����ѭ���ˣ�����
		 * 
		 * */
		
		
		byte[] b = new byte[5];
		//fis.read(b);//========ע���ڲ��Ĳ�����byte���͵����顣
		
		int res = 0;
		//ע�⣺�˴���resΪ�����ֽڵĸ�����������ص���-1����ô��˵�������ˣ������ж��Ƿ���-1
		while ((res = fis.read(b)) != -1) {
			System.out.println(new String(b, 0, res));//ʹ��String��Ĺ��췽������������ظ���ȡ����������
		}
		
	}

}
