public class Employee {
    private String Nom ,Poste ,DateEmbauche ;
    private double salaire;

    public double getSalaire() {
        return salaire;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    Employee(String n , String p , String de, double s){
        Nom=n;
        Poste=p;
        DateEmbauche=de;
        salaire=s;
    }
    public void AfficherInfosEmployee(){
        System.out.println("-> Employee "+Nom+" Son Poste : "+Poste+" Date D'embauche : "+DateEmbauche);
    }
}
