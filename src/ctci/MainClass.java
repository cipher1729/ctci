package ctci;


//heap class does not work

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	
	public static void main(String[] args)
	{
		MyLinkedList myLinkedList = new  MyLinkedList();
		LinkedListNode head1 = myLinkedList.addElement(1);
		myLinkedList.addElement(2);
		myLinkedList.addElement(5);
		myLinkedList.addElement(7);
		myLinkedList.addElement(8);
		myLinkedList.addElement(11);
		
		MyLinkedList myLinkedList2 = new  MyLinkedList();
		LinkedListNode head2 = myLinkedList2.addElement(0);
		myLinkedList2.addElement(2);
		myLinkedList2.addElement(3);
		myLinkedList2.addElement(4);
		myLinkedList2.addElement(5);
		myLinkedList2.addElement(6);
		
		//myLinkedList2.reverseLL(head2);
		
		//myLinkedList2.printAllElements();
		myLinkedList.swap2elements(2, 8);
		
		myLinkedList.printAllElements();
		//System.out.println(myLinkedList.compareLL(head1, head2));
		
		
		//myLinkedList.printAllElements();
	}
	
	
	
}
