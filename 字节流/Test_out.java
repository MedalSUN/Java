package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_out {

	/**
	 * =============һ����������ļ��д��䶫�� ʹ���ַ����Ϳ�����
	 * 
	 * ����ֽ���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\123.txt",true);
		
		fos.write("����".getBytes());//���ַ���ת��Ϊ�ֽڣ����ж�ȡ��
		//ע�ⲻ��ʹ��flush����������ֽ�����ʱ���õ���flush��������write�����о��Ѿ��Լ�������flush����
		
		fos.close();
		
		
	}

}
