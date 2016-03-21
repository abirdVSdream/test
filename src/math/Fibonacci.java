package math;

import java.util.Scanner;
//ì³²¨ÄÇÆõº¯Êý0,1,1,2,3,5£¬¡£¡£¡£
public class Fibonacci
{
	public static void main(String arg[])
	{
		System.out.println("Please input you nummer:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The result of "+n+"\0is: "+fibonacci(n));
		System.out.println("The result of "+n+"\0is: "+fibonacci2(n,1,1));
		System.out.println("The result of "+n+"\0is: "+fibonacci3(n));
		
	}
	//ÆÕÍ¨µÝ¹é
 public static long fibonacci(int index)
 {
	 if(index==0)
	 {
		 return 0;
	 }else if(index==1)
	 {
		 return 1;
	 }else{
		 return fibonacci(index-1)+fibonacci(index-2);
	 }
 }
 
 //Î²µÝ¹éÊµÏÖ
 public static long fibonacci2(int n,int num1,int num2)
 {
	if(n==0)
	{
		return 0;
	}else if(n>0 && n<2)
	{
		return num1;
	}else{
		return fibonacci2(n-1,num2,num1+num2);
	}
		 
 }
 //·ÇµÝ¹é
public static long fibonacci3(int n)
 {
	 long current = 1;
	 long next = 1;
	 if(n==0)
	 {
		 return 0;
	 }else if(n>0 &&n<2)
	 {
		 return 1; 
	 }else{
		 for(int i=2;i<=n;i++)
		 {
			 long tp = current+next;
			 current=next;
			 next=tp;
			 System.out.println(current+","+next);
		 }
		 return current;
	 }
 }
}
