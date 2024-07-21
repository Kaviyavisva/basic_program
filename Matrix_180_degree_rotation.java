package basicprograms;
import java.util.*;
public class Matrix_180_degree_rotation 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
