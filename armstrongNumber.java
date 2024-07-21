package basicprograms;
import java.util.*;
public class armstrongNumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int u = n%10;
			sum=sum+(u*u*u);
			n/=10;
		}
		String res = (temp==sum)? "ARMSTRONG NUMBER":"NOT AN ARMSTRONG NUMBER";
		System.out.println(res);
	}
}
