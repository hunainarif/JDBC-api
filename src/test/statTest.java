package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import api.DriverImpl;

public class statTest {


	@Test
	public void test() {
		try {
			Driver driver_obj = new DriverImpl();
			DriverManager.registerDriver(driver_obj);
			Connection connection = DriverManager.getConnection("jdbc:odbc:macOdbc","hunain","hunain");
			Statement statement = connection.createStatement();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}finally{
			
		}
	}

}
