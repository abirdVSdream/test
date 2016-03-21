package math;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 * 计算文件下所有路径的大小
 */
public class DirectorySize 
{
 public static long getSize(File file)
 {
	 long size = 0;
	 if(file.isDirectory())
	 {
		 File[] files = file.listFiles();
		 for(int i = 0;i < files.length;i++)
		 {
			 size+=getSize(files[i]);
		 }
	 }
	 else{
		 size += file.length();
	 }
	 return size;
 }
 //获取当前目录下的所有文件路径
 public static void getrold(File file)
 {
	 if(file.isDirectory())
	 {
		 File[] files = file.listFiles();
		 for(int i = 0;i<files.length;i++)
		 {
			 System.out.println(files[i]);
			 //System.out.println(files[i].toString());
		 }
		 
	 }
 }
 //获取当前路径下所有文件的文本内容
 public static void readAngWrite(File file) throws IOException
 {
	 if(file.isDirectory())
	 {
		 File[] files = file.listFiles();
		 for(int i = 0;i<files.length;i++)
		 {
			 System.out.println(files[i]);
			 DataInputStream input = new DataInputStream(new FileInputStream(files[i].toString()));
			 while(input.available()!= 0)
			 {
				 System.out.println(input.readLine());
			 }
			 System.out.println();
		 }
		 
	 }
	 
 }
 public static void main(String arg[]) throws IOException
 {
	 System.out.println("Enter your directory or a file");
	 Scanner input = new Scanner(System.in);
	 String directory = input.nextLine();
	 System.out.println(getSize(new File(directory))+"byte");
	 readAngWrite(new File(directory));
 }
}
