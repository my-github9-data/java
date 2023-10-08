//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.

package q3;

import java.util.Scanner;

public class demo1 {
	public static void main(String [] args) {
		
		int choice;
		int qty=0;
		double bill=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Dosa \t 40");
		System.out.println("2. Samosa \t 20");
		System.out.println("3. Single Idli \t 25");
		System.out.println("4. Idli Vada \t 35");
		System.out.println("5. Paav Bhaji \t 45");
		System.out.println("6. Pohe \t 20");
		System.out.println("7. Upama \t 20");
		System.out.println("8. Dahi Vada \t 50");
		System.out.println("9. Vada Paav \t 15");
		System.out.println("10.Generate Bill");
		System.out.println("---------------------------");
		
		
		
		while(true){
			System.out.print("Enter Your Choice= ");
					choice=sc.nextInt();
					//qty=sc.nextInt();
			switch(choice) {
			case 0: System.out.println("Total Bill ="+bill);
					System.out.println("Thank You.... Visit Again");
					System.exit(0);
			case 1: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=40*qty;
					System.out.println("Dosa Added...");
					break;
			case 2: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=20*qty;
					System.out.println("Samosa Added...");
					break;
			case 3: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=25*qty;
					System.out.println("Single Idli Added...");
					break;
			case 4: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=35*qty;
					System.out.println("Idli Vada Added...");
					break;
			case 5: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=45*qty;
					System.out.println("Paav Bhaji Added...");
					break;
			case 6: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=20*qty;
					System.out.println("Pohe Added...");
					break;
			case 7: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=20*qty;
					System.out.println("Upama Added...");
					break;
			case 8: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=50*qty;
					System.out.println("Dahi Vada Added...");
					break;
			case 9: System.out.print("Enter Quantity= ");
					qty=sc.nextInt();
					bill+=15*qty;
					System.out.println("Vada Paav Added...");
					break;
			case 10:System.out.println("Total Bill ="+bill);
					System.out.println("Thank You.... Visit Again");
					System.exit(0);
			default: System.out.println("Wrong Choice...");
					break;
			}
			
			} 
	}
}
