package linkedlist;

public class SinglyLinkedList {

	ListNode head;
	
	static class ListNode{
		ListNode next;
		int data;
		ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public void display()
	{
		ListNode current = head;
		while (current != null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if (head == null)
			return 0;
		else {
			int count = 0;
			ListNode current = head;
			while (current != null)
			{
				count++;
				current = current.next;
			}
			return count;
		}
	}
	
	public void insertFirst (int value)       //to insert nodes in the beginning 
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int value)         //to insert nodes at last
	{
		ListNode newNode = new ListNode(value);
		if (head == null)
			head = newNode;
		else
		{
			ListNode last = head;
			while (last.next != null)
			{
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public boolean searchKey(int value)           //to search a given node
	{
		if (head == null)
			return false;
		else {
			ListNode current = head;
			while (current != null)
			{
				if (current.data == value)
				{
					return true;
				}
				current = current.next;
			}
			return false;
		}
	}
	
	public ListNode reverse()                     //to reverse a linked list
	{
		if (head == null)
			return head;
		else {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while (current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
		}
	}
	
	public ListNode getMiddleNode()          //to find middle node in the linked list
	{
		if (head == null)
			return null;
		 
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while (fastPtr !=null && fastPtr.next!=null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public ListNode getNthNodefromEnd(int n)                 //to find given nth node from the last
	{
		if (head == null)
			return null;
		if (n<=0)
			throw new IllegalArgumentException("Invalid value");
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while (count < n)
		{
			if (refPtr == null)
				throw new IllegalArgumentException(n+" is greater than number of nodes in the list");
			refPtr = refPtr.next;
			count++;
		}
		while (refPtr != null)
		{
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	public void removeDuplicates(ListNode head)              //to remove duplicates from the given sorted linked list
	{
		System.out.println("HELLO");
		if (head == null)
		{
			System.out.println("Head is null");
			return;
			
		}
			ListNode current = head;
		while (current!=null)
		{
			if (current.data == current.next.data)
				current.next = current.next.next;
			else
				current.next = current.next;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll1 = new SinglyLinkedList();
		sll1.head = new ListNode(10);
		ListNode second1 = new ListNode(1);
		ListNode third1 = new ListNode(8);
		ListNode fourth1 = new ListNode(11);
		
		sll1.head.next = second1;
		second1.next = third1;
		third1.next = fourth1;
		
				
		//sll.insertFirst(1);
		//sll.insertFirst(2);
		
		//sll.insertLast(1);
		//sll.insertLast(2);
		//sll.insertLast(100);
		//sll.insertLast(10);

		//sll1.removeDuplicates(sll1.head);
		
		SinglyLinkedList sll2 = new SinglyLinkedList();
		sll2.head = new ListNode(1);
		ListNode second2 = new ListNode(1);
		ListNode third2 = new ListNode(1);
		ListNode fourth2 = new ListNode(1);
		ListNode fifth2 = new ListNode(8);
		ListNode sixth2 = new ListNode(10);
		ListNode seventh2 = new ListNode(10);
		sll2.head.next = second2;
		second2.next = third2;
		third2.next = fourth2;
		fourth2.next = fifth2;
		fifth2.next = sixth2;
		sixth2.next = seventh2;
		System.out.println("Linked List before removing duplicates");
		sll2.display();
		System.out.println("Linked list after removing duplicates");
		sll2.removeDuplicates(sll2.head);
		sll2.display();
		
		
		if(sll1.searchKey(4))
			System.out.println(" Seach key found ");
		else
			System.out.println(" Search key not found");
		
		sll1.display();
		
		System.out.println("Reversed Linked List");
		ListNode reversed = sll1.reverse();
		sll1.head = reversed;
		sll1.display();
		
		ListNode middleNode = sll1.getMiddleNode();
		System.out.println("Middle Node = "+middleNode.data);
		
		System.out.println("Length = "+sll1.length());
		
		ListNode NthNodefromEnd = sll1.getNthNodefromEnd(1);
		System.out.println("nth node from the end = "+NthNodefromEnd.data);
		
		
		
		
	}
}
