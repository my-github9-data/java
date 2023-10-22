package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UsersPOJO {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private Date bdate;
	private boolean status;
	private String role;
	
	
	public UsersPOJO(int id, String fname, String lname, String email, String password, Date bdate, boolean status,String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.bdate = bdate;
		this.status = status;
		this.role = role;
	}
	
	public UsersPOJO()
	{
		
	}
	public int getId() {
		return id;
	}

	public void setUser_id(int user_id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String str = sdf.format(bdate);
		return "Users [Id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", bdate=" + str + ", status=" + status + ", role=" + role + "]";
	}
	
	public void accept()throws Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Fname : ");
		this.fname=in.nextLine();
		System.out.println("Enter Lname : ");
		this.lname=in.nextLine();
		System.out.println("Enter Email : ");
		this.email=in.nextLine();
		System.out.println("Enter Password : ");
		this.password=in.nextLine();
		
		System.out.println("Enter Bdate (DD-MM-YYYY): ");
		String date=in.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate=sdf.parse(date);
		
		System.out.println("Enter Status : ");
		this.status=in.nextBoolean();
		
		System.out.println("Enter Role : ");
		this.role=in.nextLine();
		
	}
}