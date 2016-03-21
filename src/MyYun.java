import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyYun {
	 public static void main(String[] args) {  
         Scanner scanner = new Scanner(System.in);  
         System.out.print("请输入总人数：");  
        int totalNum = scanner.nextInt();  
        System.out.print("请输入报数的大小：");  
         int cycleNum = scanner.nextInt();  
         myYun(totalNum, cycleNum);  
     }  
	
	public static void myYun(int totel, int cum)
	{
		List<Integer> all = new ArrayList<Integer>();
		for(int i=1;i<=totel;i++)
		{
			all.add(i);
		}
		//从K开始计算
		int k = 0;
		while(all.size()>0)
		{
			
			k = k+cum;
			//第K人的索引
			k = k%(all.size())-1;
			//判断是否是队尾
			if(k<0)
			{
//				System.out.println("all:" +all.toString());
//				System.out.println("size:" +all.size());
				System.out.println(all.get(all.size()-1));
				all.remove(all.size()-1);
				k=0;
			}
			else
			{
				System.out.println(all.get(k));
				all.remove(k);
			}
			
		}
	}

}
