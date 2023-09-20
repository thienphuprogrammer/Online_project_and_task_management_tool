package datalayer.daoconnection;

import java.sql.Connection;

public interface IConnection {
    public Connection getConnection();
    public void closeConnection(Connection connection);
}
