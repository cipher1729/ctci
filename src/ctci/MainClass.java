package ctci;


//heap class does not work

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args)
	{
		//int [] arr = {1,3,6,1,2,5};
		//Misc.removeDuplicatesNoExtraSpace(arr);
		String s= "bbbcccddee";
		Misc.removeDuplicatesNoExtraSpaceString(s.toCharArray());
	}
	
	public static void drawStairCase()
	{
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		int tries=-1;
		try {
			String s = reader.readLine();
			tries = Integer.parseInt(s);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int k=tries-1;k>=0;k--)
		{
					
			for(int i=0;i<k;i++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=tries-k;i++)
			{
				System.out.print("#");
			}
			System.out.println();
			
		}
	}
	
	
	public static <T> void printRandom(T temp)
	{
		System.out.println(temp);
	}
	
	public static void PrintAllRoutes()
	{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		int n=-1;
		try {
			String s = reader.readLine();
			int tries = Integer.parseInt(s);
			while(tries!=0)
			{
				//this is the n
				s= reader.readLine();
				n= Integer.parseInt(s);
				//this is the array
				s= reader.readLine();
				
				String[] arr= s.split(" ");
				long pro=1;
				for(int j=0;j<arr.length;j++)
				{
					pro*= Integer.parseInt(arr[j]) % 1234567;
				}
				System.out.println(pro);
				tries--;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void excel(int num)
	{
		 if(num<0)
			    return;
			    num--;
				StringBuilder s =new StringBuilder();
				int aCounter= num;
				aCounter = (aCounter/26);
				
				for(int i=0;i<aCounter;i++)
					s.append('A');
				int rem = (int)num%26;
				char remchar;
				remchar =  (char) ((char)65 + rem);
				s.append(remchar);
				System.out.print(s.toString());
	}
	
	
	public static void mostPleasure(int [][] weights)
	{
		int[][] arr = new int[3][2];
		arr[0][0]=0;
		for(int i=1;i<3;i++)
			arr[i][0] += arr[i-1][0] + weights[i][i-1];
		for(int j=1;j<2;j++)
			arr[0][j] += arr[0][j-1] + weights[j][j-1];
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<2;j++)
				arr[i][j] = (arr[i-1][j] + weights[i-1][j]) > (arr[i][j-1] + weights[i][j-1]) ? (arr[i-1][j] + weights[i-1][j]) :(arr[i][j-1] + weights[i][j-1]);	
		}
		System.out.println(arr[2][1]);
	}
	
}
