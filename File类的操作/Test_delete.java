package IO;

import java.io.File;


public class Test_delete {

	/**
	 * @param args
	 * 
	 * 删除一个文件夹中的所有的文件，但是不删除文件夹
	 * 
	 */
	public static void main(String[] args) {
		
		//注意递归一定要有结束条件。
		
		String str = "C:\\Users\\Administrator\\Desktop\\a1";
		File f = new File(str);
		deleteFile(f);
	}
	
	public static void deleteFile(File f){
		
		boolean flag = f.isDirectory();
		if (flag) {//说明这个是一个文件夹
			File[] files = f.listFiles();//将这个目录下子一层所有的文件夹放进数组
			if (files != null) {//说明里面有东西
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
			}else {//文件夹里面没有东西
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
