package JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUnits {
    private static final Properties props = new Properties();

    static {
        // Use the class's own loader to find the file in the classpath
        try (InputStream in = DBUnits.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (in == null) {
                throw new RuntimeException("db.properties not found! Ensure it is in the src or resources folder.");
            }
            props.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load DB config", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        // Modern JDBC drivers (MySQL 8.0+) register themselves automatically,
        // so Class.forName is usually not needed.
        return DriverManager.getConnection(
                props.getProperty("db.url"),
                props.getProperty("db.user"),
                props.getProperty("db.password")
        );
    }
}
