package ctci;

import java.util.Arrays;

public class StringUtils {

	 public static void printNextLexicoGraphicString(char[] arr)
		{
		 	if(arr.length==1)
		 	{
		 		System.out.println("no answer");
		 		return;
		 	}
		 	
			int p = arr.length-1;
			int k= p-1;
			while(k>=0 && arr[k]>= arr[p]) 
				k--;
			//two cases
	        
			if(k>=0)
			{
				char temp=arr[k];
				arr[k]=arr[p];
				arr[p]= temp;
				System.out.println(arr);
			}
			else
				//nothing was found
			{
	            
				int minDiff= arr[1]- arr[0];
				int nextPos=-1;
				for(int i=1;i<arr.length;i++)
				{
					if(arr[i]- arr[0] < minDiff &&  (arr[i]- arr[0]) >0 )
					nextPos=i;	
				}
	          // System.out.println(nextPos);
				if(nextPos!=-1 && (arr[nextPos]-arr[0])>0)
				{
					//get the next largest number, swap and then sort in increasing remainder
					char temp=arr[0];
					arr[0]=arr[nextPos];
					arr[nextPos]= temp;
					
					//sort
	                 System.out.println("swapped");
					char[] toSortArray = new char[arr.length-1];
	                     
					
					for(int i=1;i<arr.length;i++)
					{
						toSortArray[i-1]= arr[i];
	                    // System.out.println("copied" + toSortArray[i] +"" + arr[i]);
	                   // System.out.println(toSortArray.length);
	                }
	               //System.out.println("about to sort");
					Arrays.sort(toSortArray);
					String newString = new String(toSortArray);
					System.out.println(arr[0]+ newString);
				}
				else
					System.out.println("no answer");
			}
			
		}
	 
	 //http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters//
	 //working//
	 public static void longestCommonUniqueSubstring(char [] arr)
	 {
		 System.out.println("hello");
		 int currLen=0;
		 int maxLen=0;
		 
		 //visited for all characters
		 int[] visited = new int[256];
		 for(int i=0;i<arr.length;i++)
			 visited[arr[i]]=-1;
		 
		 //i have visited the first
		 visited[0]=1;
		 currLen=1;
		 maxLen=1;
		 
		 for(int i=1;i<arr.length;i++)
		 {
			 int prevIndex = visited[arr[i]] ;
			 if(prevIndex == -1 || i-currLen > prevIndex)
				 currLen++;
			 else
			 {
				 currLen= i - prevIndex;
				 if(currLen > maxLen)
					 maxLen= currLen;
			 }
			 
			 visited[arr[i]]=i;
		 }
		 if(currLen > maxLen)
			 maxLen= currLen;
		 System.out.println(maxLen);
	 }
	    
}
