package q4;
import java.util.Scanner;

public class demo3 {
	public static void main(String[] arg)
	{
		int n;
		int i,j;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter size :");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
}
		
		for(i=n-1;i>=1;i--)	
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}