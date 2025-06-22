package org.example;

import java.sql.ResultSet;
import java.util.ArrayList;

public class GestionEleves extends DAO implements IDAO<Eleve> {

    @Override
    public int insert(Eleve e) {
        String sql = String.format(
                "INSERT INTO Eleves(nom, prenom, groupe) VALUES('%s', '%s', '%s')",
                e.getNom(), e.getPrenom(), e.getGroupe()
        );
        try {
            return Set(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Eleve e) {
        String sql = String.format(
                "UPDATE Eleves SET nom='%s', prenom='%s', groupe='%s' WHERE id=%d",
                e.getNom(), e.getPrenom(), e.getGroupe(), e.getId()
        );
        try {
            return Set(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM Eleves WHERE id=" + id;
        try {
            return Set(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<Eleve> Select() {
        ArrayList<Eleve> liste = new ArrayList<>();
        try {
            ResultSet rs = Get("SELECT * FROM Eleves");
            while (rs.next()) {
                Eleve e = new Eleve(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("groupe")
                );
                liste.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return liste;
    }
}
