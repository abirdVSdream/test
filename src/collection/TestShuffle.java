package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestShuffle 
{
	public static void main(String [] args)
	{
		List<String> list = Arrays.asList("a","b","c","d");
		List<String> list2 = Arrays.asList("a","b","c","d");
//		Collections.shuffle(list);
//		Collections.shuffle(list2);
		System.out.println(list);
		System.out.println(list2);
		Collections.shuffle(list,new Random(22));
		Collections.shuffle(list2,new Random(21));
		System.out.println(list);
		System.out.println(list2);
	}
}
