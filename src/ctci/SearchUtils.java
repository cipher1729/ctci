package ctci;

public class SearchUtils {

	public static int binarySearch(int arr[], int i, int j, int data)
	{
		int mid = (i  + j)/2;
		if(arr[mid]==data) return 1;
		else if(i>j)
		{
			return -1;
		}
		else
		{
			if(data>arr[mid])
				{	
					return binarySearch(arr, mid+1,j,data);
					
				}
			else
				{
					return  binarySearch(arr, i,mid-1,data);
				}
		}
	}
	
	//search for point where it is sorted
	public static int searchInSortedArray(int arr[], int i, int j)
	{
		
		int mid = (i+j)/2;
		if(arr[mid] < arr[mid-1]  && arr[mid] < arr[mid+1])
			return arr[mid];
		//this is special condition
		//if you find that the array is already sorted, return the first element because you
		//cannot compare with the previous element
		else if(arr[i]< arr[j])
			return arr[i];
		if(i>j)
			return 0;
		if(arr[mid] < arr[i])
		{
			return searchInSortedArray(arr, i, mid-1);
		}
		else
		{
			return searchInSortedArray(arr, mid+1, j);
		}
		
	}
	
	//9.7 using bubble sort
	public static void tallestFormationSort(People[] people)
	{
		//bubble sort
		for(int i=0;i<people.length;i++)
		{
			for(int j=i+1;j<people.length;j++)
			{
				if(people[i].compare(people[j]) ==1)
				{
					People temp;
					temp = people[i];
					people[i] = people[j];
					people[j]=temp;
				}
			}
		}
		for(int i=0;i< people.length;i++)
		{
			System.out.print(people[i].height+" ");
			System.out.print(people[i].weight);
			System.out.println();
		}
	}
}
