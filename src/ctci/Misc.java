package ctci;

import java.util.Arrays;
import java.util.HashMap;

public class Misc {

	//works//
	public static void findFirstRepeatingElement(int[] arr)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
			hashMap.put(arr[i], 0);
		for(int i=0;i<arr.length;i++)
			{
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			}
		for(int i=0;i<arr.length;i++)
		{
			if(hashMap.get(arr[i])!=1)
				{
					System.out.println(arr[i]);
					break;
				}
		}
		
	}
	
	public static void removeDuplicateElements(int [] arr)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
			hashMap.put(arr[i], 0);
		for(int i=0;i<arr.length;i++)
		{
			hashMap.put(arr[i], hashMap.get(arr[i])+1);
		}
		int p=0;
		for(int i=0;i<arr.length;i++)
		{
				if(hashMap.get(arr[i])!=0)
				{
					arr[p++] = arr[i];
					hashMap.put(arr[i], 0);
				}
		}
		for(int j=0;j<p;j++)
			System.out.println(arr[j]+" ");
		
	}
	
	public static void removeDuplicatesFromString(char[] arr)
	{
		int cnt[] = new int[126];
		for(int i=0;i<126;i++) cnt[i]=0;
		for(int i=0;i<arr.length;i++)
			cnt[arr[i]]++;
		
		int p=0;
		for(int j=0;j<arr.length;j++)
		{
			if(cnt[arr[j]]!=0)
				{
					arr[p++]= arr[j];
					cnt[arr[j]]=0;
				}
		}
		
		for(int i=0;i<p;i++)
			System.out.print(arr[i]);
		
	}
	
	public static void removeDuplicatesNoExtraSpace(int [] arr)
	{
		int [] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			temp[i]= arr[i];
		
		Arrays.sort(temp);
		
		int p=0;
		p++;/// v v important, otherwise will miss first element
		for(int j=1;j<temp.length;j++)
		{
			if(temp[j]!=temp[j-1])
				temp[p++]= temp[j];
		}
		for(int i=0;i<p;i++)
			System.out.print(temp[i]);
	}
	
	public static void removeDuplicatesNoExtraSpaceString(char [] arr)
	{
		char [] temp = new char[arr.length];
		for(int i=0;i<arr.length;i++)
			temp[i]= arr[i];
		
		Arrays.sort(temp);
		
		int p=0;
		p++;/// v v important, otherwise will miss first element
		for(int j=1;j<temp.length;j++)
		{
			if(temp[j]!=temp[j-1])
				temp[p++]= temp[j];
		}
		for(int i=0;i<p;i++)
			System.out.print(temp[i]);
	}
	
}
