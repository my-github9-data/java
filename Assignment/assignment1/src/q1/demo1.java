package q1;

import java.util.Scanner;

public class demo1 {
	public static void main(String [] args) {
		int accept;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the integer= ");
		accept= scanner.nextInt();
		System.out.println("Number is= "+accept);
		
		System.out.println("Binary Equivalent is= "+Integer.toBinaryString(accept));
		
		System.out.println("Octal Equivalent is= "+Integer.toOctalString(accept));
		
		System.out.println("Hexadecimal Equivalent is= "+Integer.toHexString(accept));
		
	}
	
}
