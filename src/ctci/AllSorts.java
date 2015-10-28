package ctci;

public class AllSorts {

	//simple merge sort
	//working
	public static int[] mergeSort(int[] arr, int i, int j)
	{
		int mid=(i+j)/2;
		if(j-i==0)
			{
				int[] retArr = new int[1];
				retArr[0]= arr[i];
				return retArr;
			}
		else 
		{
			int[] arr1 = mergeSort(arr,i, mid);
			int[] arr2 = mergeSort(arr,mid+1,j);
			int [] result= mergeArrays(arr1,arr2);
			return result;
		}
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2)
	{
		int[] resArray = new int[arr1.length+arr2.length];
		int p=0;
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length)
		{
			resArray[p++] = (arr1[i]<arr2[j]) ? arr1[i++] : arr2[j++];
		}
		if(i<arr1.length)
		{
			for(int k=i;k<arr1.length;k++)
				resArray[p++] = arr1[k];
		}
		else if(j<arr2.length)
		{
			for(int k=j;k<arr2.length;k++)
				resArray[p++] = arr2[k];
		}
		return resArray;
	}
	
}
