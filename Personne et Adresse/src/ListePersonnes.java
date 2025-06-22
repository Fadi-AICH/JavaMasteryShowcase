public class ListePersonnes {
    private Personne[] Personnes = new Personne[10];

    ListePersonnes(Personne[] P) {
        Personnes = P;
    }
    public Personne[] getPersonnes() {
        return Personnes;
    }
    public void setPersonnes(Personne[] personnes) {
        Personnes = personnes;
    }
    public Personne FindByName(String Nom) {
        for (int i = 0; i < Personnes.length; i++)
            if (Personnes[i].getNom().equals(Nom))
                return Personnes[i];
        return null;
    }
    public boolean FindCodePostal(String cp) {
        for (int i = 0; i < Personnes.length; i++) {
            Adresse Adresses[] = Personnes[i].getAdresses();
            for (int j = 0; j < Adresses.length; j++) {
                if (Adresses[j].getCodePostale().equals(cp)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int CountPersonnesVille(String Ville){
        int compteur = 0;
        for (int i = 0; i < Personnes.length; i++){
            Adresse Adresses[] = Personnes[i].getAdresses();
            for (int j = 0; j < Adresses.length; j++){
                if (Adresses[j].getVille().equals(Ville)){
                    compteur++;
                    break;
                }
            }
        }
        return compteur;
    }
    public void editPersonneNom(String oldNom, String newNom){
        if(oldNom.equals(newNom))return;
        for(int i=0;i<Personnes.length;i++){
            if(Personnes[i].getNom().equals(oldNom)){
                Personnes[i].setNom(newNom);
                System.out.println("1 -> Operation de \"Change Name\" Bien Effectuee...");
            }
        }
    }
    public void editPersonneville(String Nom,String NewVille){
            for(int i=0;i<Personnes.length;i++){
                if(Personnes[i].getNom().equals(Nom)){
                      for(Adresse Adr : Personnes[i].getAdresses()){
                            Adr.setVille(NewVille);
                      }
                }
            }
    }
}
