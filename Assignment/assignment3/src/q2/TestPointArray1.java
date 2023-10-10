package q2;

import java.util.Scanner;

import q2.Point2d;

public class TestPointArray1 {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - number conversion");
		System.out.println("0. EXIT");
		System.out.println("1. Display on index");
		System.out.println("2. Display all");
		System.out.println("3. Distance btw 2 points ");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;

	}

	public static void main(String[] args) {
		int num, choice;
		int x, y;
		System.out.print("Please enter how many points you want :");
		num = sc.nextInt();
		Point2d arr[] = new Point2d[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Please enter x:");
			x = sc.nextInt();
			System.out.println("Please enter y:");
			y = sc.nextInt();
			arr[i] = new Point2d(x, y);
		}

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Please enter index:");
				x = sc.nextInt();
				if (x > arr.length)
					System.out.println("Invalid index , try again !!!");
				else
					System.out.println(arr[x].getDetails());
				break;
			case 2:
				for (Point2d point2d : arr)
					System.out.println(point2d.getDetails());
				break;
			case 3:
				System.out.println("Please enter index:");
				x = sc.nextInt();
				System.out.println("Please enter index:");
				y = sc.nextInt();
				if (x > arr.length || y > arr.length)
					System.out.println("Invalid index , try again !!!");
				else
					System.out.println("Distance : " + arr[x].calculateDistance(arr[y]));
				break;

			default:
				break;
			}
		}

	}
}
