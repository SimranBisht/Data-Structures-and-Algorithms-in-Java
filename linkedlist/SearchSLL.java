/* to search if a given node is present in a given Linked List or not */

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
	
	public void search(int d)							//function to search if "d" is present in the linked list
	{
		if (head==null)
			System.out.println("Linked List is empty");
		
		ListNode current = head;
		while(current.next!=null)
		{
			if (current.data==d)						//prints "found" if the condition is matched else moves to the next node
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
		ListNode fifth = new ListNode(47);					//5 --> 8 --> 12 --> 45 --> 47 --> null
		
		s.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		s.search(8);								//8 found in Linked List
	}
}
