package IO��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_in3 {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * readLine���������ڶ�ȡ��ʱ�򣬶������һ�������Ҫѭ��һ����ô��Ҫ�ȹر�Ȼ���ٶ�ȡ
	 * 
	 * readLine�����������ʱ����System.out.println(br.readLine());���������һ��һ�������������������������
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fReader = new FileReader("C:\\Users\\Administrator\\Desktop\\123.txt");
		BufferedReader br = new BufferedReader(fReader);
		String  str ;
		while ((str=br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();//�ر���һ����Դ�Ϳ����ˣ���Ϊ�����Reader�ļ�ǿ�档
	}

}
