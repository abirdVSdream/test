package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestDataStream 
{
 public static void main(String [] args) throws IOException
 {
	 File file = new File("D:\\hosts\\test.txt");
	 if(!file.exists())
	 {
		 file.createNewFile();
	 }else{
	//��ͨд�������������
	 DataOutputStream  output = new DataOutputStream(new FileOutputStream(file));
	 output.writeChars("hello");
	 output.writeBytes("world");
	 output.writeUTF("lalal");//	 ��������	
	 output.close();
		 
	 //����д��.���������������
	 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
	 BufferedWriter write = new BufferedWriter(new OutputStreamWriter(bos));
	 write.write("hello");
	 write.write("world");
	 write.write("lalal������");
	 write.close();
	 
	 
	 
	 //��ͨ��ȡ
	 DataInputStream input = new DataInputStream(new FileInputStream(file));
	 while(input.available()!=0)
	 {
		 System.out.println(input.readLine());
	 }
	 //�����ȡ
	 BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
	 BufferedReader reader = new BufferedReader(new InputStreamReader(bis));
	 StringBuffer result = new StringBuffer();
	 while(reader.ready())
	 {
		 result.append((char)reader.read());
	 }
	 System.out.println(result.toString());
	 reader.close();
	 bis.close();
	 input.close();
	 }
 }
}
