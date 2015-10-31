package ctci;

public class Sum {

	//http://www.geeksforgeeks.org/largest-sum-contiguous-subarray//
	//working//	
	public static void largestContiguousSum(int[] arr)
	{
		int maxSum=0;
		int currSum=0;
		currSum= arr[0];
		maxSum=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			//if it is beneficial, add 
			if((currSum+arr[i])> 0)
				{
					currSum= currSum+arr[i];
					if(currSum>maxSum)
						maxSum= currSum;
					
				}
			else
			{
				//no longer beneficial,
				//should start new sum
				
				currSum=0;	
			}
		}
		if(currSum> maxSum)
			maxSum = currSum;
		System.out.println(maxSum);
	}
	
	
	/*//TODO//
	http://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/
	public static void largestContiguousIncreasing(int[] arr)
	{
		int currLongest=1;
		int maxLongest=1;
		int maxOfSubArray=arr[1];
		int minOfSubArray=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			//if current is bigger than prev update
			if(arr[i] >prev)
			{
				currLongest++;
				prev=arr[i];
				if(currLongest > maxLongest)
					maxLongest = currLongest;
				
			}
			else
			{
				if(currLongest > maxLongest)
					maxLongest = currLongest;
				currLongest =1;
				prev= arr[i];
			}
		}
		if(currLongest > maxLongest)
			maxLongest = currLongest;
		System.out.println(maxLongest);
	}*/
}
