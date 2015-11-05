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
	
	//insertion sort
	//works//
	public static void insertionSort(int[] arr)
	{
		for(int p=1;p<arr.length;p++)
		{
			
		
		int temp= arr[p];
		while(p-1>=0 && arr[p-1] > temp )
			{
				arr[p]= arr[p-1];
				p--;
			}
		arr[p] = temp;
		
		}
	}
	
	//quick sort//
	//works//
	public static void quickSort(int[] arr, int i, int j)
	{
		if(j-i==0) return;
		int pivot = i;
		int p=i+1;
		int q=j;
		
		
		//equality is to handle the case of 2 elements
		while(p<=q)
		{
			while(arr[p]<arr[pivot] && p<j) p++;
			while(arr[q]>arr[pivot] && q>i) q--;
			if(p<q)
			{
			int temp =arr[p];
			arr[p]= arr[q];
			arr[q]= temp;
			}
			else
			{
				int temp =arr[pivot];
				arr[pivot]= arr[q];
				arr[q]= temp;	
			}
		}
		
		//have to check for boundary conditions here
		if(q-1>=i) quickSort(arr, i, q-1);
		else return;
		
		if(q+i<=j)
		quickSort(arr,q+1,j);
		else return;
	}
	
	
	
}
