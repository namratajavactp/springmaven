package com.spring.ilt.learning.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SimpeJDBC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:8889/SpringTutorials";
	static final String USERNAME = "root"; static final String PASSWORD = "root";
	public static void main(String[] args) {
		Connection conn = null; Statement stmt = null;
		ResultSet rs = null;
		try {
			// Step 1
			Class.forName(JDBC_DRIVER);
			// Step 2
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			// Step 3
			String sql = "SELECT ID, FIRSTNAME, LASTNAME, INCOME FROM RegisterDate";
			// Step 4
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String firstName = rs.getString("FIRSTNAME");
				String lastName = rs.getString("LASTNAME");
				int income = rs.getInt("INCOME");
				System.out.print("ID: " + id);
				System.out.print("\t FirstName: " + firstName);
				System.out.print("\t LastName: " + lastName);
				System.out.println("\t Income: " + income);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Step 5
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
	}
}


