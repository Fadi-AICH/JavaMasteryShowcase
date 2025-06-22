public class Repertoire {
    String nom;
    int nbrFichiers;
    Fichier[] fichiers;

    public Repertoire(String nom) {
        this.nom = nom;
        this.nbrFichiers = 0;
        this.fichiers = new Fichier[30];
    }

    void afficher() {
        System.out.println("Répertoire: " + nom);
        for (int i = 0; i < nbrFichiers; i++) {
            System.out.println(fichiers[i].nom + "." + fichiers[i].extension + " (" + fichiers[i].taille + " KO)");
        }
    }

    int rechercher(String nomFichier) {
        for (int i = 0; i < nbrFichiers; i++) {
            if (fichiers[i].nom.equals(nomFichier)) {
                return i;
            }
        }
        return -1;
    }

    void ajouter(Fichier fichier) {
        if (nbrFichiers < 30) {
            fichiers[nbrFichiers++] = fichier;
        }
    }

    void rechercherPDF() {
        System.out.println("Fichiers PDF dans le répertoire:");
        for (int i = 0; i < nbrFichiers; i++) {
            if (fichiers[i].extension.equalsIgnoreCase("pdf")) {
                System.out.println(fichiers[i].nom + "." + fichiers[i].extension);
            }
        }
    }

    void supprimer(String nomFichier) {
        int index = rechercher(nomFichier);
        if (index != -1) {
            for (int i = index; i < nbrFichiers - 1; i++) {
                fichiers[i] = fichiers[i + 1];
            }
            fichiers[--nbrFichiers] = null;
        }
    }

    void renommer(String nomFichier, String nouveauNom) {
        int index = rechercher(nomFichier);
        if (index != -1) {
            fichiers[index].nom = nouveauNom;
        }
    }

    void modifierTaille(String nomFichier, float nouvelleTaille) {
        int index = rechercher(nomFichier);
        if (index != -1) {
            fichiers[index].taille = nouvelleTaille;
        }
    }

    float getTaille() {
        float tailleTotalKO = 0;
        for (int i = 0; i < nbrFichiers; i++) {
            tailleTotalKO += fichiers[i].taille;
        }
        return tailleTotalKO / 1024; // Conversion en MO
    }
}
