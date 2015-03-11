package test;

import static org.junit.Assert.*;

import java.sql.*;

import org.junit.Before;
import org.junit.Test;

import api.DriverImpl;

public class testResult {


	@Test
	public void test() {
		
		try {
			Driver driver_obj = new DriverImpl();
			DriverManager.registerDriver(driver_obj);

			Connection connection = DriverManager.getConnection("jdbc:odbc:macOdbc","hunain","hunain");

			Statement statement = connection.createStatement();
			statement.executeQuery("Select * from test");

			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

}
