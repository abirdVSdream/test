package math;

import java.util.Scanner;

public class TowerOfHanoi 
{

	public static void main(String arg[])
	{
		System.out.println("input you nunber");
		Scanner innun = new Scanner(System.in);
				int n = innun.nextInt();
		System.out.println("The moves are:");
		movedisks(n,'A','B','C');
		
	}
	
  public static void movedisks(int n,char fromTower,char toTower,char suxTower)
  {
	  if(n==1)
	  {
		  System.out.println("move disk1 "+n+" from "+fromTower+" to "+toTower);
	  }else{
		  movedisks(n-1,fromTower,suxTower,toTower);
		  System.out.println("move disk2 "+n+" from "+fromTower+" to "+toTower);
		  movedisks(n-1,suxTower,toTower,fromTower);}
	  
  }
}
