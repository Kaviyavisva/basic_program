package basicprograms;
import java.util.*;
public class strobogrammatic_number 
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str=String.valueOf(n);
        String rev = "";
        int count=0;
        String modify="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1'||str.charAt(i)=='0'||str.charAt(i)=='8')
            {
                modify=modify+str.charAt(i);
                count++;
            }
            else if(str.charAt(i)=='9')
            {
              modify=modify+'6';
              count++;
            }
            else if(str.charAt(i)=='6')
            {
                modify=modify+'9';
                count++;
            }
        }
        for(int i=modify.length()-1;i>=0;i--)
        {
            rev=rev+modify.charAt(i);
        }
        if(count==str.length() && str.equals(rev))
        {
            System.out.print("STROBOGRAMMATIC NUMBER");
        }
        else
        {
            System.out.print("NOT A STROBOGRAMMATIC NUMBER");
        }
        
        
    }
}
