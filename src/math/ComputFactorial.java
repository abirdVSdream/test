package math;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 *����׳�
 */
public class ComputFactorial
{
	public static void main(String arg[])
	{
		System.out.println("Please input you nummer:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The result of factorial\0"+n+"\0is: "+factorial2(n));
		
	}
	//�ݹ�д��
	 public static long factorial(int n)
	 {
		 if(n==0){
			return 1; 
		 }else
		 {
			 return n*factorial(n-1);
		 }
	 }
	 //ѭ��д��
	 public static long factorial2(int n)
	 {
		 long result=1;
		 if(n==0){
			return result; 
		 }else
		 {
			for(int i=1;i<=n;i++)
			{
				result=result*i;
			}
			return result;
		 }
	 }
}
