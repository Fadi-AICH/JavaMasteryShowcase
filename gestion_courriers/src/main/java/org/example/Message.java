package org.example;

import java.util.Date;

public class Message {
    private int id;
    private String adresseExp;
    private String sujet;
    private Date dateEnvoi;
    private String contenu;
    private int etat;

    public Message() {}

    public Message(String adresseExp, String sujet, Date dateEnvoi, String contenu, int etat) {
        this.adresseExp = adresseExp;
        this.sujet = sujet;
        this.dateEnvoi = dateEnvoi;
        this.contenu = contenu;
        this.etat = etat;
    }

    // Getters & Setters
    public String getAdresseExp() { return adresseExp; }
    public void setAdresseExp(String adresseExp) { this.adresseExp = adresseExp; }

    public String getSujet() { return sujet; }
    public void setSujet(String sujet) { this.sujet = sujet; }

    public Date getDateEnvoi() { return dateEnvoi; }
    public void setDateEnvoi(Date dateEnvoi) { this.dateEnvoi = dateEnvoi; }

    public String getContenu() { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }

    public int getEtat() { return etat; }
    public void setEtat(int etat) { this.etat = etat; }

    @Override
    public String toString() {
        return "Message{" +
                "adresseExp='" + adresseExp + '\'' +
                ", sujet='" + sujet + '\'' +
                ", dateEnvoi=" + dateEnvoi +
                ", contenu='" + contenu + '\'' +
                ", etat=" + etat +
                '}';
    }
}
