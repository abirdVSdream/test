import java.util.Random;

public class Test {
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String q="wwww";
		String b="wwwww";
		String r=q+"w";
		System.out.println(r==b);
		System.out.println(r.equals(b));
		System.out.println((-2)>>>1);
		String s="hello";
		change(s,a);
		
		Random ad = new Random();
		Random ad1 = new Random(1);
		for(int i=0;i<10;i++)
		{
			System.out.print(ad.nextInt(1000)+"\b");
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.print(ad1.nextInt(1000)+"\b");
		}
		System.out.println();
		
		System.out.println(s);
		System.out.println(a);
		
		
	}
	public static void change(String s,int A)
	{
		s=s+"kkk";
		a=A+1;
		System.out.println(A);
		System.out.println(a);
	}
	public void chage(Object obj){}
	class c{}

}
