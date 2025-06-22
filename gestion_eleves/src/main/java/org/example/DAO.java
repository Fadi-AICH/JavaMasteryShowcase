package org.example;

import java.sql.*;

public class DAO {
    protected Statement stm;

    public DAO() {
        try {
            stm = SingletonConnexion.getInstance().createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int Set(String sql) throws Exception {
        return stm.executeUpdate(sql);
    }

    public ResultSet Get(String sql) throws Exception {
        return stm.executeQuery(sql);
    }
}
