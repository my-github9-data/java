package q4;

public class demo2 {

	public static void main(String[] args) {
		int num=9;
		for(int i=0;i<num;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			for(int k=1;k<=i;k++) {
				System.out.print("*");
					}
				System.out.println();
			}
		}
	}
}
