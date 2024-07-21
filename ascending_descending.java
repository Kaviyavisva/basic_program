package basicprograms;
import java.util.*;
public class ascending_descending 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Ascending order:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Descending order:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
