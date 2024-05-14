package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SqlInitiator {
	
	public static Connection mConnection;
	public static ResultSet resultSet;
	
	public void initDatabase() {
		try {
			mConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "ak1997", "Akhila992@12");
        } catch (Exception e) {
            System.err.println(e);
        }
	}

	public static void insertDatabase(String sqlQuery) {
		try {
			java.sql.Statement statement = mConnection.createStatement();
			statement.execute(sqlQuery);
		} catch (SQLException e) {
			 System.out.println("Table creation UnSuccessfull");
		}
	}
	
	public static void updateDatabase(String sqlQuery) {
		try {
			java.sql.Statement statement = mConnection.createStatement();
			statement.execute(sqlQuery);
			refreshUserData();
		} catch (SQLException e) {
			 System.out.println("Table creation UnSuccessfull");
		}
	}
	
	private static void refreshUserData() {
		PreparedStatement preparedStatement;
		try {
			String sqlQuery;
			sqlQuery = "SELECT * from customer WHERE Name = ? AND Password = ?";
			preparedStatement = mConnection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, resultSet.getString("Name"));
	        preparedStatement.setString(2, resultSet.getString("Password"));				           
	        ResultSet resultSet = preparedStatement.executeQuery();
	        SqlInitiator.resultSet = resultSet;
	  
		} catch (SQLException e) {
		
		}
	}
	
	
	public static ResultSet getUserData(String user, String pass,String sqlQuery) {
		 PreparedStatement preparedStatement;
		try {
			preparedStatement = mConnection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, user);
	        preparedStatement.setString(2, pass);				           
	        ResultSet resultSet = preparedStatement.executeQuery();
	        SqlInitiator.resultSet = resultSet;
	        return resultSet;
		} catch (SQLException e) {
			return null;
		}
	}
}
