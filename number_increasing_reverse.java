package basicprograms;
import java.util.*;
public class number_increasing_reverse 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=1;
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
