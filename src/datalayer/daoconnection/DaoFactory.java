package datalayer.daoconnection;

public class DaoFactory implements IDaoFactory {
    @Override
    public IConnection getConnection() {
        return new MySqlConnection();
    }
}
