package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) {
	        // Database credentials
	        String url = "jdbc:mysql://localhost:3306/mohit"; // Update with your DB URL and name
	        String user = "root";  // Replace with your MySQL username
	        String password = "Yohit@18";  // Replace with your MySQL password
	        
	        // Connection object
	        Connection connection = null;

	        try {
	            // Load the MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish the connection
	            connection = DriverManager.getConnection(url, user, password);
	            
	            if (connection != null) {
	                System.out.println("Connection to MySQL database established!");
	            }

	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection failed.");
	            e.printStackTrace();
	        } finally {
	            // Close the connection
	            try {
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	

}
