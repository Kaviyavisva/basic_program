package basicprograms;
import java.util.*;
public class reverse_left_half 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
