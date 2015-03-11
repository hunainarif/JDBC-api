package api;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

import sun.jdbc.odbc.JdbcOdbcDriver;

public class DriverImpl implements  Driver{

	
	public DriverImpl() {
		JdbcOdbcDriver drv = new JdbcOdbcDriver();
		try {
			DriverManager.registerDriver(drv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		
		return new ConnectionImpl(DriverManager.getConnection(url,info));
		
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
