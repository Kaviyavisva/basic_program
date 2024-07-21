package basicprograms;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
	}
}
