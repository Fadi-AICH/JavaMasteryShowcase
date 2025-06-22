import java.util.ArrayList;

class Etudiant {
    private static int totalEtudiants = 0;
    private String CNE;
    private String nom;
    private String prenom;
    private double moyenne;
    private String adresse;


    public Etudiant(String CNE, String nom, String prenom, double moyenne, String adresse) {
        this.CNE = CNE;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
        this.adresse = adresse;
        totalEtudiants++;
    }


    public String getCNE() { return CNE; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public double getMoyenne() { return moyenne; }
    public String getAdresse() { return adresse; }


    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setMoyenne(double moyenne) { this.moyenne = moyenne; }
    public void setAdresse(String adresse) { this.adresse = adresse; }


    public void afficher() {
        System.out.println("CNE: " + CNE + ", Nom: " + nom + " " + prenom + ", Moyenne: " + moyenne + ", Adresse: " + adresse);
    }

    public static int NbTotalEtudiant() {
        return totalEtudiants;
    }
}


class GroupeEtudiant {
    private String nom;
    private String niveau;
    private ArrayList<Etudiant> etudiants;


    public GroupeEtudiant(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
        this.etudiants = new ArrayList<>();
    }


    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }


    public void afficherEtudiants() {
        System.out.println("Groupe: " + nom + " (Niveau: " + niveau + ")");
        for (Etudiant e : etudiants) {
            e.afficher();
        }
    }


    public void afficherEtudiantsAdmis() {
        System.out.println("Étudiants admis du groupe " + nom + " :");
        for (Etudiant e : etudiants) {
            if (e.getMoyenne() >= 10) {
                e.afficher();
            }
        }
    }


    public int nombreEtudiants() {
        return etudiants.size();
    }
}


public class Test {
    public static void main(String[] args) {
        // Création des étudiants
        Etudiant e1 = new Etudiant("CNE001", "Ali", "Mohamed", 12.5, "Rabat");
        Etudiant e2 = new Etudiant("CNE002", "Kamal", "Saad", 9.8, "Casablanca");
        Etudiant e3 = new Etudiant("CNE003", "Sami", "Youssef", 14.2, "Fès");

        // Création d'un groupe
        GroupeEtudiant groupe1 = new GroupeEtudiant("Groupe A", "Licence 1");
        groupe1.ajouterEtudiant(e1);
        groupe1.ajouterEtudiant(e2);
        groupe1.ajouterEtudiant(e3);

        // Affichage des étudiants du groupe
        groupe1.afficherEtudiants();

        // Affichage des étudiants admis
        groupe1.afficherEtudiantsAdmis();

        // Nombre total d'étudiants dans le groupe
        System.out.println("Nombre d'étudiants dans le groupe : " + groupe1.nombreEtudiants());

        // Nombre total d'étudiants dans l'établissement
        System.out.println("Nombre total des étudiants : " + Etudiant.NbTotalEtudiant());
    }
}


