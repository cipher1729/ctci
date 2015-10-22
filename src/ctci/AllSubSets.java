package ctci;

public class AllSubSets {

	public static void allSubSets(int [] arr)
	{
		int powerSet = (int) Math.pow(2, (int)arr.length);
		int ndigits = arr.length;
		for(int counter=0;counter<powerSet;counter++)
		{
			
			for(int i=0;i<ndigits;i++)
			{
				if((counter & (1<<i))!=0)
				{
					System.out.print(arr[i]);
				}
				
			}
			System.out.println();
		}
	}
}
