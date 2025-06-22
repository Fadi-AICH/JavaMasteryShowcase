import java.util.ArrayList;
import java.util.Date;

public class hissabeBancaire {
    private String numero;
    private String nomClient;
    private double solde;
    private ArrayList<String> historique;

    public hissabeBancaire(String numero, String nomClient, double soldeInitial) {
        this.numero = numero;
        this.nomClient = nomClient;
        this.solde = soldeInitial;
        this.historique = new ArrayList<>();
        historique.add(new Date() + " - Création du compte avec solde initial : " + soldeInitial);
    }

    public String getNumero() {
        return numero;
    }
    public String getNomClient() {
        return nomClient;
    }
    public double getSolde() {
        return solde;
    }
    public ArrayList<String> getHistorique() {
        return historique;
    }

    public void credit(double montant) {
        solde += montant;
        historique.add(new Date() + " - Credit de " + montant + ", nouveau solde : " + solde);
    }

    public boolean debit(double montant) {
        if(montant > solde) {
            historique.add(new Date() + " - Tentative de débit de " + montant + " solde insuffisant.");
            return false;
        } else {
            solde -= montant;
            historique.add(new Date() + " - Debit de " + montant + ", nouveau solde : " + solde);
            return true;
        }
    }
    public void addHistorique(String op) {
        historique.add(new Date() + " - " + op);
    }

    public String toString() {
        String separator = "==============_===============";
        return "\n" + separator +
                "\n       COMPTE BANCAIRE       " +
                "\n" + separator +
                "\n Numéro   : " + numero +
                "\n Client   : " + nomClient +
                "\n Solde    : " + solde + " DH" +
                "\n" + separator + "\n";
    }

}
