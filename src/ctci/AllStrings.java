package ctci;

public class AllStrings {

	//check substring, recursively
	//http://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
	public static int checkSubsequence(char[] big, char[] small,  int i, int j)
	{
		int res;
		if(j==small.length-1)
			return 1;
		else if(i==big.length-1)
			return 0;
		else if(big[i]== small[j])
		{
			res = checkSubsequence(big, small, i+1, j+1);
			
		}
		else
			res= checkSubsequence(big, small, i+1, j);
		return res;
	}
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
	
	//http://www.geeksforgeeks.org/print-increasing-sequences-length-k-first-n-natural-numbers///
	//works//
	public static void printAllIncreasingSubsequences(int[]arr, int []resArr, int k, int p, int length)
	{
		if(p==length)
		{
			for(int i=0;i<length;i++)
				System.out.print(resArr[i]);
			System.out.println();
		}
		//return if not enough characters are present
		else if(length- p > arr.length-k)
			return;
		
		else
			{
				printAllIncreasingSubsequences(arr, resArr, k+1, p, length);
				resArr[p] = arr[k];
				printAllIncreasingSubsequences(arr, resArr, k+1, p+1, length);
			}
	}
}

