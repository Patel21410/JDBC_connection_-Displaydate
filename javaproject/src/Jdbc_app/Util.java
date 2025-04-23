package Jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	private static String url="jdbc:mysql://localhost:3306/iacsd2025";
	private static String user="root";
	private static String pass="root123";
	
	private static Connection connection;
	
	public static Connection openConnection() throws SQLException {
		if(connection==null){
		connection=DriverManager.getConnection(url,user,pass);
		}
		return connection;
		
	}
	
	

}
