
public class Array {

	public static void main(String[] args) {
		double arr[] = {3.4,5,3,3.5,2.2,1.9,2};
		int [] [] arry = new int[5][6];
		int [] x ={1,2};
		arry[0]=x;
		System.out.println(arry[0][1]);
		
		sorByIn(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		sortByChoose(arr);
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	
	}
	public static void sortByChoose(double []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			double tem = arr[i];
			int index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>tem)
				{
					tem = arr[j];
					index = j;
				}
			}
			if(index !=i)
			{
				arr[index] = arr[i];
				arr[i] =tem;
			}
		}
	}
	public static void sorByIn(double [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			double tem = arr[i];
			int index;
			for(index=i-1;index>0 &&arr[index]>tem;index--)
			{
				arr[index+1] =arr[index];
			}
			arr[index+1] = tem;
		}
	}

}
