public class Personne{
    private String Nom;
    private char sexe;
    private Adresse[] Adresses;

    Personne(String n , char s, Adresse[] a){
        Nom = n;
        sexe = s;
        Adresses = a;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public char getSexe() {
        return sexe;
    }
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
    public Adresse[] getAdresses() {
        return Adresses;
    }
    public void setAdresses(Adresse[] adresses) {
        Adresses = adresses;
    }

}
