/* to insert a node at the end of the Linked List */

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
	
	public void insert(int d)						//function to insert a node at the end of the Linked List
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
	
	public void display()							//traverse through the Linked List
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
		ial.head = new ListNode(5);					//5 --> null
		ial.insert(10);							//5 --> 10 --> null
		ial.insert(15);							//5 --> 10 --> 15 --> null
		ial.insert(20);							//5 --> 10 --> 15 --> 20 --> null
		
		ial.display();							//5 --> 10 --> 15 --> 20 --> null
	}
}
