package linkedlist;

public class InsertAtBeginning {
	ListNode head;
	
	static class ListNode
	{
		ListNode next;
		int data;
		ListNode(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void insert(int d)
	{
		ListNode newNode = new ListNode(d);
		
		if (head==null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void display()
	{
		if (head==null)
			System.out.println("Linked List is empty");
		
		ListNode current = head;
		
		while (current!=null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		InsertAtBeginning iab = new InsertAtBeginning();
		iab.head = new ListNode(5);
		iab.insert(4);
		iab.insert(3);
		iab.insert(0);
		
		iab.display();
	}
}
