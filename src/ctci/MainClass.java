package ctci;


//heap class does not work

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	
	public static void main(String[] args)
	{
		TreeClass treeClass = new TreeClass();
		TreeNode head = treeClass.insertIntoTree(null, 10);
		treeClass.insertIntoTree(head, 7);
		treeClass.insertIntoTree(head, 6);
		treeClass.insertIntoTree(head, 9);
		treeClass.insertIntoTree(head, 8);
		treeClass.insertIntoTree(head, 100);
		treeClass.insertIntoTree(head, 99);

		TreeClass treeClass2 = new TreeClass();
		TreeNode head2 = treeClass2.insertIntoTree(null, 10);
		treeClass2.insertIntoTree(head2, 7);
		treeClass2.insertIntoTree(head2, 6);
		treeClass2.insertIntoTree(head2, 9);
		treeClass2.insertIntoTree(head2, 8);
		treeClass2.insertIntoTree(head2, 100);
		treeClass2.insertIntoTree(head2, 99);
		treeClass2.insertIntoTree(head2, 103);
		
		
	 	System.out.println(treeClass.equalTrees(head, head2));
		//treeClass.printPreOrder(head);
		
	}
	
	
	
}
