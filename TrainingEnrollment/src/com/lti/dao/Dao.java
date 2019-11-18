package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Training;



public class Dao {
	
public List<Training> readLogin() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement stmt = conn.createStatement();
			String query = "Select * from Training ";
			
			
			ResultSet result = stmt.executeQuery(query);
			
			List<Training> user = new ArrayList<>();
			
			while(result.next()){
				int id=result.getInt("trainingid");
				String name=result.getString("trainingName");
				int seats=result.getInt("AvailableSeats");
				
				Training training = new Training(id,name,seats);
				user.add(training);
			
		} 
			stmt.close();
			return user;
		}
			catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			
		return null;

}



public int deleteUser(int trainingid){
	int result = 0;
	try{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "HR");
		String query="Delete from Training where trainingid=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, trainingid );
		result= pstmt.executeUpdate();
		pstmt.close();

	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
	return result;
}
}

