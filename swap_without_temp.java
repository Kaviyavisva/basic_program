package basicprograms;
import java.util.*;
public class swap_without_temp 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no. ");
		int a = sc.nextInt();//20
		System.out.println("Enter second no. ");
		int b = sc.nextInt();//10
		System.out.println("Before Swapping: "+" a "+a+" b "+b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("After Swapping: "+" a "+a+" b "+b);
		
		
	}
}
