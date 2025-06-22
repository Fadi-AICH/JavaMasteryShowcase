import java.util.ArrayList;
import java.util.List;

public class Projet {
    int code;
    String sujet;
    int duree;
    List<Programmeur> programmeurs;
    List<ConsommationCafe> consommations;

    public Projet(int code, String sujet, int duree) {
        this.code = code;
        this.sujet = sujet;
        this.duree = duree;
        this.programmeurs = new ArrayList<>();
        this.consommations = new ArrayList<>();
    }

    public void ajouterProgrammeur(Programmeur p) {
        programmeurs.add(p);
    }

    public Programmeur rechercherProgrammeur(int id) {
        for (Programmeur p : programmeurs) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    public void afficherProgrammeur(int id) {
        Programmeur p = rechercherProgrammeur(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Programmeur non trouvé.");
        }
    }

    public void afficherProgrammeurs() {
        for (Programmeur p : programmeurs) {
            System.out.println(p);
        }
    }

    public void supprimerProgrammeur(int id) {
        Programmeur p = rechercherProgrammeur(id);
        if (p != null) {
            programmeurs.remove(p);
            System.out.println("Programmeur supprimé.");
        } else {
            System.out.println("Programmeur non trouvé.");
        }
    }

    public void ajouterConsommation(int semaine, int programmeurId, int nbTasses) {
        consommations.add(new ConsommationCafe(semaine, programmeurId, nbTasses));
    }

    public void changerBureau(int id, int nouveauBureau) {
        Programmeur p = rechercherProgrammeur(id);
        if (p != null) {
            p.setBureau(nouveauBureau);
            System.out.println("Bureau mis à jour.");
        } else {
            System.out.println("Programmeur non trouvé.");
        }
    }

    public void afficherTotalCafesParSemaine(int semaine) {
        int total = 0;
        for (ConsommationCafe c : consommations) {
            if (c.semaine == semaine) {
                total += c.nbTasses;
            }
        }
        System.out.println("Total de tasses de café en semaine " + semaine + " : " + total);
    }
}
