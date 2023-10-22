package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		try(CandidateDAO dao = new CandidateDAO()){
			Candidate c = new Candidate();
			c.accept();
			int cnt = dao.save(c);
			System.out.println("Candidate added ");
			System.out.println("Row Inserted: "+cnt);
		}
		
		try(CandidateDAO dao = new CandidateDAO()){
//			Candidate c1 = new Candidate();
			System.out.println("Enter the name ");
			String name = sc.next();
			System.out.println("Enter the party ");
			String party = sc.next();
			System.out.println("Enter the votes ");
			int votes = sc.nextInt();
			System.out.println("Enter the id ");
			int id = sc.nextInt();
			Candidate c1 = new Candidate(id,name,party,votes);
//			c1.setName("Sarvesh");
//			c1.setParty("NOTA");
//			c1.setVotes(60);
//			c1.setId(11);
			int cnt = dao.update(c1);
			System.out.println("Row Updated "+cnt);		
		}
		
		try(CandidateDAO dao = new CandidateDAO()){
				
			List<PartyVotes> list= dao.getPartywiseVotes();
			list.forEach(c -> System.out.println(c));
			//System.out.println(list );
		}
		
	}

}
