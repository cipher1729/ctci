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
	
	//depth of tree//
	//working//
	public static int findDepthOfTree(TreeNode temp)
	{
		if(temp==null)
			return 0;
		else return (findDepthOfTree(temp.left) > findDepthOfTree(temp.right)? 1+ findDepthOfTree(temp.left) : 1+ findDepthOfTree(temp.right));
	}
	
	//find minimum depth of tree//
	
		//mindepth of tree//
		//working i guess//
		public static int findMinDepthOfTree(TreeNode temp)
		{
			if(temp==null)
				return 0;
			else return (findDepthOfTree(temp.left) < findDepthOfTree(temp.right)? 1+ findDepthOfTree(temp.left) : 1+ findDepthOfTree(temp.right));
		}
		
		//sum of all left leaves//
		//http://www.geeksforgeeks.org/find-sum-left-leaves-given-binary-tree/
		//not working//
		public static int findLeftLeavesSum(TreeNode temp, int sum)
		{
			//check if left subtree is a leaf
			if(temp.left.left== null && temp.left.right== null)
				{
					return sum + temp.left.data;
				}
			 sum = findLeftLeavesSum(temp.left, sum);
			sum = findLeftLeavesSum(temp.right, sum);
			return sum;
		}
		
		//http://www.geeksforgeeks.org/serialize-deserialize-n-ary-tree/
		//WORKS//
		public static void SerializeTree(TreeNode temp)
		{
			if(temp==null)
				return;
			else
			{
				System.out.print(temp.data+" ");
				SerializeTree(temp.left);
				//if(temp.left!=null && temp.right!=null )
				SerializeTree(temp.right);
				System.out.print(")");
			}
			
		}
		
		//equality of trees//
		//WORKS//
		public static int equalTrees(TreeNode temp1, TreeNode temp2)
		{
				if(temp1==null && temp2==null)
					return 1;
				else if(temp1==null)
					return 0;
				else if(temp2==null)
					return 0;
				int res1 = equalTrees(temp1.left, temp2.left);
				int res2= equalTrees(temp1.right, temp2.right);
				if(res1 == 1 && res2==1)
					return 1;
				else
					return 0;
		}
		
		public static void makeTreeFromInOrderandPreOrder(char[] preOrder, char[] inOrder, int i, int j)
		{
			int mid =(i+j)/2;
			
			TreeClass treeClass = new TreeClass();
			treeClass.insertIntoTree(null, preOrder[0]);
			
		}
	
	
	
}
