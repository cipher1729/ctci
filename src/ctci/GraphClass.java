package ctci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphClass {

	ArrayList<ArrayList<Integer>> neighbours;
	boolean[] visited;
	public GraphClass(int V)
	{
		neighbours = new ArrayList<ArrayList<Integer>>(V);
		//fill up the arraylist
		for(int i=0;i<V;i++)
			neighbours.add(new ArrayList<Integer>());
		visited = new boolean[V];
		
	}
	
	void addEdge(int v, int w)
	{
		neighbours.get(v).add(w);
	}
	
	//depth first search on graph//
	//works//
	public void printDFS(int v)
	{
		for(int i=0;i<visited.length;i++)
			visited[i]= false;
		Stack<Integer> stack = new Stack<Integer>();
		
		visited[v] = true;
		stack.push(v);
		
		while(stack.size()!=0)
		{
			int top= stack.pop();
			System.out.println(top);
			for(int i=0;i<neighbours.get(top).size();i++)
			{
				if(!visited[neighbours.get(top).get(i)])
					stack.push(neighbours.get(top).get(i));
			}
		}
	}
	
	//works//
	//http://www.geeksforgeeks.org/length-of-shortest-chain-to-reach-a-target-word//
	public static int findIfTargetStringCanBeReached(String[] myStrings, String orig, String dest)
	{
		int result = -1;
		//make a queue for BFS
		LinkedList<String> ll = new LinkedList<>();
		ll.add(orig);
		//add source and origin 
		String[] tempArr = new String[myStrings.length+2];
		
		for(int i=0;i<myStrings.length;i++)
			tempArr[i] = myStrings[i];
		tempArr[tempArr.length-2]= orig;
		tempArr[tempArr.length-1]= dest;
		myStrings = tempArr;
		
	
		while(ll.size()!=0)
		{
			String top = ll.getFirst();
			ll.removeFirst();
			if(top.equals(dest))
				{
					result= 1;
					break;
				}
			else
			{
				//iterate over the array and fill all elements which satisfy
				for(int i=0;i<myStrings.length;i++)
				{
					if(checkAdjacent(myStrings[i], top)==1)
						ll.add(myStrings[i]);
				}
			}
			
			//make myStrings smaller
			String[] temp =new String[myStrings.length-1];
			int p=0;
			
			
				for(int i= 0; i< myStrings.length;i++)
				{
					if(!(myStrings[i].equals(top))) 
						temp[p++]= myStrings[i];
				}
				myStrings = temp;
			
		}
		
		return result;
		
	}
	
	public static int checkAdjacent(String one, String two)
	{
		int res=0;
		for(int i=0;i<one.length();i++)
		{
			if(one.charAt(i)!=two.charAt(i))
				res++;	
		}
		return res;
	}
	
	
	
}
