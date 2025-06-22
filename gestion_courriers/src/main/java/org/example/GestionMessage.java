package org.example;

import java.sql.*;
import java.util.*;

public class GestionMessage {
    private Connection con;

    public GestionMessage() {
        try {
            con = ConnexionDB.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Envoyer_MSG(Message msg) throws SQLException {
        String sql = "INSERT INTO message(adresse_exp, sujet, date_envoi, contenu, etat) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, msg.getAdresseExp());
        ps.setString(2, msg.getSujet());
        ps.setDate(3, new java.sql.Date(msg.getDateEnvoi().getTime()));
        ps.setString(4, msg.getContenu());
        ps.setInt(5, msg.getEtat());
        ps.executeUpdate();
    }

    public void Modifier_MSG(int id, String nouveauContenu) throws SQLException {
        String sql = "UPDATE message SET contenu=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nouveauContenu);
        ps.setInt(2, id);
        ps.executeUpdate();
    }

    public void Supprimer_MSG(int id) throws SQLException {
        String sql = "DELETE FROM message WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public List<Message> Lister() throws SQLException {
        List<Message> list = new ArrayList<>();
        String sql = "SELECT * FROM message";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Message msg = new Message(
                    rs.getString("adresse_exp"),
                    rs.getString("sujet"),
                    rs.getDate("date_envoi"),
                    rs.getString("contenu"),
                    rs.getInt("etat")
            );
            list.add(msg);
        }
        return list;
    }
}
