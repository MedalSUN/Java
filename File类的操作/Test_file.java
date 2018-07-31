package IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test_file {

	/**
	 * File类===获取文件信息
	 * 
	 * ====注意删除的方法
	 * f.delete();这个应该是个坑。注意总结。
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		//与要操作的对象进行关联。这个操作对象是File括号里面的所包含的路径的最终所指向的文件，或者文件夹
		File f = new File("D:\\123.txt");
		System.out.println(f.exists());//输出false
		
		f.createNewFile();//创建一个文件，创建这个没有的文件===返回值true或者false==如果已经存在了，那么就不会再创建了，就是不会再覆盖了！！
		此时他的返回值是false
		
		
		//创建一个新的文件夹===//返回值是boolean
		f.mkdir();
		//
		f.isDirectory();//看是否是一个文件夹
		
		*/
		
		
		
		/*
		 * 创建多个文件夹=======多个文件夹嵌套，有父目录
		 * f.mkdirs();
		 * 
		 * */
		
		
		
		/*
		File f = new File("C:\\Users\\Administrator\\Desktop\\a\\b\\c");
		
		//获取的是文件名称===返回的是f的名称
		System.out.println(f.getName());
		
		
		//绝对路径D:\\a\\s\\d\\f========带着盘符
		System.out.println(f.getAbsolutePath());
		//相对路经没有的话就返回的绝对的路径========相对路经就是相对于工程project的路径。
		//f.getPath();
		
		
		 * 
		 * 删除文件====可以删除一个文件，或者文件夹，但是当文件夹不为空的时候，则不能删除====
		 * 删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则该目录必须为空才能删除。 
		 * 
		 * 例如上边的目录c文件夹如果是空的那么就可以将c文件夹删除，如果里面还有东西，那就没办法删除，
		 * 
		 * 当最后所指向的是一个文件的时候，他是可以删除的。
		
		System.out.println(f.delete());//返回值boolean
		
		*/
		
		
		
		/*
		 * 
		 * 获取文件夹中的子文件的名称========注意只能获取子一层====注意只是获取的文件名称
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
		 * 获取文件夹中的子一层的文件对象。File=========返回的是文件对象file，获取之后可以对文件对象做操作
		 * 返回值是File
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
		 * 获取目标文件最后的修改时间====是毫秒数
		 * 
		 * */
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\a");
		long time = f1.lastModified();
		System.out.println(time);
		Date date = new Date(time);
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
	}

}
