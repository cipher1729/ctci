package ctci;

public class FibonnaciRecursion {

	public static int findFib(int x)
	{
		if(x==1) return 1;
		if(x==0) return 0;
		else
			return( findFib(x-1) + findFib(x-2));
		
	}
}
