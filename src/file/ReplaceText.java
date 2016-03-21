package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText
{
 public static void main(String []args) throws IOException
 {
	 if(args.length != 4)
	 {
		 System.out.println("kakakaka");
		 System.exit(0);
	 }
	 File sourceFile =new File(args[0]);
	 if(!sourceFile.exists())
	 {
		 System.out.println("source file "+ args[0] + "not exixt");
		 System.exit(0);
	 }
	 File targetFile = new File(args[1]);
	 if(targetFile.exists())
	 {
		 System.out.println("targetFile file "+ args[1] + "not exixt");
		 System.exit(0);
	 }
	 Scanner input = new Scanner(System.in);
	 PrintWriter out = new PrintWriter(targetFile);
	 while(input.hasNext())
	 {
		 String s1 = input.nextLine();
		 String s2 = s1.replaceAll(args[2], args[3]);
	 }
	 input.close();
	 out.close();
 }
}
