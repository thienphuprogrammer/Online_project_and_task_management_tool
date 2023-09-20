package datalayer.spacedao.backlogdao;

import datalayer.DaoFactory;
import datalayer.IConnection;
import bussinesslayer.entity.space.Backlog;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BacklogDao<Backlog> implements IBacklogDao<Backlog> {
    public BacklogDao() {
    }

    @Override
    public Backlog getById(int id) throws Exception {
        Backlog backlog = null;
        String sql = "SELECT * FROM Backlog WHERE id = ?";
        try {
            Connection connection = DaoFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                backlog = new Backlog(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("fileURL"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return backlog;

    }

    @Override
    public List<Backlog> getAll() throws Exception {
        return null;
    }

    @Override
    public void addNew(Backlog space) throws Exception {

    }

    @Override
    public void update(Backlog space) throws Exception {

    }

    @Override
    public void delete(Backlog space) throws Exception {

    }

    @Override
    public void save(Backlog space) throws Exception {

    }
}
