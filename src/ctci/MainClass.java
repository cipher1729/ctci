package ctci;


//heap class does not work

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args)
	{
		TreeClass treeClass = new TreeClass();
		TreeNode head = treeClass.insertIntoTree(null, 1);
		treeClass.insertIntoTree(head, 0);
		treeClass.insertIntoTree(head, 2);
		treeClass.insertIntoTree(head, 4);
		treeClass.insertIntoTree(head, 5);
		treeClass.insertIntoTree(head, 3);
		System.out.println(treeClass.findMinDepthOfTree(head));
		
	}
	
	
	
}
