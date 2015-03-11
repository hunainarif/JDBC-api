package test;

import static org.junit.Assert.*;

import java.sql.*;

import org.junit.Before;
import org.junit.Test;
import api.*;
public class testOne {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			Driver driver = new DriverImpl();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			fail(e.getMessage());
			
		}
		
		
		
	}

}
