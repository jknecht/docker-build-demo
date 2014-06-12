package demo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {

    @Test
    public void testConnectivity() throws Exception {
        String port = "3306";
        String connectionString = "localhost";

        Class.forName("com.mysql.jdbc.Driver").newInstance();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=monty&password=greatsqldb");
    }
}
