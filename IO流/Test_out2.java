package IO��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_out2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {	
		FileWriter fw =null;
		fw = new  FileWriter("C:\\Users\\Administrator\\Desktop\\abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("qqqq");
		bw.newLine();//��ǿ���������Ļ��в���������
		bw.write("qdddd");
		bw.flush();
			
		
		
		
		
		/*
		 * ��һ���ļ����Ƶ�D�̵ĸ�Ŀ¼�±ߡ�
		 * 
		 * 
		 * 
		 * 
		
		
			FileReader fr;
			BufferedReader br = null;
			String str;
			FileWriter fw;
			BufferedWriter bw = null;
			try {
				fr = new FileReader("C:\\Users\\Administrator\\Desktop\\abc2.txt");
				br = new BufferedReader(fr);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				fw = new FileWriter("E:\\abc2.txt");
				bw = new BufferedWriter(fw);
				while ((str = br.readLine()) != null) {
					fw.write(str);
					fw.flush();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			*/

		}
		
		
		
		
		
		
		
		
		
		

	}


