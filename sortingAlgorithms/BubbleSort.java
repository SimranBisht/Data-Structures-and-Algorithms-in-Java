package sortingAlgorithms;
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
