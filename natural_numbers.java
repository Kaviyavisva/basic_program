package basicprograms;
import java.util.*;
public class natural_numbers 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.print((n*(n+1))/2);
	}
}
