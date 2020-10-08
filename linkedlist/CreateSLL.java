package linkedlist;

public class CreateSLL {
	ListNode head;

	static class ListNode
	{
		ListNode next;
		int data;
		ListNode(int data)
		{
			this.data = data;
		}
	}
	
	void display()
	{
		if (head==null)
			System.out.println("Linked list is empty");
		
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		CreateSLL sll = new CreateSLL();
		sll.head = new ListNode(5);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(20);
		ListNode fifth = new ListNode(25);
		ListNode sixth = new ListNode(30);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		sll.display();
	}
}
