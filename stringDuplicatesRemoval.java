package basicprograms;
import java.util.*;
public class stringDuplicatesRemoval 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		String str = sc.next();
		char arr[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]='0';
					arr[j]='0';
				}
			}
		}
		System.out.println("After duplicates removal: ");
		for(char ch :arr)
		{
			if(ch!='0')System.out.print(ch);
		}
	}
}
