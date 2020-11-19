/*In Bubble Sort, we compare each pair of adjacent element and then elements are swapped if they are not in order.
It is ->
1. inplace sorting algorithm
2. stable sorting algorithm
3. slow
Time Complexity :-
Worst Case = O(n*n)
Best Case = O(n)

I have used ArrayList for sorting without simply using Collections.sort() to get direct results.
*/

import java.util.*;

public class BubbleSort 
{
	public static void main(String args[]) {
		Scanner I = new Scanner(System.in);
		System.out.println("Enter the numbers for sorting");
		
		int i,j,n=5;
		
		/*define an array list with size: n=5*/
		ArrayList <Integer> al = new ArrayList<Integer>(n);
		
		for (i=0;i<n;i++)
		{
			int input = I.nextInt();
			al.add(input);
		}
		
		for (i=0;i<n-1;i++)
		{
			for (j=0;j<n-1-i;j++)
			{
				if (al.get(j)>al.get(j+1))
				{
					int temp = al.get(j);
					al.set(j , al.get(j+1));
					al.set(j+1 , temp);
				}
			}
		}
		
		System.out.print("Sorted list is : ");
		for (int str: al)
			System.out.print(str+" ");
		
		I.close();
	}
}
