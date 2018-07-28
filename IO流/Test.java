package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	
	/*
	 * 输入输出流
	 * 
	 * FileReader
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args)  {
		
		
		//输入流对象
		FileReader fReader = null;
		int c = 0;
		try {
			fReader = new FileReader("C:\\Users\\Administrator\\Desktop\\123.txt");//建立流对象就相当于是打开了这个文件
			
			 //fReader.read();====这个地方返回的是读取字符的编码值（int类型）
			 while ((c=fReader.read())!=-1) //当fReader.read())==-1的时候，说明读取到 了最后一位。
				{
					System.out.println((char)c);
			}
			 /*	
			  * 
			  * 但是如果中途出现了异常，被catch到了，那就不会执行到这一步，所以应该在所有catch代码后加上finally版块。
			  * 
			fReader.close();//==================在操作完了IO流之后一定要记住关闭流对象。========相当于是把这个文件关闭了
			//fReader.read();=========会出现IO异常错误，因为已经关闭了文件，所以必须要关闭。
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//+++++++++++==========+++++++++++注意：finally模块都肯定要执行，前边不论有没有return(表示本方法结束运行)，都要执行。finally中一般只是用来存放一些日志信息，和关闭资源等
		//资源无论如何都是要关闭的，所以写在finally代码块中
		finally {
			try {
				
				//当前边的创建FileReader没有创建成功的时候，他就没法close，如果直接执行close那么就会报错。！！！也是一个异常
				if (fReader != null) {
					fReader.close();//这个地方的异常就不需要再放进前边的try catch中了。
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		/*想读谁就把谁的路径写上去（构造器传参，文件路径）
		red()方法一次读一个字符，并转换成AsscII数字
		一个字符一个字符的读
		System.out.println(a);//返回的是数字    ====System.out.println((char)a);//返回的是字符
		源文件中如果有多个字符，需要进行循环读取，当读到最后的时候，返回值是-1*/
		
		/*==========注意必须要找一个变量来进行接收fReader.read()的值否则在
		System.out.println()中就需要进行System.out.println((char)(fReader.read()));
		这样会跳着读输入流中的数据。例如读取目标文件中有四个字符，那么如果使用这种方式就会只出现两个字符！！！！！！！！！
		*/
		
		
		
		
		
	}

}
