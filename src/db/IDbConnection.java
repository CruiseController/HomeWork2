package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDbConnection {
    void executeQuery(String sqlQuery) throws SQLException;
    ResultSet executeQueryWithAnswer(String query) throws SQLException;
    public void close() throws SQLException;
}
