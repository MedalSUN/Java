package IO��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	
	/*
	 * ���������
	 * 
	 * FileReader
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args)  {
		
		
		//����������
		FileReader fReader = null;
		int c = 0;
		try {
			fReader = new FileReader("C:\\Users\\Administrator\\Desktop\\123.txt");//������������൱���Ǵ�������ļ�
			
			 //fReader.read();====����ط����ص��Ƕ�ȡ�ַ��ı���ֵ��int���ͣ�
			 while ((c=fReader.read())!=-1) //��fReader.read())==-1��ʱ��˵����ȡ�� �����һλ��
				{
					System.out.println((char)c);
			}
			 /*	
			  * 
			  * ���������;�������쳣����catch���ˣ��ǾͲ���ִ�е���һ��������Ӧ��������catch��������finally��顣
			  * 
			fReader.close();//==================�ڲ�������IO��֮��һ��Ҫ��ס�ر�������========�൱���ǰ�����ļ��ر���
			//fReader.read();=========�����IO�쳣������Ϊ�Ѿ��ر����ļ������Ա���Ҫ�رա�
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//+++++++++++==========+++++++++++ע�⣺finallyģ�鶼�϶�Ҫִ�У�ǰ�߲�����û��return(��ʾ��������������)����Ҫִ�С�finally��һ��ֻ���������һЩ��־��Ϣ���͹ر���Դ��
		//��Դ������ζ���Ҫ�رյģ�����д��finally�������
		finally {
			try {
				
				//��ǰ�ߵĴ���FileReaderû�д����ɹ���ʱ������û��close�����ֱ��ִ��close��ô�ͻᱨ��������Ҳ��һ���쳣
				if (fReader != null) {
					fReader.close();//����ط����쳣�Ͳ���Ҫ�ٷŽ�ǰ�ߵ�try catch���ˡ�
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		/*���˭�Ͱ�˭��·��д��ȥ�����������Σ��ļ�·����
		red()����һ�ζ�һ���ַ�����ת����AsscII����
		һ���ַ�һ���ַ��Ķ�
		System.out.println(a);//���ص�������    ====System.out.println((char)a);//���ص����ַ�
		Դ�ļ�������ж���ַ�����Ҫ����ѭ����ȡ������������ʱ�򣬷���ֵ��-1*/
		
		/*==========ע�����Ҫ��һ�����������н���fReader.read()��ֵ������
		System.out.println()�о���Ҫ����System.out.println((char)(fReader.read()));
		���������Ŷ��������е����ݡ������ȡĿ���ļ������ĸ��ַ�����ô���ʹ�����ַ�ʽ�ͻ�ֻ���������ַ�������������������
		*/
		
		
		
		
		
	}

}
