import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyYun {
	 public static void main(String[] args) {  
         Scanner scanner = new Scanner(System.in);  
         System.out.print("��������������");  
        int totalNum = scanner.nextInt();  
        System.out.print("�����뱨���Ĵ�С��");  
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
		//��K��ʼ����
		int k = 0;
		while(all.size()>0)
		{
			
			k = k+cum;
			//��K�˵�����
			k = k%(all.size())-1;
			//�ж��Ƿ��Ƕ�β
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
