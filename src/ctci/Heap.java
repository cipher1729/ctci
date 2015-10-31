package ctci;

public class Heap {
	
	//max Heap
	
	static int[] arr = null;
	static int lastPos=0;
	
	public static void init(int size)
	{
		//because we are not going to fill up 0th element
		if(arr==null)
			arr= new int[size];
	}
	public static void insert(int data)
	{
		arr[lastPos++] = data;
		int pos=lastPos-1;
		while(data > arr[pos/2]  && pos>0)
		{
			int temp= arr[pos/2];
			arr[pos/2]= arr[pos];
			arr[pos]= temp;
			pos=pos/2;
		}
	}
	
	public static void printHeap()
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	public static void heapSort()
	{
		int [] sortedArr = new int[arr.length];
		//i am assuming i have it created once. Since it is original max heap, biggest element is at top
		int p=arr.length-1;
		
		while(p!=0)
		{
			sortedArr[p--]= arr[1];
			deleteOneElement();
			heapify(0);
			
		}
		for(int i=0;i<sortedArr.length;i++)
			System.out.println(sortedArr[i]);
		
		
	}
	
	public static void heapify(int idx)
	{
		int left= (2*idx+1 <arr.length) ? 2*idx+1: -1;
		int right=(2*idx+2 <arr.length) ? 2*idx+1: -1;
		
		
		if(left==-1)
		{
			if(right==-1)
				return;
			else if(arr[right] > arr[idx])
				swap(idx, right);
		}
		else if(right==-1)
		{
			if(left==-1)
				return;
			else if(arr[left] > arr[idx])
				swap(idx, left);
		}
		else if((arr[idx]> arr[left] && arr[idx]>arr[right] ))
			return;
		if(left< arr.length && left!=-1 && right!=-1 && arr[left] > arr[idx] )
		{
			swap(left, idx);
		}
		if(right < arr.length && left!=-1 && right!=-1 && arr[right] > arr[idx] )
		{
			swap(right, idx);
			heapify(right);
		}
		else
			heapify(left);
	}
	
	public static void deleteOneElement()
	{
		int[] newArr = new int[arr.length-1];
		newArr[0] = arr[arr.length-1];
		for(int i=1;i<newArr.length;i++)
		{
			newArr[i]= arr[i];
		}
		arr= newArr;
	}
	
	public  static void swap(int index1, int index2)
	{
		int temp= arr[index1];
		arr[index1] = arr[index2];
		arr[index2]=  temp;
	}
	
	

}
