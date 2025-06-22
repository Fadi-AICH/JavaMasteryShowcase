package org.example;

public class Eleve {
    private int id;
    private String nom;
    private String prenom;
    private String groupe;

    public Eleve() {}

    public Eleve(int id, String nom, String prenom, String groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }

    public Eleve(String nom, String prenom, String groupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getGroupe() { return groupe; }
    public void setGroupe(String groupe) { this.groupe = groupe; }

    @Override
    public String toString() {
        return id + " - " + nom + " " + prenom + " | Groupe: " + groupe;
    }
}
