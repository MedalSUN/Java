package IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test_file {

	/**
	 * File��===��ȡ�ļ���Ϣ
	 * 
	 * ====ע��ɾ���ķ���
	 * f.delete();���Ӧ���Ǹ��ӡ�ע���ܽᡣ
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		//��Ҫ�����Ķ�����й������������������File�����������������·����������ָ����ļ��������ļ���
		File f = new File("D:\\123.txt");
		System.out.println(f.exists());//���false
		
		f.createNewFile();//����һ���ļ����������û�е��ļ�===����ֵtrue����false==����Ѿ������ˣ���ô�Ͳ����ٴ����ˣ����ǲ����ٸ����ˣ���
		��ʱ���ķ���ֵ��false
		
		
		//����һ���µ��ļ���===//����ֵ��boolean
		f.mkdir();
		//
		f.isDirectory();//���Ƿ���һ���ļ���
		
		*/
		
		
		
		/*
		 * ��������ļ���=======����ļ���Ƕ�ף��и�Ŀ¼
		 * f.mkdirs();
		 * 
		 * */
		
		
		
		/*
		File f = new File("C:\\Users\\Administrator\\Desktop\\a\\b\\c");
		
		//��ȡ�����ļ�����===���ص���f������
		System.out.println(f.getName());
		
		
		//����·��D:\\a\\s\\d\\f========�����̷�
		System.out.println(f.getAbsolutePath());
		//���·��û�еĻ��ͷ��صľ��Ե�·��========���·����������ڹ���project��·����
		//f.getPath();
		
		
		 * 
		 * ɾ���ļ�====����ɾ��һ���ļ��������ļ��У����ǵ��ļ��в�Ϊ�յ�ʱ������ɾ��====
		 * ɾ���˳���·������ʾ���ļ���Ŀ¼�������·������ʾһ��Ŀ¼�����Ŀ¼����Ϊ�ղ���ɾ���� 
		 * 
		 * �����ϱߵ�Ŀ¼c�ļ�������ǿյ���ô�Ϳ��Խ�c�ļ���ɾ����������滹�ж������Ǿ�û�취ɾ����
		 * 
		 * �������ָ�����һ���ļ���ʱ�����ǿ���ɾ���ġ�
		
		System.out.println(f.delete());//����ֵboolean
		
		*/
		
		
		
		/*
		 * 
		 * ��ȡ�ļ����е����ļ�������========ע��ֻ�ܻ�ȡ��һ��====ע��ֻ�ǻ�ȡ���ļ�����
		 * 
		 * 
		
		File f = new File("C:\\Users\\Administrator\\Desktop\\a\\b\\c");
		
		String[] fs = f.list();
		for (String name : fs)
		{
			System.out.println(name);
		}
		*/
		
		/*
		 * ��ȡ�ļ����е���һ����ļ�����File=========���ص����ļ�����file����ȡ֮����Զ��ļ�����������
		 * ����ֵ��File
		 * 
		 * 	
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\a");
		File[] fs1 = f1.listFiles();
		for (File name : fs1)
		{
			System.out.println(name);
		}
		*/
		
		/*
		 * 
		 * ��ȡĿ���ļ������޸�ʱ��====�Ǻ�����
		 * 
		 * */
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\a");
		long time = f1.lastModified();
		System.out.println(time);
		Date date = new Date(time);
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
	}

}
