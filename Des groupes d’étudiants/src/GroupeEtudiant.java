public class GroupeEtudiant {
    private String Nom , Niveau ;
    private Etudiant Etudiants[];
    private int NombreEtudiants;
    public GroupeEtudiant(){}
    public GroupeEtudiant(String Nom,String Niveau,int tailleGroupe){
        Etudiants = new Etudiant[tailleGroupe];
        this.Nom = Nom;
        this.Niveau = Niveau;
    }
    public void Ajouter(Etudiant Etd){
        if(NombreEtudiants<Etudiants.length){
           Etudiants[NombreEtudiants++] = Etd;
           System.out.println("-> Opperation d'ajout pour "+Nom+" Bien Effectuee...");
            return;
        }
        System.out.println("@ Espace Inssufisant !!");
    }
    public void ListEtudiant(){
        System.out.println("-> Liste Etudiants de "+Nom+" : ");
        for(int i=0;i<NombreEtudiants;i++){
            Etudiants[i].Afficher();
        }
    }
    public void EtudiantValide(){
        System.out.println("-> Etudiants qui dispose d'une Note >= 10 ");
        for(int i=0;i<NombreEtudiants;i++){
            if(Etudiants[i].getMoyenne() >= 10)
                 Etudiants[i].Afficher();
        }
    }
    public int NombreTotalEtudiants(){
        return Etudiant.NombresEtudiants;
    }
    public int NombreEtudiantGroupe(){
        return NombreEtudiants;
    }
    public void AfficherInfosGroupe(){
        System.out.println("- Nom Groupe : "+Nom);
        System.out.println("- Niveau Groupe : "+Niveau);
        System.out.println("- Nombre Etudiants : "+NombreEtudiantGroupe());
    }
}
