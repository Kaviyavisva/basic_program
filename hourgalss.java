package basicprograms;
import java.util.*;
public class hourgalss 
{
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=scan.nextInt();
        System.out.println("Enter the number of columns:");
        int column=scan.nextInt();
        int arr[][]=new int[rows][column];
        for(int i=0;i<rows;i++)
        {
                for(int j=0;j<column;j++)
                {
                     arr[i][j]=scan.nextInt();   
                }
        }
        if(rows<3 && column<3)
        {
                System.out.println("Not possible");
        }
        int sum1=Integer.MIN_VALUE;
        for(int i=0;i<rows-2;i++)
        {
                for(int j=0;j<column-2;j++)
                {
                        int sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2])+(arr[i+1][j+1])+
                        (arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                        sum1=Math.max(sum1,sum);
                }
        }
        System.out.println(sum1);
}

}
