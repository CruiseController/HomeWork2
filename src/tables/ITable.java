package tables;

import animals.Animal;

import java.sql.SQLException;
import java.util.List;

public interface ITable {
    void createTable() throws SQLException;
}
