package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
		 String columnValue = null;
		 Connection connection = null;
		 Statement statement = null;
		 ResultSet resultSet = null;

		 public String getData(String columnName) {

		  try {
		   // Setting propeties of MySQL
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   String sqlUrl = "jdbc:mysql://localhost:3306/september2022";
		   String sqlUsername = "root";
		   String sqlPassword = "root";
		   String sqlQuery = "Select * from users;";

		   // Create connection to the local database
		   connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

		   // Empower connection reference variable to execute queries
		   statement = connection.createStatement();

		   // Deliver the query
		   resultSet = statement.executeQuery(sqlQuery);

		   while (resultSet.next()) {
		    columnValue = resultSet.getString(columnName);    
		   }

		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  } finally {

		   if (resultSet != null) {
		    try {
		     resultSet.close();
		    } catch (SQLException e) {
		     e.printStackTrace();
		    }
		   }

		   if (connection != null) {
		    try {
		     connection.close();
		    } catch (SQLException e) {
		     e.printStackTrace();
		    }
		   }
		  }

		  return columnValue;
		 }

		}

