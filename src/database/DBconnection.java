package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class DBconnection
{
	public static void main(String[] args) {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "testdbuser", "india@123");

			// Do something with the Connection

			ResultSet rs = conn.createStatement().executeQuery(" SELECT * from city limit 10");
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			
			
			int numberOfColumns = rsmd.getColumnCount();
			System.out.println(numberOfColumns);
			
			for (int i = 1; i <=numberOfColumns; i++) {
				System.out.print(rsmd.getColumnName(i)+ "   ");
			}

			while (rs.next()) {

				
					//System.out.print(rsmd.getColumnName(i));
					for (int j = 1; j <=numberOfColumns; j++) {
					System.out.print(rs.getString(j) + "           ");
					
				}
					System.out.println("");

			}

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
}