package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream
{
  public static void main(String [] args) throws IOException
  {
	  FileOutputStream output = new FileOutputStream("test.txt");
	  for(int i= 0; i<10; i++)
	  {
		  output.write(i);
	  }
	  output.close();
	  FileInputStream input = new FileInputStream("test.txt");
	  while(input.available()!=0){
		  System.out.println(input.read()); 
	  }
	  input.close();
  }
}
