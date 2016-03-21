package testDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestRandom 
{
	public static void main(String [] args)
	{
		
		Random rd = new Random();
		List list = new ArrayList();
		for(int i = 0;i <= 10;i++)
		{
			list.add(rd.nextInt(10000));
		}
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}
