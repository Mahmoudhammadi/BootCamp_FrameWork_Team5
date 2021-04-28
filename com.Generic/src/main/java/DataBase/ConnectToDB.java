package DataBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToDB {
    public static Connection connect;
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File file = new File(System.getProperty("user.dir")+"/com.Generic/src/main/java/DataBase/config.properties");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        return connect;
    }

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        connectToSqlDatabase();
    }
}
