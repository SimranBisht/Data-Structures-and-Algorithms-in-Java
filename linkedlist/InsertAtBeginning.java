/* To insert a node at the beginning of the Linked List */

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
	
	public void insert(int d)                                       //function to insert a node at the beginning of the linked list
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
	
	public void display()                                          //function to display the Linked List
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
		iab.insert(4);                                //4 --> 5
		iab.insert(3);                                //3 --> 4 --> 5
		iab.insert(0);                                //0 --> 3 --> 4 --> 5 
		
		iab.display();                                //0 --> 3 --> 4 --> 5
	}
}
