package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Add new User.");
			System.out.println("2. Update Existing user.");
			System.out.println("3. Display all Users.");
			System.out.println("4. Delete existing User by user_id.");
			System.out.println("Enter your Choice : ");
			choice=in.nextInt();
			int id;
			UsersPOJO tempUser;
			switch(choice)
			{
			case 1:
				tempUser=new UsersPOJO();
				try {
					tempUser.accept();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try(UserDAO ud = new UserDAO())
				{
					ud.addUser(tempUser);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter Id of User to Update : ");
				id=in.nextInt();
				try(UserDAO ud=new UserDAO())
				{
					tempUser= new UsersPOJO();
					tempUser.accept();
					int cnt=ud.updateUser(tempUser);
					System.out.println("Rows Affected : "+cnt);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			case 3:
				try(UserDAO ud=new UserDAO())
				{
					List<UsersPOJO> result=ud.getAll();
					
					result.forEach(c -> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDAO ud=new UserDAO())
				{
					System.out.print("Enter User_id to delete : ");
					id=in.nextInt();
					
					int cnt=ud.deleteUser(id);
					System.out.println("Rows Affected : "+cnt);
				}//ud.close()
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid Choice Entered.");
				break;
			}
		}while(choice!=0);
	}
}
