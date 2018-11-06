package testconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	
	private final String url = "jdbc:postgresql://localhost/WatermelonPie";
	private final String user = "postgres";
	private final String password = "watermelon";
	
	/**
	 * Checks if the program is connected to database or not 
	 * @return Connection object
	 */
	public Connection connect() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection succesfull!");
		} catch (SQLException e) {
			System.err.println("Connection failed "+ e);
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
