package basicprograms;
import java.util.*;
public class reverseString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}
