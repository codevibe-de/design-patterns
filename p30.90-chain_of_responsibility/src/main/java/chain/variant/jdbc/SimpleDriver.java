package chain.variant.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class SimpleDriver implements Driver {

    // this is being executed automatically when being loaded from classpath (Class.forName)
    static {
        try {
            DriverManager.registerDriver(new SimpleDriver());
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection connect(String url) {
        System.out.println("SimpleDriver.connect");
		if (!url.contains("simple")) {
			return null;
		}
        return new SimpleConnection(url);
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        System.out.println("SimpleDriver.acceptsURL");
        return url.contains("simple");
    }

    @Override
    public Connection connect(String url, Properties props) throws SQLException {
        System.out.println("SimpleDriver.connect(" + url + ", " + props + ")");
		if (!url.contains("simple")) {
			return null;
		}
        return new SimpleConnection(url);
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1) throws SQLException {
        return null;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

}
