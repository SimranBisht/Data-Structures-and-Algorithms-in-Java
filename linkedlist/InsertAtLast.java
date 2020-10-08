package linkedlist;

public class InsertAtLast {

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
			System.out.println("Linked List is empty");
		else {
			ListNode current = head;
			while (current.next!=null)
			{
				current = current.next;
			}
			current.next = newNode;
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
		InsertAtLast ial = new InsertAtLast();
		ial.head = new ListNode(5);
		ial.insert(10);
		ial.insert(15);
		ial.insert(20);
		
		ial.display();
	}
}
