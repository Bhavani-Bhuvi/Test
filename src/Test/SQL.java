package Test;

import java.sql.*;


public class SQL {


	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/javadb"; // Change the database URL, name, and port if needed
	        String user = "root";
	        String password = "Yohit@18";
	        
	        String insertQuery = "INSERT INTO College_Student (Id, Name, Age,Department,Location) VALUES (?, ?, ?,?,?)";
	        
	        Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;


	        try {
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the database!");

	        //    pstmt = conn.prepareStatement(insertQuery);
	            pstmt =  conn.createStatement();


	            pstmt.setInt(1, 205); 
	            pstmt.setString(2, "Gayathri"); 
	            pstmt.setInt(3, 22); 
	            pstmt.setString(4, "CSE"); 
	            pstmt.setString(5, "Chennai"); 

	            int rowsAffected = pstmt.executeUpdate();
	            
	            if (rowsAffected > 0) {
	                System.out.println("Record inserted successfully.");
	            } else {
	                System.out.println("Failed to insert the record.");
	            }
	            
	            String query = "SELECT id, name, age FROM employees";

	            rs = pstmt.executeQuery(query);
	            

	            // Step 3: Process the result set
	            System.out.println("ID\tName\t\tAge");
	            System.out.println("-----------------------------------");

	            // Loop through the result set
	            while (rs.next()) {
	                int id = rs.getInt("id");          // Retrieve ID
	                String name = rs.getString("name"); // Retrieve Name
	                int age = rs.getInt("age");        // Retrieve Age

	                // Print the results
	                System.out.println(id + "\t" + name + "\t" + age);
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                // Step 4: Close the resources
	                if (pstmt != null) {
	                    pstmt.close();
	                }
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
	}
