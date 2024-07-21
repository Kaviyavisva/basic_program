package basicprograms;
import java.util.*;
public class Sum_array 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    sum+=arr[i];
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(sum-arr[i]+" ");
		}
	}
}
