package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SetListPerformaceTest 
{
	public static void main(String [] args)
	{
		Collection<Integer> set = new HashSet<Integer>();
		System.out.println("set has"+ getTestTime(set,500000) + "s" );
		
		Collection<Integer> lHSet = new LinkedHashSet<Integer>();
		System.out.println("LinkHashSet has" + getTestTime(lHSet,500000) + "s" );
		
		Collection<Integer> tSet = new TreeSet<Integer>();
		System.out.println("treeSet has"+ getTestTime(tSet,500000) + "s" );
		
		Collection<Integer> list = new ArrayList<Integer>();
		System.out.println("ArrayList has"+ getTestTime(list,60000) + "s" );
		
		Collection<Integer> linkedList = new LinkedList<Integer>();
		System.out.println("LinkedList has"+ getTestTime(linkedList,60000) + "s" );
		
	}
	public static long getTestTime(Collection<Integer> c,int size)
	{
		long startTime = System.currentTimeMillis();
		List <Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < size;i++)
			list.add(i);
		
		Collections.shuffle(list);
		
//		long tem = System.currentTimeMillis();
//		System.out.println(tem-startTime);
		for(int element: list)
			c.add(element);
		
		Collections.shuffle(list);
		
		for(int element : list)
			c.remove(element);
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
		
		
	}
}
