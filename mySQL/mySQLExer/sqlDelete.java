package com.mySQLExer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mySQLExer.Employee;

public class sqlDelete {
	private static final String SQL = "DELETE FROM employee.employee WHERE empID = 3;";

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
			System.out.println("Record deleted!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}