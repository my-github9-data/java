package q4;

public class demo1 {

	public static void main(String[] args) {
		int num=5;
		for(int i=0;i<=num;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}
