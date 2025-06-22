public class Etudiant {
    private String Cne, Nom, Prenom, Adresse;
    private double moyenne;
    public static int NombresEtudiants=0;

    Etudiant(){NombresEtudiants++;}
    Etudiant(String Cne , String Nom , String Prenom , String Adresse,double moyenne){
        NombresEtudiants++;
        this.moyenne = moyenne;
        this.Cne = Cne;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
    }
    public void Afficher(){
        System.out.println(Cne + " " + Nom + " " + Prenom + " " + Adresse);
    }
    public int NbTotalEtudiant(){
        return NombresEtudiants;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}
