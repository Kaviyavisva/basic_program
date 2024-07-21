package basicprograms;
import java.util.*;
public class primeNumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int flag=0;
		if(n==0 || n==1)
		{
			System.out.print("Not a Prime Number");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.print("Not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.print("Prime number");
		}
	}
}
