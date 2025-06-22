public class Formation{
 private String Intitule;
 private int nbrJours;
 public Stagiaire stagiaire[];

    public Formation(String intitule, int nbrJours, Stagiaire [] stagiaires){
        this.Intitule  = intitule;
        this.nbrJours  = nbrJours;
        this.stagiaire = stagiaires;
    }

    public void setStagiaire(Stagiaire[] s){
        this.stagiaire = s;
    }
    public Stagiaire[] getStagiaire(){
        return stagiaire;
    }
    public String getIntitule() {
        return Intitule;
    }
    public void setIntitule(String intitule) {
        Intitule = intitule;
    }
    public int getNbrJours() {
        return nbrJours;
    }
    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }
    public Double CalculerMoyenneFormation(){
        if(stagiaire.length == 0 )return null;
        double sommeMoynnes=stagiaire[0].CalculerMoyenne();
        for(int i=1;i<stagiaire.length;i++)
            sommeMoynnes+=stagiaire[i].CalculerMoyenne();
        return sommeMoynnes/stagiaire.length;
    }
    public Integer getIndexMax(){
        if(stagiaire.length == 0)return null;
        int indiceMax =0;
        for(int i=1;i<stagiaire.length;i++){
            if(stagiaire[i].CalculerMoyenne() > stagiaire[indiceMax].CalculerMoyenne())
                indiceMax = i;
        }
        return indiceMax;
    }
    public void AfficherNomMax(){
        if(stagiaire.length == 0){
            System.out.println("Aucun Stagiaire dans la formation : "+Intitule);
            return;
        }
        int indiceMax = 0;
        for(int i=1;i<stagiaire.length;i++){
            if(stagiaire[i].CalculerMoyenne() > stagiaire[indiceMax].CalculerMoyenne())
                indiceMax = i;
        }
        System.out.println("-> NomMax : "+stagiaire[indiceMax].getNom());
    }
    public void AfficherMinMax(){
        int indiceMax = getIndexMax();
       System.out.println("La note Min de ce stagiaire est : "+stagiaire[indiceMax].TrouverMin());

    }
    public void TrouverMoyenneParNom(String Nom){
        for(int i=0;i<stagiaire.length;i++){
            if(stagiaire[i].getNom().equals(Nom)) {
                System.out.println("-> Moyenne de "+Nom+" est :     "+stagiaire[i].CalculerMoyenne());
                return;
            }
        }
        System.out.println("!! Stagiaire Introuvable !!");
    }

    }

