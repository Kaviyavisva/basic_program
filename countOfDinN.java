package basicprograms;
import java.util.*;
public class countOfDinN 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter a digit: ");
		int d = sc.nextInt();
		int c=0;
		while(n>0)
		{
			if((n%10)==d)
				c++;
			n/=10;
		}
		System.out.println(c);
	}
}
