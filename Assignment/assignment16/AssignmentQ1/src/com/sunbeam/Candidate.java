package com.sunbeam;

import java.util.Scanner;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	
	public Candidate(){
		
	}

	public Candidate(int id, String name, String party, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Candidate [Id=" + id + ", Name=" + name + ", Party=" + party + ", Votes=" + votes + "]";
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name- ");
		this.name = sc.next();
		System.out.print("Enter the party- ");
		this.party=sc.next();
		System.out.print("Enter the votes- ");
		this.votes=sc.nextInt();
	}
	
}
