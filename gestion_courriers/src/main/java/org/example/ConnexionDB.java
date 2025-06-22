package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_courriers";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection con;

    public static Connection getConnection() throws Exception {
        if (con == null || con.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return con;
    }

    public static void closeConnection() throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
