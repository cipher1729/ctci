package ctci;

public class TreeClass {
	TreeNode head;
	TreeClass()
	{
		head=null;
	}
	
	
	public TreeNode insertIntoTree(TreeNode temp, int data)
	{
		if(head==null)
		{
			TreeNode tempNode = new TreeNode();
			tempNode.data = data;
			tempNode.left=null;
			tempNode.right=null;
			head =tempNode;
			return head;
		}
		else if(temp==null)
			return null;
		else
		{
			if(data<=temp.data)
				{
					TreeNode resNode= insertIntoTree(temp.left,data);
					if(resNode==null)
					{
						TreeNode tempNode = new TreeNode();
						tempNode.data = data;
						tempNode.left=null;
						tempNode.right=null;
						temp.left= tempNode;
					}
				}
			else
			{
				TreeNode resNode= insertIntoTree(temp.right,data);
				if(resNode==null)
				{
					TreeNode tempNode = new TreeNode();
					tempNode.data = data;
					tempNode.left=null;
					tempNode.right=null;
					temp.right= tempNode;
				}
			}
			return temp;
				
		}
	}
	
	public void printInOrder(TreeNode temp)
	{
		if(temp==null)
			return;
		else
		{
			printInOrder(temp.left);
			System.out.println(temp.data);
			printInOrder(temp.right);
		}
	}
	
	public void printPreOrder(TreeNode temp)
	{
		if(temp==null)
			return;
		else
		{	System.out.println(temp.data);
			printPreOrder(temp.left);
			printPreOrder(temp.right);
		}
	}
	
	public void printPostOrder(TreeNode temp)
	{
		if(temp==null)
			return;
		else
		{	printPostOrder(temp.left);
			printPostOrder(temp.right);
			System.out.println(temp.data);
		}
	}
	
	public void printAllPaths(int k, int[] arr, TreeNode temp)
	{
		//print only at leaf nodes
		if(temp==null)
		{
			return;
		}
		else if(temp.left==null && temp.right==null)
		{
			arr[k]= temp.data;
			for(int i=0;i<3;i++)
			{
				System.out.print(arr[i]);
			}
		}
			
		else
		{
			arr[k]= temp.data;
			printAllPaths(k+1,arr,temp.left);
			System.out.println();
			printAllPaths(k+1,arr,temp.right);
			System.out.println();
		}
	}
	
	//print only paths which sum to node from head
	public int[] sumToNode(int k, int[] arr, TreeNode temp, TreeNode myNode, int sum)
	{
		//print only at leaf nodes
		if(temp==null)
		{
			return null;
		}
		else if(sum == myNode.data)
		{
			/*			//arr[k]= temp.data;
			for(int i=0;i<2;i++)
			{
				System.out.print(arr[i]);
			}*/
			return arr;
		}
			
		else
		{
			arr[k]= temp.data;
			sum+=temp.data;
			int retArr[] = sumToNode(k+1,arr,temp.left, myNode, sum);
			//System.out.println();
			if(retArr!=null)
				return retArr;
			else {
				retArr = sumToNode(k+1,arr,temp.right,myNode,sum);
				return retArr;
			}
			//System.out.println();
		}
	}
	
	public void sumToNodeFromNonHead(TreeNode temp, TreeNode myNode)
	{
		if(temp==null)
			return;
		else
		{
			
		}
	}
	
	
	public static void mirrorTree(TreeNode temp)
	{
		if(temp==null)
			return;
		else
			{
				mirrorTree(temp.left);
				mirrorTree(temp.right);
				TreeNode tempBranch = new TreeNode();
				tempBranch= temp.left;
				temp.left= temp.right;
				temp.right= tempBranch; 
			}
			
	}
	
	
	
	
}
