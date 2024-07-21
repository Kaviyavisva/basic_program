package basicprograms;
import java.util.*;
public class power 
{
	public static double powerr(double base,int power)
	{
		double  prod=1;
		for(int i=1;i<=power;i++)
		{
			prod=prod*base;
		}
		return prod;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		double base = sc.nextDouble();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		System.out.print(powerr(base,power));
	}
}
