package basicprograms;
import java.util.*;
import java.util.regex.*;
public class presence_vowels 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		Pattern p = Pattern.compile("[aeiouAEIOU]");
		Matcher m = p.matcher(str);
		int count=0;
		while(m.find())
		{
			count++;
			System.out.print("YES");
			break;
		}
		if(count==0)
		{
			System.out.print("NO");
		}
		
		
	}
}
