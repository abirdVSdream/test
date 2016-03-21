package testDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFile 
{
	public static void main(String [] args) throws IOException
	{
		File file = new File("D://hosts");
		File[]files = file.listFiles();
		if(file.exists())
		{
			for(int i=0 ;i<files.length;i++)
			{
				if(files[i].isFile())
				{
					System.out.println(files[i]);
					
					if(files[i].getName().endsWith(".txt"))
					{
						//普通读取
////						FileInputStream input = new FileInputStream(files[i]);
//						DataInputStream ds = new DataInputStream(new FileInputStream(files[i]));
//						while(ds.available()!=0)
//						{
//							System.out.println();
//							System.out.println(files[i].getName()+"文件的内容");
//							System.out.println(ds.readLine());
//							System.out.println();
//						}
////						input.close();
//						ds.close();
						
						
						
						//缓冲读取
						 BufferedInputStream bis = new BufferedInputStream(new FileInputStream(files[i]));
						 BufferedReader reader = new BufferedReader(new InputStreamReader(bis));
						 StringBuffer result = new StringBuffer();
						 while(reader.ready())
						 {
							 result.append((char)reader.read());
						 }
						 System.out.println();
						 System.out.println(files[i].getName()+"文件的内容");
						 System.out.println(result.toString());
						 reader.close();
						 bis.close();
						
					}
				}
				else if(files[i].isDirectory())
				{
					System.out.println();
					System.out.println(files[i]);
					System.out.println();
				}
				
			}
		}
	}
	
}
