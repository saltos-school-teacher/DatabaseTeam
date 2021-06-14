package com.saltos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:./company.db", "sa", "");
    }
}
