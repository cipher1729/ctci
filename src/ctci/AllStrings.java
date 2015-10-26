package ctci;

public class AllStrings {

	public static void printAllStrings(char arr[], int k, int length)
	{
		if(k==(length-1))
		{
			System.out.println(arr);
		}
		else
		{
			
			for(int i=k;i<length;i++)
			{
				
				swap(arr, k,i);
				printAllStrings(arr,k+1,length);
				swap(arr,k,i);
			}
		}
	}
	
	public static void reverseString(char[] arr)
	{
		for(int i=0;i<(arr.length-1)/2;i++)
		{
			swap(arr,i,arr.length-2-i);
		}
	}
	public static void swap(char arr[], int i, int j)
	{
		char temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	
	//8.5: print all possibilities of brackets, not sure if totally correct
	public static void printAllBrackets(char[] arr, int l, int r, int k)
	{
		if(r==0)
			{
				System.out.println(arr);
				return;
			}
		else if(l>0)
		{
			arr[k]='(';
			printAllBrackets(arr, l-1, r, k+1);
		}
		if(r>l)
		{
			arr[k]=')';
			printAllBrackets(arr, l, r-1, k+1);
		}
	}
}

