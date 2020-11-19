package sortingAlgorithms;
/*In Selection Sort the entire list is divided into 2 parts - Sorted and Unsorted.
  In a set of N elements, find out the location of the minimum element and replace it with the first element in the unsorted list.
  Time Complexity : O(n*n) */


import java.util.*; 

public class SelectionSort 
{
	public static void main(String args[])
	{
		Scanner I = new Scanner(System.in);
		int i, j, min, n=5;
		
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		
		System.out.println("Enter the numbers for sorting");
		for (i=0;i<n;i++)
			al.add(I.nextInt());
		
		for (i=0;i<n-1;i++)
		{
			min = i;
			for (j=i+1;j<n;j++)
			{
				if (al.get(j)<al.get(min))
					min = j;
			}
			if (min!=i)
			{
				int temp = al.get(i);
				al.set(i, al.get(min));
				al.set(min, temp);
			}
		}
		
		System.out.print("Numbers after sorting : ");
		for (int x:al)
			System.out.print(x+" ");
		
		I.close();
	}
}
