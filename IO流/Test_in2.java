package IO��;

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
		
		//һ��һ���ַ��Ķ�̫������Ҫ�������ķ�����������������%%%%%%%%%%%%

		char[] arr = new char[3];//����������ڽ���ȡ�����ݴ��������С�===========һ���Զ�ȡ5����
		
		//���ص��Ƕ����˶��ٸ��ַ��ĳ��ȣ��������ٷ��ض��٣�С�ڵ������鳤�ȣ�����������&&&&&&&&&&&&&&&&
		int len = fReader.read(arr);//������������飡����=======ֻҪ����ֵ����-1����ô��֤����ȡ�����ַ���====����֮��ŵ������С������������п��ܻ����ظ����֣�
	    
		
		
		System.out.println(len);
		
		 while ((len = fReader.read(arr))!=-1) //��fReader.read())==-1��ʱ��˵����ȡ�� �����һλ��
			{
				System.out.println(new String(arr));//ʹ��String�Ĺ��췽�����������е��ַ�����ƴ�ӳ�һ���ַ�����====
				/**
				 * ����ط���һ��ϸ�ڣ�����Ҫ��ȡ���ļ�����asdfg����ַ������Ǵ���������ĳ�����4����ô�����ʱ�򣬽����������
				 * asdf
				 * gsdf
				 * Ϊʲô�ڶ��ж������sdf�������ַ��أ���Ϊ�ڵڶ��ζ�ȡ��ʱ���ǽ�g��ԭ�����е�a���ǵ��ˣ�����û�н���ߵĸ��ǵ���
				 * ������ƴ���ַ��Ĺ��췽������Ҫʹ��========new String (char[] arr,int a,int b);����
				 * new String (arr,0,len);
				 * int a������ĵ�һ������������λ�ã����������Ҳ���Ǵ��㿪ʼ��
				 * int b ������ָ��������ĳ��ȡ�
				 * 
				 * 
				 * */
		}
		fReader.close();
		

	}

}
