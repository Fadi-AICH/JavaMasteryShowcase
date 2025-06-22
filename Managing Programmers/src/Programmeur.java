public class Programmeur {
    int id;
    String nom;
    String prenom;
    int bureau;

    public Programmeur(int id, String nom, String prenom, int bureau) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }

    public void setBureau(int nouveauBureau) {
        this.bureau = nouveauBureau;

    }

    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Bureau: " + bureau;
    }
}

