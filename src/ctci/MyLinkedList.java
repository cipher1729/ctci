package ctci;

public class MyLinkedList {

	
	LinkedListNode head=null;
	public LinkedListNode addElement(Object data)
	{
		if(head==null)
		{
			head = new LinkedListNode();
			head.data = data;
			head.next = null;
		}
		else
		{
			LinkedListNode temp = head;
			while(temp.next!=null)
				temp=temp.next;
			LinkedListNode tempNode = new LinkedListNode();
			tempNode.data = data;
			tempNode.next= null;
			temp.next = tempNode;
		}
		return head;
		
	}
	
	public void printAllElements()
	{
		LinkedListNode temp =  head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp= temp.next;
		}
	}
	
	//equality//
	//works//
	public int compareLL(LinkedListNode head1, LinkedListNode head2)
	{
		LinkedListNode temp1= head1;
		LinkedListNode temp2= head2;
		
		while(temp1!=null && temp2!=null && (temp1.data==temp2.data))
		{
			temp1=temp1.next;
			temp2=temp2.next;
		}
		if(temp1==null && temp2==null)
			return 1;
		else
			return 0;
	}
	
	public void reverseLL(LinkedListNode temp)
	{
		
		if(temp.next==null)
			{
				head = temp;
				return;
			}
		else
		{
			reverseLL(temp.next);
			temp.next.next= temp;
		}
		temp.next = null;
	}
	
	public void mergeTwoLL(LinkedListNode temp1, LinkedListNode temp2)
	{
		MyLinkedList mergedLL = new MyLinkedList();
		
		while(temp1!=null && temp2!=null)
		{
			if((Integer)temp1.data < (Integer)temp2.data)
				{
					mergedLL.addElement(temp1.data);
					temp1=temp1.next;
				}
			else
				{
					mergedLL.addElement(temp2.data);
					temp2 = temp2.next;
				}
			
		}
		
		if(temp1!=null)
		{
			while(temp1!=null)
			{
				mergedLL.addElement(temp1.data);
				temp1= temp1.next;
			}
		}
		else if(temp2!=null)
		{
			while(temp2!=null)
			{
				mergedLL.addElement(temp2.data);
				temp2= temp2.next;
			}
		}
		
		mergedLL.printAllElements();
		
	}
	
	public void pairWiseSwap(LinkedListNode temp)
	{
		LinkedListNode p = temp;
		LinkedListNode q = temp.next;
		LinkedListNode pOld=null;
		//IMP
		head = q;
		while(p.next!=null && q.next!=null)
		{
			
			p.next = q.next;
			
			if(pOld!=null)
				pOld.next= q;
			else
				pOld=p;
			
			//q.next= p;
			p=p.next;
			//IMP
			if(p!=null)
			q=p.next;
		}
		
	}
	
	//WORKS//
	public void swap2elements(Object data1, Object data2)
	{
		LinkedListNode prev1 = null, prev2=null;
		LinkedListNode p = head, q=head;
		
		while(p.data!=data1)
		{
			prev1=p;
			p=p.next;
			
		}
		
		while(q.data!=data2)
		{
			prev2=q;
			q=q.next;
			
		}
		
		//take head cases
		if(prev1==null)
			head=q;
		if(prev2==null)
			head=p;
		
		prev1.next=q;
		prev2.next=p;
		
		//swap p's next and q'next
		LinkedListNode temp = p.next;
		p.next = q.next;
		q.next = temp;
		
		
	}
	
}
