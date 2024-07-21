package basicprograms;
import java.util.*;
public class fibo_recursion 
{
	static int a=0,b=1,c=0;
	public static void fibo(int n)
	{
		if(n>0)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		fibo(n-1);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		System.out.println("0");
		System.out.println("1");
		fibo(n-2);
		
	}
}
