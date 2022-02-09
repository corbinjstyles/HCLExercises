package com.mySQLExer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlInsert{
	private static final String SQL = "INSERT INTO employee "
			+ "(empID, empName, empDOB, salary, age)"
			+ " VALUES (?,?,?,?,?);";
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false", "root", "password123");
				PreparedStatement ps = conn.prepareStatement(SQL)) {
			/*
			ps.setInt(1, 5);
			ps.setString(2, "Christian");
			ps.setString(3, "Christian");
			ps.setString(4, "Christian@gmail.com");
			ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
			ps.setTimestamp(6, null);
			ps.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now()));
			ps.setString(8, "ADMIN");
			*/
			ps.setInt(1, 4);
			ps.setString(2,"Corbyn"); 
			ps.setString(3, "3-15-1998"); 
			ps.setInt(4, 100000); 
			ps.setInt(5, 30);
			int row = ps.executeUpdate();
			System.out.println("Record has been inserted into the DataBase Table User");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}