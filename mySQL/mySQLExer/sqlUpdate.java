package com.mySQLExer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class sqlUpdate {
	private static final String SQL = "UPDATE employee.employee SET age = 30 where empName = 'Corbn';";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false", "root", "password123");
				PreparedStatement ps = conn.prepareStatement(SQL)) {
			
			ps.execute();
			
			List<Employee> users = new ArrayList<Employee>();
			/*
			while (rs.next()) {
				
				Employee emp = new Employee();
				emp.setId(rs.getInt("empID"));
				emp.setName(rs.getString("empNAME"));
				emp.setDob(rs.getString("empDOB"));
				emp.setSalary(rs.getInt("salary"));
				emp.setAge(rs.getInt("age"));
				
				users.add(emp);
			}
			*/

			// rows inserted
			/*
			System.out.println(users); 
			System.out.println("users list size is==>" +users.size()); 
			*/
			System.out.println("Record updated!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
