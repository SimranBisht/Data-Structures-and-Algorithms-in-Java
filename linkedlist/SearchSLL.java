package linkedlist;

public class SearchSLL {

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
	
	public void search(int d)
	{
		if (head==null)
			System.out.println("Linked List is empty");
		
		ListNode current = head;
		while(current.next!=null)
		{
			if (current.data==d)
				System.out.println(d+" found in Linked List");
			
			current = current.next;
		}
	}
	
	public static void main(String args[])
	{
		SearchSLL s = new SearchSLL();
		s.head = new ListNode(5);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(45);
		ListNode fifth = new ListNode(47);
		
		s.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		s.search(8);
	}
}
