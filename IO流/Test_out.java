package IO��;

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
		
		
		
		//����������������û�и��ļ�����ô�ͻ�ֱ��ȥ�������ļ�������У�������������������
		FileWriter fw = new  FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt");
		
		/*//��һ�����캯������������true����һ�¡�
		
		FileWriter fw = new  FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt",true);
		ע�����true֮��ʹ�õ���FileWriter�Ĺ��췽����====
		���ݸ����� File ������һ�� FileWriter ��������ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ����
		
		ע�⣺���ȥ����д����������������д����Ҫʹ��������캯���������ĺ��д��
		
		*/
		
		/*fw.write("sws2");//����ַ�����д��������еģ��൱���Ǵ��ļ���Ȼ��д��ȥ�����ǻ���û��д��ȥ����Ҫ���档
		fw.flush();//��������ݽ���ˢ�£�ˢ�뵽�ļ��С��൱�ڱ��档
		
		//
		fw.write("swsaaa3");//���ǰ�ߵ�write��ע�͵��ˣ���ô��ߵ�������ݾͻḲ��ǰ�ߵ��Ǹ�
		fw.close();//�൱���ǹرղ��ұ���=========����Ҫ��flushһ�¡�
*/		
		//ʹ��                       final String SEPARATOR = System.getProperty(line.separator),��ȡ��ǰϵͳ�Ļ��з���
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
