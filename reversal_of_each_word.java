package basicprograms;
import java.util.*;
public class reversal_of_each_word 
{
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		String arr[] = str.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(reverse(arr[i])+" ");
		}
	}
}
