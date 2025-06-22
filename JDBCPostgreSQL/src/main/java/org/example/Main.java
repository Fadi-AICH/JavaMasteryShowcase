package org.example;
import java.sql.*;

public class ConnexionBDD {
    static Connection ObjetConnexion() {
        String url = "jdbc:mysql://localhost:3308/gestion_courriers"; // <-- change ici
        String user = "root"; // <-- change si ton utilisateur MySQL est différent
        String password = ""; // <-- change si tu as un mot de passe

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie !");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
        return null;
    }
}