package db;

import db.IDbConnection;

import java.sql.*;

public class MySqlConnector implements IDbConnection {
    private final String url = "jdbc:mysql://sql.home.kartushin.su:3306/ARazarenov";
    private final String login = "admin";
    private final String password = "711267";

    private static Connection dbConnection = null;
    private static Statement statement = null;

    private void mySqlConnector() throws SQLException {
        if (dbConnection == null) {
            dbConnection = DriverManager.getConnection(url, login, password);
        }
        if (statement == null) {
            statement = dbConnection.createStatement();
        }
    }

    public void executeQuery(String sqlQuery) throws SQLException {
        mySqlConnector();
        statement.executeUpdate(sqlQuery);
    }

    public ResultSet executeQueryWithAnswer(String sqlQuery) throws SQLException {
        mySqlConnector();
        return statement.executeQuery(sqlQuery);
    }

    public void close() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (dbConnection != null) {
            dbConnection.close();
        }


    }

}
