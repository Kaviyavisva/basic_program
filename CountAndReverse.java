package basicprograms;
import java.util.*;
public class CountAndReverse 
{
	public static void count(int a)
	{
		int c=0;
		while(a>0)
		{
			c++;
			a/=10;
		}
		System.out.println("count: "+c);
	}
	public static void reverse(int a)
	{
		String rev="";
		while(a>0)
		{
			rev=rev+(a%10);
			a/=10;
		}
		System.out.println("reverse: "+rev);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		count(n);
		reverse(n);
	}
}
