package q2;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		double num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the First Double value= ");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter the 2nd Double value= ");
			if(sc.hasNextDouble())
			{
				num2=sc.nextDouble();
				double average=(num1+num2)/2;
				System.out.print("The avg is="+average);
			}
			else 
				System.out.println("ERROE: The 2nd no is not Double...!!!");
		}
		else
			System.out.println("ERROE: The 1st no is not Double...!!!");
	}
}
