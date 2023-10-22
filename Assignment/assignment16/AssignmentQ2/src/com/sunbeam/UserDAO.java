package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO implements AutoCloseable{
	private Connection conn;
	public UserDAO() throws SQLException {
		conn = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<UsersPOJO> getAll() throws SQLException {
		String sql = "SELECT * FROM users";
		List<UsersPOJO> list = new ArrayList<>();
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");

					java.sql.Date sdate = rs.getDate("dob");
					java.util.Date bdate = new Date(sdate.getTime());

					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");

					UsersPOJO user = new UsersPOJO(id, fname, lname, email, password, bdate, status, role);

					list.add(user);
				}
			}
		}
		return list;
	}

	public int deleteUser(int id) throws SQLException {
		
		String sql = "DELETE FROM users WHERE user_id=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateUser(UsersPOJO user)throws SQLException
	{
		String sql="UPDATE users SET fname=?,lname=?,email=?,password=?,bdate=?,status=?,role=?";
		try(PreparedStatement stmt=conn.prepareStatement(sql))
		{
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			stmt.setDate(5, null);
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7,user.getRole());
			
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
	}
	
	public int addUser(UsersPOJO user) throws SQLException
	{
		String sql="INSERT INTO users VALUES(?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=conn.prepareStatement(sql))
		{
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			stmt.setDate(5, null);
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7,user.getRole());
			
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
	}
}
