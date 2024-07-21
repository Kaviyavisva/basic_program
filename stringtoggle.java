package basicprograms;
import java.util.*;
public class stringtoggle 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch<='Z' && ch>='A')
			{
				ans+=(char)(ch+32);//lower case conversion
			}
			else
			{
				ans+=(char)(ch-32);//upper case conversion
			}
		}
		System.out.println(ans);
	}
}
