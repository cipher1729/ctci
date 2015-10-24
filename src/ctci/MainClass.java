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
/*		for(int j=0;j<retArr.length;j++)
		{
			System.out.print(retArr[j] + " ");
		}*/
		
		/*People people[] = {new People(65,100),new People(70,150), new People(56,90), new People(75,190), new People(60,95), new People(68,110)};
		SearchUtils.tallestFormationSort(people);*/
		
		int[] myArr={5,8,10,11,12,3,4};
		System.out.println(SearchUtils.searchInSortedArray(myArr, 0, 6));
	}
	
	
	
}
