package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable {
	private Connection con;
	public CandidateDAO() throws SQLException {
		con= DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
//		try {	
//			if (con!=null)
//				con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	// Add new candidate
	public int save(Candidate c) throws SQLException {
			String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)";
			try(PreparedStatement stml= con.prepareStatement(sql)){
				stml.setString(1,c.getName());
				stml.setString(2, c.getParty());
				stml.setInt(3, c.getVotes());
				int cnt =stml.executeUpdate();
				//System.out.println("Row Inserted...= "+cnt);
				return cnt;
			}
		}
	
	// update candidate
	public int update(Candidate c) throws SQLException{
		String sql = "UPDATE users SET name=?, party=?, votes=? WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			
			int cnt = stmt.executeUpdate();
			//System.out.println("Rows updated: " + cnt);	
			return cnt;
		}
	}
	
	//Partywise total votes
	public List<PartyVotes> getPartywiseVotes() throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String sql ="SELECT party,sum(votes) FROM candidates group by party";
		try(PreparedStatement stmt= con.prepareStatement(sql)){
			try(ResultSet rs= stmt.executeQuery()){
				while (rs.next()) {
					String party = rs.getString("party");
					int votes= rs.getInt("sum(votes)");
					PartyVotes p = new PartyVotes(party, votes);
					list.add(p);
				}
			}
		}
		return list;
	}
}