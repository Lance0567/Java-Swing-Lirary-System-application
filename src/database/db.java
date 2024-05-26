package database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db {

    private static String serverName = "localhost";
    private static String username = "root";
    private static String dbName = "library_system_db";
    private static Integer portNumber = 3306;
    private static String pass = "";

    // create & return the connection
    public static Connection getConnection() {
        Connection connection = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(serverName);
        datasource.setUser(username);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(pass);

        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
}
