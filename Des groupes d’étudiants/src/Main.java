public class Main {
    public static void main(String[] args) {
        GroupeEtudiant InformatiqueG2 = new GroupeEtudiant("Genie info groupe 2","3 eme annee",20);
        GroupeEtudiant InformatiqueG1 = new GroupeEtudiant("Genie info groupe 1","3 eme annee",25);

        Etudiant Ilyasse = new Etudiant("I231","Elhamdouchi","Ilyasse","Tanger",18);
        Etudiant Amine = new Etudiant("s214","Chigre","amine","Settat",20);
        Etudiant Mohamed = new Etudiant("p298","Sisen","Mohamed","Kenitra",18);
        Etudiant Nawfal = new Etudiant("o230","Housseni","Nawfal","Beni Mellal",17);

        InformatiqueG2.AfficherInfosGroupe();
        InformatiqueG2.Ajouter(Ilyasse);
        InformatiqueG2.Ajouter(Amine);
        InformatiqueG2.Ajouter(Mohamed);
        InformatiqueG1.Ajouter(Nawfal);

        InformatiqueG1.AfficherInfosGroupe();
        InformatiqueG2.AfficherInfosGroupe();
        InformatiqueG2.ListEtudiant();
        InformatiqueG2.EtudiantValide();

        System.out.println("- Nombre Total Etudiant Dans tous les groupes est : "+InformatiqueG2.NombreTotalEtudiants());

    }
}