package basicprograms;
import java.util.*;
public class factorial 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod*=i;
		}
		System.out.print("Factorial of "+n+" is "+prod);
	}
}
