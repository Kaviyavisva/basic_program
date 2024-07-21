package basicprograms;
import  java.util.*;
public class oddoreven 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		String res = (n%2==0) ? "Even" : "odd";
		System.out.print(res);
	}
}
