package linkedlist;

public class LengthSLL {
	ListNode head;
	static class ListNode
	{
		ListNode next;
		int data;
		ListNode(int data){
		this.data = data;
		next = null;
		}
	}
	
	public int length()
	{
		if (head==null)
			return 0;
		int count = 0;
		ListNode current = head;
		while (current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static void main(String args[])
	{
		LengthSLL l = new LengthSLL();
		l.head = new ListNode(5);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(12);
		ListNode fourth = new ListNode(10);
		ListNode fifth = new ListNode(0);
		ListNode sixth = new ListNode(20);
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
				
		int lengthsll = l.length();
		System.out.println("Length of Linked List = "+lengthsll);
	}

}
