package math;

import java.util.Scanner;
/*
 * �ж��ַ����Ƿ�Ϊ���м�ֵ�Գ�(���Ĵ�)
 * ��ananan����
 * sbakabs��
 */
public class ispalaindrome 
{
 public static boolean ispalaindrome(String s)
 {
	 return ispalaindrome(s,0,s.length()-1);
 }
 public static boolean ispalaindrome(String s,int start,int end)
 {
	 if(end<=start)
	 {
		 return true;
	 }else if(s.charAt(start)!=s.charAt(end)){
		 return false;
	 }else{
		 return ispalaindrome(s,start+1,end-1);
	 }
 }
 public static void main(String arg[])
 {
	 //String test = new String("aadddaa");
	 Scanner input = new Scanner(System.in);
	 String s = input.next();
	 System.out.println(s+"\0ispalaindrome:\0"+ispalaindrome(s));
 }
}
