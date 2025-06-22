package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexion {
    private static Connection con;

    private SingletonConnexion() {}

    public static Connection getInstance() throws Exception {
        if (con == null || con.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_eleves", "root", "");
        }
        return con;
    }
}
