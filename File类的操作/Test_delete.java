package IO;

import java.io.File;


public class Test_delete {

	/**
	 * @param args
	 * 
	 * ɾ��һ���ļ����е����е��ļ������ǲ�ɾ���ļ���
	 * 
	 */
	public static void main(String[] args) {
		
		//ע��ݹ�һ��Ҫ�н���������
		
		String str = "C:\\Users\\Administrator\\Desktop\\a1";
		File f = new File(str);
		deleteFile(f);
	}
	
	public static void deleteFile(File f){
		
		boolean flag = f.isDirectory();
		if (flag) {//˵�������һ���ļ���
			File[] files = f.listFiles();//�����Ŀ¼����һ�����е��ļ��зŽ�����
			if (files != null) {//˵�������ж���
				for (int i = 0; i < files.length; i++) {
					String path = files[i].getAbsolutePath(); 
					File pf = files[i].getParentFile();
					boolean flag1 = files[i].delete();
					if (flag1) {
						deleteFile(pf);
					}else {
						f = new File(path);
						deleteFile(f);
					}
					
				}
			}else {//�ļ�������û�ж���
					File pf = f.getParentFile();
					f.delete();
					if ("C:\\Users\\Administrator\\Desktop".equals(pf.getAbsolutePath())) {
						return;
					}else {
						deleteFile(pf);
					}
			}
		}
		else {
			f.delete();
		}
	}
	
	

}
