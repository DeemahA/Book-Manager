package online.Deemah.datasource;

import online.Deemah.commen.propReader;
import online.Deemah.exceptions.dataSourceException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory extends ConnectionFactory {

    private static final String CONFIG_FILE = "src/resources/MySQL.properties";
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;
    private static final String DRIVER_NAME = "MySQL ";
    private static final propReader READER;
    private static final String ERR_MSG = "can't connect to the DB , please check your credentials";

    static {
        READER = new propReader(CONFIG_FILE);
        URL = READER.get("url");
        USER = READER.get("user");
        PASSWORD = READER.get("password");

    }

    @Override
    public String getURL() {
        return URL;
    }

    @Override
    public String getUser() {
        return USER;
    }

    @Override
    public String getPassword() {
        return PASSWORD;
    }

    @Override
    public String getDriverName() {
        return DRIVER_NAME;
    }

    @Override
    public Connection creatConnection() throws dataSourceException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            throw new dataSourceException(ERR_MSG, ex);
        }
    }
}
