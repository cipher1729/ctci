package ctci;

public class MainClass {

	public static void main(String[] args)
	{
		TreeClass treeClass = new TreeClass();
		TreeNode head = treeClass.insertIntoTree(null, 3);
		treeClass.insertIntoTree(head, 1);
		treeClass.insertIntoTree(head, 5);
		treeClass.insertIntoTree(head, 2);
		treeClass.insertIntoTree(head, 8);
		int[] arr = new int[3];
		TreeNode treeNode = new TreeNode();
		treeNode.data = 8;
		int[] retArr= treeClass.sumToNode(0, arr, head, treeNode,0);
		for(int j=0;j<retArr.length;j++)
		{
			System.out.print(retArr[j] + " ");
		}
	}
	
	
	
}
