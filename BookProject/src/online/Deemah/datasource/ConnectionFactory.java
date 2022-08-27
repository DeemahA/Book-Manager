package online.Deemah.datasource;

import online.Deemah.exceptions.dataSourceException;
import java.sql.Connection;

public abstract class ConnectionFactory {

    public abstract String getURL();

    public abstract String getUser();

    public abstract String getPassword();

    public abstract String getDriverName();

    public abstract Connection creatConnection() throws dataSourceException;

    public static ConnectionFactory getConnectionFactory(dataSourceType factory) {

        switch (factory) {

            case MY_SQL:
                return new MySQLConnectionFactory();

            case ORACLE:
                return null;

            case SYBASE:
                return null;

            default:
                return null;

        }

    }

}
