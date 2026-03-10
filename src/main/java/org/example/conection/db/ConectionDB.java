package org.example.conection.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {
    private static final String URL = "jdbc:postgresql://localhost:5456/junior";
    private static final String USER = "junior";
    private static final String PASSWORD = "junior";

    public static Connection Conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
