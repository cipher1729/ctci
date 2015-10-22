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
	
	public static void swap(char arr[], int i, int j)
	{
		char temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
}

