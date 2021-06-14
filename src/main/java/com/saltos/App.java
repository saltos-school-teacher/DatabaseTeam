package com.saltos;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello Database");
        try {
            Connection connection = Util.getConnection();
            System.out.println("Connection ready");
        } catch (SQLException e) {
            System.out.println("An error has occurred in the database: " + e);
        }
    }
}
