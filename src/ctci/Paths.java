package ctci;

public class Paths {

	public static int minSumToDest(int[][] arr, int i, int j, int sum, int m,int n)
	{
		//boundary case
		if(i>m || j>n)
			return sum*1000;
		//reached dest case
		else if(i == m && j==n)
			return  sum+ arr[i][j];
		else
		{
			int minPath1 = minSumToDest(arr, i+1, j+1, arr[i][j]+ sum,m,n);
			int minPath2= minSumToDest(arr, i+1, j, arr[i][j]+ sum, m,n);
			int minPath3= minSumToDest(arr, i, j+1, arr[i][j]+ sum, m,n);
			
			/*System.out.println(i + " " +j+" "+ minPath1);
			System.out.println(i + " " +j+" "+minPath2);
			System.out.println(minPath3);
			System.out.println();*/
			return min( minPath1, minPath2, minPath3);
		}
			
		
	}
	
	public static int min(int x, int y, int z)
	{
		
		int temp= x;
		if(temp>y) temp=y;
		if(temp>z)
			temp=z;
		return temp;
	}
	
	public static void printAllCombos(int k, int n)
	{
		if (k==0)
				return;
		for(int diff=1;diff<=k;diff++)
		{
			System.out.println(diff);
			printAllCombos(k-diff, n);
		}
	}
	
	
	public static int findPath(int a, int b, int x, int y)
	{
		if((a > x) && (a-b) <x)
			return 0;
		else if((a<x) && (a+b) >x)
			return 0;
		else if((b>y) && (a-b <y))
			return 0;
		else if((b<y) && (a+b >y))
			return 0;
		else
			{
					if( findPath(a+b,b,x,y)==1 ||
				( findPath(a,a+b,x,y)==1)||
				(findPath(a-b,b,x,y)==1)||
				(findPath(a,a-b,x,y)==1))
				return 1;
			  else
				  return 0;
			}
	}
	
}
